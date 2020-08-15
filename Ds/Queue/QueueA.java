package QUEUE;
import java.util.Scanner;


public class QueueA
{
int F,R;									//"FRONT" AND "REAR" POINTERS
final int SIZE;								//SIZE OF QUEUE
int arr[];									//ARRAY


public QueueA(int s)
{
F=-1;
R=-1;
SIZE=s;
arr=new int[SIZE];
}


private void enqueue(int data)						//ENQUEUE
{
//CASE OF FULL QUEUE
if(this.isFull())
{
System.out.println("#CAN'T ENQUEUE -> QUEUE OVERFLOW");
return;
}

//CASE OF EMPTY QUEUE
if(this.isEmpty())
{
arr[++F]=data;
R++;
return;
}

//CASE OF SINGLE ELEMENT [F == R]
arr[++R]=data;
}


private int dequeue()								//DEQUEUE
{
//CASE OF EMPTY QUEUE
if(this.isEmpty())
{
System.out.println("#CAN'T DEQUEUE -> EMPTY QUEUE");
return -1;
}

//CASE OF SINGLE ELEMENT
if(F == R)
{
int element=arr[F];
F=-1;
R=-1;
return element;
}
return arr[F++];
}


private int peek()								//PEEK
{
if(this.isEmpty())
{
System.out.println("#CAN'T GET PEEK -> QUEUE IS EMPTY");
return -1;
}
return arr[F];
}


private boolean isEmpty()							//EMPTY CHECK
{
return (F == -1 && R == -1);
}


private boolean isFull()							//FULL CHECK
{
return (R == SIZE-1);
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("SIZE OF QUEUE: ");
QueueA q=new QueueA(sc.nextInt());

System.out.print("ENTER ELEMENT TO BE ENQUEUED: ");
q.enqueue(sc.nextInt());

System.out.print("ENTER ELEMENT TO BE ENQUEUED: ");
q.enqueue(sc.nextInt());

System.out.print("ENTER ELEMENT TO BE ENQUEUED: ");
q.enqueue(sc.nextInt());

System.out.println("ELEMENT DEQUEUED: "+q.dequeue());
System.out.println("ELEMENT DEQUEUED: "+q.dequeue());
System.out.println("ELEMENT DEQUEUED: "+q.dequeue());
System.out.println("ELEMENT DEQUEUED: "+q.dequeue());
}
}
//ARRAY IMPLEMENTATION OF "LINEAR QUEUE"
