package PRIORITYQUEUE;
import java.util.Scanner;


public class PQueueA
{
int SIZEP,SIZEQ;
int Front,Rear;
int array[][],trace[][];

/*"array" STORING EACH QUEUE "queue"
AND THEIR FRONT,REAR IN "arr"**/


public PQueueA(int SIZEP,int SIZEQ)
{
this.SIZEP=SIZEP;
this.SIZEQ=SIZEQ;
Front=Rear=-1;

//CREATION OF ARRAYS:-
array=new int[SIZEP][SIZEQ];
trace=new int[SIZEP][2];

//PRE-FILLING OF ARRAYS:-
for(int i=0;i<SIZEP;i++)
for(int j=0;j<SIZEQ;j++)
array[i][j]=-1;

for(int i=0;i<SIZEP;i++)
for(int j=0;j<2;j++)
trace[i][j]=-1;
}



int i;

void enqueue(int item)
{
//CASE OF INVALID SIZE
if(SIZEQ <= 0 || SIZEP <= 0)
{
System.out.println("#ITEM \'"+item+"\' CAN'T BE ENQUEUED -> QUEUE OVERFLOW");
return;
}

//CASE OF FULL QUEUE
if(SIZEQ != 0 && (Rear+1)%SIZEQ == Front)
{
//System.out.println("======>i: "+i+"|REAR: "+Rear+"|FRONT: "+Front);
i++;

//CASE OF FULL PRIORITY QUEUE
if(i == SIZEP)
{
System.out.println("#ITEM \'"+item+"\' CAN'T BE ENQUEUED -> QUEUE OVERFLOW");
return;
}
}

//CASE OF EMPTY QUEUE
if(trace[i][0] == -1 && trace[i][1] == -1)
{
Front=Rear=trace[i][0]=trace[i][1]=0;
array[i][Rear]=item;
//System.out.println("======>i: "+i+"|REAR: "+Rear+"|FRONT: "+Front);
return;
}

//NORMAL INSERTION
Rear=trace[i][1]=(trace[i][1]+1)%SIZEQ;
array[i][Rear]=item;
//System.out.println("======>i: "+i+"|REAR: "+Rear+"|FRONT: "+Front);
return;
}



int l;
int dequeue()
{
//CASE OF INVALID SIZE
if(SIZEQ <= 0 || SIZEP <= 0)
{
System.out.println("#CAN'T DEQUEUE -> QUEUE UNDERFLOW");
return -1;
}

//CASE OF EMPTY QUEUE
if(trace[l][0] == -1 && trace[l][1] == -1)
{
l++;
if(l == SIZEP)
{
System.out.println("#CAN'T DEQUEUE -> QUEUE UNDERFLOW");
return -1;
}
}

//CASE OF SINGLE ELEMENT
if(trace[l][0] == trace[l][1])
{
int x=trace[l][0];
int element=array[l][x];
array[l][x]=-1;
trace[l][0]=trace[l][1]=-1;
return element;
}

//NORMAL CASE
int x=trace[l][0];
int element=array[l][x];
array[l][x]=-1;
trace[l][0]=(trace[l][0]+1)%SIZEQ;
return element;
}



static void Print(PQueueA q)
{
System.out.println("PRIORITY QUEUE:-");
for(int i[] : q.array)
{
System.out.print("QUEUE: ");
for(int j : i) System.out.print(j+" ");
System.out.println();
}


for(int i[] : q.trace)
{
System.out.print("TRACE: ");
for(int j : i) System.out.print(j+" ");
System.out.println();
}
System.out.println();
}



public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("SIZE NO. OF QUEUES AND SIZE OF QUEUE: ");
PQueueA q=new PQueueA(sc.nextInt(),sc.nextInt());

System.out.print("ENTER THE NO. OF ELEMENTS TO BE ENQUEUED: ");
int E=sc.nextInt();

System.out.print("SCAN ELEMENTS TO BE ENQUEUED: ");
while(E-- > 0) q.enqueue(sc.nextInt());
Print(q);

System.out.print("ENTER THE NO. OF ELEMENTS TO BE DEQUEUED: ");
int D=sc.nextInt();
while(D-- > 0) System.out.println("ELEMENT DEQUEUED: "+q.dequeue());
Print(q);
}
}
