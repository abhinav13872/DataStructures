package QUEUE;
import java.util.Scanner;
public class Queue2
{
final int size;
int arr[];
int front=-1,rear=-1;

public Queue2(int size,int arr[])
{
this.size=size;
this.arr=arr;
}


void enqueue(int data)
{
if(this.isEmpty())
{
front++;
rear++;
arr[rear]=data;
}

else if((rear+1)%size == front)
{
System.out.println("#CAN'T ENQUEUE -> QUEUE IS FULL!!");
}

else
{
rear=(rear+1)%size;
arr[rear]=data;
}
}


int dequeue()
{
if(this.isEmpty())
{
System.out.println("#CAN'T DEQUEUE -> QUEUE IS EMPTY!!");
return -1;
}

if(front == rear)
{
int x=arr[front];
front=-1;
rear=-1;
return x;
}

int x=arr[front];
front=(front+1)%size;
return x;
}


int peek()
{
if(this.isEmpty())
{
System.out.println("#NO PEEK ELEMENT -> QUEUE IS EMPTY!!");
return -1;
}
return arr[front];
}


boolean isEmpty()
{
return (front == -1 && rear == -1);
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("SCAN SIZE OF QUEUE: ");
int n=sc.nextInt();
int arr[]=new int[n];

Queue2 cq=new Queue2(n,arr);

System.out.print("SCAN DATA: ");
for(int i=0;i<n;i++)
cq.enqueue(sc.nextInt());



System.out.println("ELEMENT DEQUEUED: "+cq.dequeue());
System.out.println("ELEMENT DEQUEUED: "+cq.dequeue());

System.out.print("SCAN DATA TO BE PUSHED: ");
cq.enqueue(sc.nextInt());

//System.out.print("SCAN DATA TO BE PUSHED: ");
//cq.enqueue(sc.nextInt());


System.out.println("front_index: "+cq.front);
System.out.println("rear_index: "+cq.rear);
System.out.println("PEEK: "+cq.peek());

}
}
/*
CIRCULAR QUEUE

=> With this we can add the element after polling chahey front size
   ke equal bhi hojae
*/
