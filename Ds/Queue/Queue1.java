package QUEUE;
public class Queue1
{
final int size=10;
int front=-1,rear=-1;
int arr[]=new int[size];

void enqueue(int data)
{
if(this.isEmpty())
{
front++;
rear++;
arr[rear]=data;
}
else if(rear == size-1)
{
System.out.println("#CAN'T ENQUEUE -> QUEUE IS FULL!!");
}
else
{
arr[++rear]=data;
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
/*
agr front == rear mtlb ek hi element h queue mein
so khali krdo queue ko!!
*/
int x=arr[front];
front=-1;
rear=-1;
return x;
}
return arr[front++];
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
Queue1 q=new Queue1();
q.enqueue(5);
q.enqueue(6);
q.enqueue(7);
q.dequeue();
q.dequeue();
q.dequeue();
System.out.println("EMPTY_QUEUE: "+q.isEmpty());
System.out.println("PEEK: "+q.peek());
}
}
/*
ARRAYS IMPLEMENTATION OF QUEUE
*/
