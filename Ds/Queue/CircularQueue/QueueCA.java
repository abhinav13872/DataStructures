package CIRCULARQUEUE;
import java.util.Scanner;


public class QueueCA
{
int F,R;									//"FRONT" AND "REAR" POINTERS
final int SIZE;								//SIZE OF QUEUE
int arr[];									//ARRAY



public QueueCA(int s)
{
F=-1;
R=-1;
SIZE=s;
arr=new int[SIZE];
}



private void enqueue(int data)						//ENQUEUE
{
//CASE OF EMPTY QUEUE
if(F == -1 && R == -1)
{
arr[++F]=data;
R++;
return;
}

//CASE OF FULL QUEUE
if((R+1)%SIZE == F)
{
System.out.println("#CAN'T ENQUEUE -> QUEUE OVERFLOW");
return;
}


//NORMAL INSERTION
R=(R+1)%SIZE;
arr[R]=data;
}



private int dequeue()								//DEQUEUE
{
//CASE OF EMPTY QUEUE
if(F == -1 && R == -1)
{
System.out.println("#CAN'T DEQUEUE -> EMPTY QUEUE");
return -1;
}

//CASE OF SINGLE ELEMENT
if(F == R)
{
int element=arr[F];
F=R=-1;
return element;
}

//NORMAL CASE
int element=arr[F];
F=(F+1)%SIZE;
return element;
}



private static void Print(QueueCA q)						//PRINT METHOD
{
System.out.print("\nQUEUE: ");
/*A "ptr" is a pointer to "F"(Front)
of Queue*/
int ptr=q.F;
while(ptr != -1 && ptr <= q.R) System.out.print(q.arr[ptr++] +" ");

System.out.print("\nFRONT: "+q.F+"|REAR: "+q.R);
System.out.println("\n");
}



public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("SIZE OF QUEUE: ");
QueueCA q=new QueueCA(sc.nextInt());

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

Print(q);
}
}
//ARRAY IMPLEMENTATION OF "CIRCULAR QUEUE"
