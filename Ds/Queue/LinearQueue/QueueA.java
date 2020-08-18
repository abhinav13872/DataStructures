package LINEARQUEUE;
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
//CASE OF EMPTY QUEUE
if((F == -1 && R == -1) || F > R)
{
F=R=0;
arr[F]=data;
return;
}


//CASE OF FULL QUEUE
if(R == SIZE-1)
{
System.out.println("#CAN'T ENQUEUE -> QUEUE OVERFLOW");
return;
}

//NORMAL CASE
arr[++R]=data;
}



private int dequeue()								//DEQUEUE
{
//CASE OF EMPTY QUEUE
if((F == -1 && R == -1) || F > R)
{
System.out.println("#CAN'T DEQUEUE -> EMPTY QUEUE");
return -1;
}

//CASE OF SINGLE ELEMENT
if(F == R)
{
int x=arr[F];
F=R=-1;
return x;
}

//NORMAL CASE
return arr[F++];
}



private static void Print(QueueA q)						//PRINT METHOD
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
QueueA q=new QueueA(sc.nextInt());


System.out.print("#NO. OF ELEMENTS TO BE ENQUEUED: ");
int E=sc.nextInt();
while(E-- > 0)
{
System.out.print("ENTER ELEMENT TO BE ENQUEUED: ");
q.enqueue(sc.nextInt());
}

System.out.print("#NO. OF ELEMENTS TO BE DEQUEUED: ");
int D=sc.nextInt();
while(D-- > 0) System.out.println("ELEMENT DEQUEUED: "+q.dequeue());

Print(q);
}
}
//ARRAY IMPLEMENTATION OF "LINEAR QUEUE"
