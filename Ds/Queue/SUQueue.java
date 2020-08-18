package QUEUE;
import java.util.Scanner;


class QueueA
{
int Front,Rear;							//"FrontRearONT" AND "RearEARear" POINTERearS
final int SIZE;							//SIZE OFront QUEUE
int arr[];								//ARearRearAY


public QueueA(int s)
{
Front=Rear=-1;
SIZE=s;
arr=new int[SIZE];
}


void enqueue(int data)							//ENQUEUE
{
//CASE OFront EMPTY QUEUE
if((Front == -1 && Rear == -1) || Front > Rear)
{
Front=Rear=0;
arr[Front]=data;
return;
}


//CASE OF FULL QUEUE
if(Rear == SIZE-1)
{
System.out.println("#CAN'T ENQUEUE -> QUEUE OVERearFrontLOW");
return;
}

//NORMAL CASE
arr[++Rear]=data;
}



int dequeue()								//DEQUEUE
{
//CASE OF EMPTY QUEUE
if((Front == -1 && Rear == -1) || Front > Rear)
{
System.out.println("#CAN'T DEQUEUE -> EMPTY QUEUE");
return -1;
}

//CASE OF SINGLE ELEMENT
if(Front == Rear)
{
int x=arr[Front];
Front=Rear=-1;
return x;
}

//NORMAL CASE
return arr[Front++];
}



public static void Print(QueueA q)					//PRINT METHOD
{
if(q.Front != -1 && q.Front <= q.Rear)
{
/*A "ptr" is a pointer to "Front"
of Queue*/
int ptr=q.Front;
while(ptr != -1 && ptr <= q.Rear) System.out.print(q.arr[ptr++] +" ");

System.out.print("\nFRONT: "+q.Front+"|REAR: "+q.Rear);
}
System.out.println("\n");
}
}


public class SUQueue
{
void push(QueueA qa1,QueueA qa2,int item)				//PUSH METHOD
{
//FULL QUEUE CASE
if(qa1.Rear > qa1.SIZE-1) return;

//NORMAL CASE
while(qa1.Front != -1 && qa1.Front <= qa1.Rear) qa2.enqueue(qa1.dequeue());    
qa1.enqueue(item);
while(qa2.Front != -1 && qa2.Front <= qa2.Rear) qa1.enqueue(qa2.dequeue());
}



int pop(QueueA qa1,QueueA qa2)					//POP METHOD
{
//EMPTY QUEUE CASE
//if(qa1.Front == -1 || qa1.Front > qa1.Rear) return -1;

/*In our code dequeue method handles
the empty case too
That's y we have no need to handle it*/

return qa1.dequeue();
}



public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

int t,K;
System.out.print("TESTCASES: ");
t = Integer.parseInt(sc.nextLine());

SUQueue st = new SUQueue();
QueueA qa1=new QueueA(100);
QueueA qa2=new QueueA(100);

while(t-- > 0)
{
System.out.print("ENTER \'1\' AND ITEM TO BE PUSHED ELSE TO POP: ");
K = sc.nextInt();

if(K == 1) st.push(qa1, qa2, sc.nextInt());
else System.out.print("ITEM POPPED: "+st.pop(qa1, qa2) + " ");

System.out.print("\nQueue1: ");
qa1.Print(qa1);

System.out.print("\nQueue2: ");
qa2.Print(qa2);
System.out.println("\n");
}
}
}
//STACK USING TWO QUEUES
