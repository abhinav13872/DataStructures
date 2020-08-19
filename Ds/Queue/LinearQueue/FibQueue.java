package LINEARQUEUE;
import java.util.Scanner;


public class FibQueue
{
int F,R;									//"FRONT" AND "REAR" POINTERS
final int SIZE;								//SIZE OF QUEUE
int arr[];									//ARRAY


public FibQueue(int s)
{
F=-1;
R=-1;
SIZE=s;
arr=new int[SIZE];
}


private void enqueue(int data)						//ENQUEUE
{
//CASE OF FULL QUEUE
if(R == SIZE-1)
{
System.out.println("#CAN'T ENQUEUE -> QUEUE OVERFLOW");
return;
}

//CASE OF EMPTY QUEUE
if((F == -1 && R == -1) || F > R)
{
F=R=0;
arr[F]=data;
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



private static int fibonacciSeries(FibQueue q,int n)				//FIBONAACI-SERIES METHOD
{
/*
STEP-1: ENQUEUE CURRENT FIBONACCI
STEP-2: ENQUEUE NEXT FIBONACCI
*/
q.enqueue(0);
q.enqueue(1);

for(int i=0;i<n;i++)
{
int n1=q.dequeue();
int n2=q.dequeue();

q.enqueue(n2);
q.enqueue(n1+n2);
}
return q.dequeue();
} 



private static void Print(FibQueue q)						//PRINT METHOD
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
FibQueue q=new FibQueue(sc.nextInt());

System.out.print("ENTER THE POSITION FOR FIBONACCI SERIES: ");
int P=sc.nextInt();
System.out.println("FIBONACCI OF \'"+P+"\' is: "+fibonacciSeries(q,P));
}
}
//ARRAY IMPLEMENTATION OF "LINEAR QUEUE"
