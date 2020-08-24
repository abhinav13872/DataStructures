package PRIORITYQUEUE;
import java.util.Scanner;


public class PQueueCA1
{
int SIZEP,SIZEQ;
int array[][],trace[][],prty[];
Scanner sc=new Scanner(System.in);

/*"array" STORING EACH QUEUE "queue"
AND THEIR FRONT,REAR IN "arr"**/


public PQueueCA1(int SIZEP,int SIZEQ)
{
this.SIZEP=SIZEP;
this.SIZEQ=SIZEQ;

//CREATION OF ARRAYS:-
array=new int[SIZEP][SIZEQ];
trace=new int[SIZEP][2];
prty=new int[SIZEP];

//PRIORITIES:-
System.out.print("ENTER THE PRIORITIES: ");
for(int i=0;i<SIZEP;i++)
prty[i]=sc.nextInt();

//PRE-FILLING OF ARRAYS:-
for(int i=0;i<SIZEP;i++)
for(int j=0;j<SIZEQ;j++)
array[i][j]=-1;

for(int i=0;i<SIZEP;i++)
for(int j=0;j<2;j++)
trace[i][j]=-1;
}



void enqueue(int priority,int item) 
{
int i=0;
for(i=0;i<prty.length;i++) if(priority == prty[i]) break;

//INVALID PRIORITY CASE
if(priority != prty[i])
{
System.out.println("#INVALID PRIORITY -> CAN'T ENQUEUE");
return;
}

//FULL QUEUE CASE
if(SIZEQ == 0 || (trace[i][1]+1)%SIZEQ == trace[i][0])
{
System.out.println("ITEM \'"+item+"\'CAN'T BE ENQUEUED -> QUEUE OVERFLOW");
return;
}

//EMPTY QUEUE CASE
if(trace[i][0] == -1 && trace[i][1] == -1)
{
int x=trace[i][0]=trace[i][1]=0;
array[i][x]=item;
return;
}

//NORMAL INSERTION CASE
int x=trace[i][1]=(trace[i][1]+1)%SIZEQ;
array[i][x]=item;
}



int dequeue(int priority)
{
int i=0;
for(i=0;i<prty.length;i++) if(priority == prty[i]) break;

//INVALID PRIORITY CASE
if(priority != prty[i])
{
System.out.println("#INVALID PRIORITY -> CAN'T ENQUEUE");
return -1;
}

//EMPTY QUEUE CASE
if(trace[i][0] == -1 && trace[i][1] == -1)
{
System.out.println("#CAN'T DEQUEUE -> QUEUE UNDERFLOW");
return -1;
}

//NORMAL DELETION
if(trace[i][0] != trace[i][1])
{
int x=trace[i][0];
int element=array[i][x];
array[i][x]=-1;
trace[i][0]=(trace[i][0]+1)%SIZEQ;
return element;
}

//SINGLE ELEMENT DELETION CASE
int x=trace[i][0];
int element=array[i][x];
array[i][x]=-1;
trace[i][0]=trace[i][1]=-1;
return element;
}



static void Print(PQueueCA1 q)
{
System.out.println("\n<=============================>");
System.out.println("PRIORITY QUEUE:-");
for(int i[] : q.array)
{
for(int j : i) System.out.print(j+"	");
System.out.println();
}

System.out.println();

for(int i[] : q.trace)
{
System.out.print("TRACE: ");
for(int j : i) System.out.print(j+"	");
System.out.println();
}
System.out.println("<=============================>\n");
}



public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("SIZE NO. OF QUEUES AND SIZE OF QUEUE: ");
PQueueCA1 q=new PQueueCA1(sc.nextInt(),sc.nextInt());

System.out.print("ENTER THE NO. OF ELEMENTS TO BE ENQUEUED: ");
int E=sc.nextInt();

while(E-- > 0)
{
System.out.print("PRIORITY AND ELEMENT FOR INSERTION: ");
q.enqueue(sc.nextInt(),sc.nextInt());
}
Print(q);

System.out.print("ENTER THE NO. OF ELEMENTS TO BE DEQUEUED: ");
int D=sc.nextInt();
while(D-- > 0)
{
System.out.print("PRIORITY FOR DELETION: ");
int p=sc.nextInt();
System.out.println("ELEMENT DEQUEUED: "+q.dequeue(p));
}
Print(q);

System.out.print("ENTER THE NO. OF ELEMENTS TO BE ENQUEUED: ");
E=sc.nextInt();
while(E-- > 0)
{
System.out.print("PRIORITY AND ELEMENT FOR INSERTION: ");
q.enqueue(sc.nextInt(),sc.nextInt());
}
Print(q);
}
}
/*
/*
#ARRAY IMPLEMENTATION OF "PRIORITYQUEUE" [USING CIRCULARQUEUE]

CASE-1:
#1.INSERTION AND DELETION WILL TAKES PLACE
   ACCORDING TO THE PRIORITY SPECIFIED..

#2.IF CASE OF UNDERFLOW OCCURS FOR A SPECIFIED
   PRIORITY THEN RAISE THE UNDERFLOW EXCEPTION

#3.IF CASE OF OVERFLOW OCCURS FOR A SPECIFIED
   PRIORITY THEN RAISE THE OVERFLOW EXCEPTION
*/
