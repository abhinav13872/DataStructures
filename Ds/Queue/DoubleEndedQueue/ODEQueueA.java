package DOUBLEENDEDQUEUE;
import java.util.Scanner;


public class ODEQueueA
{
int L,R;									//"LEFT" AND "RIGHT" POINTERS
int SIZE;									//SIZE OF QUEUE
int arr[];									//ARRAY
Scanner sc=new Scanner(System.in);


public ODEQueueA(int s)
{
L=R=-1;
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
if((L == -1 && R == -1) || L > R)
{
L=R=0;
arr[L]=data;
return;
}

//NORMAL CASE
arr[++R]=data;
}



private int dequeue()								//DEQUEUE
{
//CASE OF EMPTY QUEUE
if((L == -1 && R == -1) || L > R)
{
System.out.println("#CAN'T DEQUEUE -> EMPTY QUEUE");
return -1;
}

//CASE OF SINGLE ELEMENT
if(L == R)
{
int x=arr[L];
L=R=-1;
return x;
}

//NORMAL CASE
return arr[L++];
}



void OutputRest(String str)							//OUTPUT RESTRICTION
{
/*
->DELETION CAN BE DONE FROM
USER'S SCANNED DIRECTION ONLY

->INSERTION CAN BE DONE FROM
ANY SIDE
**/

System.out.print("PRESS KEY \'1\' FOR INSERTION REST FOR DELETION: ");
int Operation=sc.nextInt();

if(Operation != 1)
{
//CASE OF DELETION:-

//DELETION FROM LEFT
if(str.equals("left"))
{
//EMPTY CASE
if((L == -1 && R == -1) || L > R)
{
System.out.println("NOTHING TO DEQUEUE -> QUEUE UNDERFLOW");
return; 
}

//SINGLE ELEMENT CASE
if(L == R)
{
int x=arr[L];
System.out.println("ELEMENT DEQUEUED FROM LEFT: "+x);
L=R=-1;
return;
}

//NORMAL CASE[L != R]
else
{
System.out.println("ELEMENT DEQUEUED FROM LEFT: "+arr[L++]);
return;
}
}

//DELETION FROM RIGHT
else if(str.equals("right"))
{
//EMPTY CASE
if((L == -1 && R == -1) || L > R)
{
System.out.println("NOTHING TO DEQUEUE -> QUEUE UNDERFLOW");
return; 
}

//SINGLE ELEMENT CASE
if(L == R)
{
int x=arr[L];
System.out.println("ELEMENT DEQUEUED FROM RIGHT: "+x);
L=R=-1;
return;
}

//NORMAL CASE[L != R]
else
{
System.out.println("ELEMENT DEQUEUED FROM RIGHT: "+arr[R--]);
return;
}
}

//INVALID DIRECTION
else System.out.println("#INVALID DIRECTION FOR DELETION");
}


else
{
//CASE OF INSERTION:-
System.out.print("ENTER THE \"DIRECTION\" AND \"ITEM\" FOR INSERTION: ");
String dir=sc.next();
int item=sc.nextInt();
System.out.println("ITEM SCANNED: "+item);

//INSERTION FROM LEFT
if(dir.equals("left"))
{
//EMPTY QUEUE
if((L == -1 && R == -1) || L > R)
{
L=R=0;
arr[L]=item;
}

//NORMAL CASE
if(R != SIZE-1)
{
int index=R;
while(index != -1 && index != (L-1)) arr[index+1]=arr[index--];
arr[L]=item;

//THEREFORE RIGHT POINTER HAS TO BE UPDATED
R++;
}

//FULL QUEUE CASE
else System.out.println("CAN'T ENQUEUE -> QUEUE OVERFLOW");
return;
}

//INSERTION FROM RIGHT:-
else if(dir.equals("right"))
{
//EMPTY QUEUE
if((L == -1 && R == -1) || L > R)
{
L=R=0;
arr[L]=item;
}

//NORMAL CASE
else if(R != SIZE-1) arr[++R]=item;

//FULL QUEUE CASE
else System.out.println("CAN'T ENQUEUE -> QUEUE OVERFLOW");
return;
}

//INVALID DIRECTION
else System.out.println("#INVALID DIRECTION FOR INSERTION");
}
}



static void Print(ODEQueueA q)							//PRINT
{
System.out.print("DOUBLE_ENDED_QUEUE: ");
int index=q.L;
while(index != -1 && index <= q.R) System.out.print(q.arr[index++]+" ");
System.out.println("\n");
}



public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("SIZE OF QUEUE: ");
ODEQueueA q=new ODEQueueA(sc.nextInt());

System.out.print("#NO. OF ELEMENTS TO BE ENQUEUED: ");
int E=sc.nextInt();
while(E-- > 0)
{
System.out.print("ENTER ELEMENT TO BE ENQUEUED: ");
q.enqueue(sc.nextInt());
}
Print(q);

System.out.print("ENTER THE DIRECTION FOR OUTPUT[DELETION] RESTRICTION: ");
q.OutputRest(sc.next());

Print(q);
}
}
//OUTPUT_DOUBLE_ENDED_QUEUE
