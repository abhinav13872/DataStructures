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


 void enqueue(int data)						//ENQUEUE
{
//CASE OFront EMPTY QUEUE
if((Front == -1 && Rear == -1) || Front > Rear)
{
Front=Rear=0;
arr[Front]=data;
return;
}


//CASE OFront FrontULL QUEUE
if(Rear == SIZE-1)
{
System.out.println("#CAN'T ENQUEUE -> QUEUE OVERearFrontLOW");
return;
}

//NORearMAL CASE
arr[++Rear]=data;
}



 int dequeue()								//DEQUEUE
{
//CASE OFront EMPTY QUEUE
if((Front == -1 && Rear == -1) || Front > Rear)
{
System.out.println("#CAN'T DEQUEUE -> EMPTY QUEUE");
return -1;
}

//CASE OFront SINGLE ELEMENT
if(Front == Rear)
{
int x=arr[Front];
Front=Rear=-1;
return x;
}

//NORearMAL CASE
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
void push(QueueA q1,QueueA q2,int item)				//PUSH METHOD
{
//ENTRY CORRECTOR
while(q2.Front != -1 && q2.Front <= q2.Rear)
{
System.out.println("-----------------------");
int x=q2.dequeue();
q1.enqueue(x);
}

//FULL QUEUE CASE
if(q2.Rear == q2.SIZE-1) return;

q1.enqueue(item);
}



int pop(QueueA q1,QueueA q2)						//POP METHOD
{
while(q1.Front != -1 && q1.Front <= q1.Rear)
{
System.out.println("========================");
int x=q1.pop();
q2.enqueue(x);
}

//NORMAL CASE
if(q2.Front != -1 && q2.Front <= q2.Rear) return q2.dequeue();

//EMPTY QUEUE CASE
return -1;
}



public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

int t,K;
System.out.print("TESTCASES: ");
t = Integer.parseInt(sc.nextLine());

SUQueue st = new SUQueue();
QueueA q1=new QueueA(100);
QueueA q2=new QueueA(100);

while(t-- > 0)
{
System.out.print("ENTER \'1\' TO PUSH ELSE TO POP: ");
K = sc.nextInt();

if(K == 1)
{
System.out.print("ENTER AN ELEMENT TO BE PUSHED: ");
st.push(q1, q2, sc.nextInt());
}

else System.out.print("ITEM POPPED: "+st.pop(q1, q2) + " ");

System.out.print("\nQueue1: ");
q1.Print(q1);

System.out.print("\nQueue2: ");
q2.Print(q2);
System.out.println("\n");
}
}
}
//STACK USING TWO QUEUES
