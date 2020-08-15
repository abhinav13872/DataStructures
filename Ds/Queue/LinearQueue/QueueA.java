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
return arr[F++];
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

System.out.println("FRONT: "+q.F);
System.out.println("REAR: "+q.R);

}
}
//ARRAY IMPLEMENTATION OF "LINEAR QUEUE"
