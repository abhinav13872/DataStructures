package QUEUE;
import java.util.Scanner;
import java.util.Stack;



public class RevQueueA
{
int F,R;									//"FRONT" AND "REAR" POINTERS
final int SIZE;								//SIZE OF QUEUE
int arr[];									//ARRAY



public RevQueueA(int s)
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



private void reverseQueue(RevQueueA q)						//REVERSE QUEUE
{
if(q.F != -1 && q.F <= q.R)
{
/*
STEP-1: DEQUEUE EACH ELEMENT AND
	PUSH TO STACK
STEP-2: POP EACH ELEMENT FROM STACK
	AND ENQUEUE TO QUEUE
**/

Stack<Integer> s=new Stack<>();

while(q.F != -1 && q.F <= q.R) s.push(q.dequeue());

while(!s.isEmpty()) q.enqueue(s.pop());
return;
}
System.out.println("NOTHING TO REVERSE -> QUEUE UNDERFLOW");
}



private static void Print(RevQueueA q)						//PRINT METHOD
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
RevQueueA q=new RevQueueA(sc.nextInt());


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
Print(q);

System.out.print("#REVERSING QUEUE:- ");
q.reverseQueue(q);
Print(q);
}
}
//REVERSE "LINEAR QUEUE"
