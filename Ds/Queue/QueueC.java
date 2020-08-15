package QUEUE;
import java.util.Scanner;


public class QueueC
{
int F,R;									//"FRONT" AND "REAR" POINTERS
final int SIZE;								//SIZE OF QUEUE
int arr[];									//ARRAY


public QueueC(int s)
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

//NORMAL INSERTION
R=(R+1)%SIZE;
arr[R]=data;
}


private int dequeue()								//DEQUEUE
{
//CASE OF EMPTY QUEUE
if(this.isEmpty())
{
System.out.println("#CAN'T DEQUEUE -> EMPTY QUEUE");
return -1;
}

//NORMAL CASE
if(F != R)
{
int element=arr[F];
F=(F+1)%SIZE;
return element;
}

//CASE OF SINGLE ELEMENT [F == R]
int element=arr[F];
F=R=-1;
return element;
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
return ((R+1)%SIZE == F);
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("SIZE OF QUEUE: ");
QueueC q=new QueueC(sc.nextInt());

System.out.print("ENTER ELEMENT TO BE ENQUEUED: ");
q.enqueue(sc.nextInt());

System.out.print("ENTER ELEMENT TO BE ENQUEUED: ");
q.enqueue(sc.nextInt());

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


/*NOW USING CIRCULAR QUEUE WE CAN
ENQUEUE NEW ELEMENT AFTER THIS
SINCE QUEUE IS ACTLY NOT FULL*/

System.out.print("ENTER ELEMENT TO BE ENQUEUED: ");
q.enqueue(sc.nextInt());

System.out.println("ELEMENT DEQUEUED: "+q.dequeue());
System.out.println("ELEMENT DEQUEUED: "+q.dequeue());
System.out.println("ELEMENT DEQUEUED: "+q.dequeue());
}
}
//ARRAY IMPLEMENTATION OF "CIRCULAR QUEUE"
