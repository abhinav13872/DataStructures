package PRIORITYQUEUE;
import java.util.Scanner;


public class PQueueCA2
{
int SIZEP,SIZEQ;
int Front,Rear;
int array[][],trace[][],prty[];
Scanner sc=new Scanner(System.in);

/*"array" STORING EACH QUEUE "queue"
AND THEIR FRONT,REAR IN "arr"**/


public PQueueCA2(int SIZEP,int SIZEQ)
{
this.SIZEP=SIZEP;
this.SIZEQ=SIZEQ;
Front=Rear=-1;

//CREATION OF ARRAYS:-
array=new int[SIZEP][SIZEQ];
trace=new int[SIZEP][2];
prty=new int[SIZEP];

//PRIORITIES:-
System.out.print("ENTER THE PRIORITIES: ");
for(int i=0;i<SIZEP;i++) prty[i]=sc.nextInt();

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
for(i=0;i<SIZEP;i++) if(priority == prty[i]) break;

//CASE OF INVALID SIZE
if(SIZEQ <= 0 || SIZEP <= 0)
{
System.out.println("#ITEM \'"+item+"\' CAN'T BE ENQUEUED -> QUEUE OVERFLOW");
return;
}

//CASE OF FULL QUEUE
if((trace[i][1]+1)%SIZEQ == trace[i][0])
{

while(i <= SIZEP-1)
{
if((trace[i][1]+1)%SIZEQ != trace[i][0]) break;
i++;
}
System.out.println("==========>i: "+i);

//CASE OF FULL PRIORITY QUEUE
if(i >= SIZEP)
{
System.out.println("#ITEM \'"+item+"\' CAN'T BE ENQUEUED -> QUEUE OVERFLOW");
return;
}

}

//CASE OF EMPTY QUEUE
if(trace[i][0] == -1 && trace[i][1] == -1)
{
trace[i][0]=trace[i][1]=0;
array[i][0]=item;
return;
}

//NORMAL INSERTION
trace[i][1]=(trace[i][1]+1)%SIZEQ;
int x=trace[i][1];
array[i][x]=item;
return;
}



int dequeue(int priority)
{
int l=0;
for(l=0;l<SIZEP;l++) if(priority == prty[l]) break;


//CASE OF INVALID SIZE
if(SIZEQ <= 0 || SIZEP <= 0)
{
System.out.println("#CAN'T DEQUEUE -> QUEUE UNDERFLOW");
return -1;
}

//CASE OF EMPTY QUEUE
if((trace[l][0] == -1 && trace[l][1] == -1))
{
while(l <= SIZEP-1)
{
if(trace[l][0] != -1 && trace[l][1] != -1) break;
l++;
}

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



static void Print(PQueueCA2 q)
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
PQueueCA2 q=new PQueueCA2(sc.nextInt(),sc.nextInt());

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
CASE-2:
WHEN WE HAVE BEEN MENTIONED THAT IN:-
->CASE OF INSERTION IF OVERFLOW EXISTS
  THEN INSERT IN NEXT PRIORITY's QUEUE
->CASE OF DELETION IF UNDERFLOW EXISTS
  THEN DELETE FROM THE NEXT PRIORITY's
  QUEUE
*/
