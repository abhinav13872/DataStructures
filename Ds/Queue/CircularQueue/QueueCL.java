package CIRCULARQUEUE;
import java.util.Scanner;


public class QueueCL
{
Node Front;
Node Rear;


void enqueue(int data)						//ENQUEUE [INSERTION AT END]
{
if(Front != null)
{
//NORMAL CASE:
Rear=Front;
while(Rear.next != Front) Rear=Rear.next;

Rear.next=new Node(data);
Rear=Rear.next;
Rear.next=Front;
return;
}

//CASE OF EMPTY QUEUE:
Front=Rear=new Node(data);
Front.next=Front;
}



int dequeue()							//DEQUEUE [DELETION AT BEGINNING]
{
if(Front != null)
{
//CASE OF SINGLE ELEMENT:
if(Front == Rear)
{
int x=Front.data;
Front.next=Rear.next=null;
Front=Rear=null;
return x;
}

int x=Front.data;
Front=Front.next;
Rear.next=Front;
return x;
}

//CASE OF EMPTY QUEUE:
System.out.println("#NOTHING TO DEQUEUE -> QUEUE UNDERFLOW");
return -1;
}



static void Print(QueueCL q)					//PRINT METHOD
{
System.out.print("\nQUEUE: ");

Node ptr=q.Front;

if(ptr != null)
{
do
{
System.out.print(ptr.data+" ");
ptr=ptr.next;
}
while(ptr != q.Front);
System.out.print("\nFRONT: "+q.Front.data+"|REAR: "+q.Rear.data);
}
System.out.println("\n");
}



public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
QueueCL q=new QueueCL();

System.out.print("NO. OF ELEMENTS TO BE ENQUEUED: ");
int n=sc.nextInt();

if(n > 0) System.out.print("ENTER THE ELEMENTS TO BE ENQUEUED: ");
while(n-- > 0) q.enqueue(sc.nextInt());

Print(q);

System.out.print("NO. OF ELEMENTS TO BE DEQUEUED: ");
n=sc.nextInt();
while(n-- > 0) System.out.println("ELEMENT DEQUEUED: "+q.dequeue());

Print(q);
}
}



class Node
{
int data;
Node next;

public Node(int data)
{
this.data=data;
}
}
//CIRCULAR LINKEDLIST IMPLENTATION OF QUEUE
