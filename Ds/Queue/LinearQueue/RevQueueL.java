package LINEARQUEUE;
import java.util.Scanner;
import java.util.Stack;


public class RevQueueL
{
/*Front and Rear Are The
Pointers To First And The
Last Node Respectively*/
Node Front,Rear;


void enqueue(int data)						//ENQUEUE [INSERTION AT END]
{
if(Front != null)
{
//NORMAL CASE:
Rear=Front;
while(Rear.next != null) Rear=Rear.next;

Rear.next=new Node(data);
Rear=Rear.next;
return;
}

//CASE OF EMPTY QUEUE:
Front=Rear=new Node(data);
}



int dequeue()							//DEQUEUE [DELETION AT BEGINNING]
{
if(Front != null)
{
//CASE OF SINGLE ELEMENT:
if(Front == Rear)
{
int x=Front.data;
Front=Rear=null;
return x;
}

int x=Front.data;
Front=Front.next;
return x;
}

//CASE OF EMPTY QUEUE:
System.out.println("#NOTHING TO DEQUEUE -> QUEUE UNDERFLOW");
return -1;
}



void reverseQueue(RevQueueL q)
{
System.out.print("#REVERSING QUEUE:- ");
if(q.Front != null)
{
/*
STEP-1: DEQUEUE EVERY ELEMENT AND
	PUSH TO STACK
STEP-2: POP EVEY ENTRY AND ENQUEUE
	TO QUEUE*/
	
Stack<Integer> s=new Stack<>();
while(q.Front != null && q.Front.next != null) s.push(q.dequeue());

while(!s.isEmpty()) q.enqueue(s.pop());
return;
}
System.out.print("#NOTHING TO REVERSE -> QUEUE UNDERFLOW");
}



private void reverseKElementsOfQueue(RevQueueL q,int K)				//REVERSE K ELEMENTS OF QUEUE
{
System.out.print("#REVERSING QUEUE:- ");
if(q.Front != null)
{
/*
STEP-1: DEQUEUE EACH ELEMENT AND
	PUSH TO STACK TILL "K" TIMES
STEP-2: DEQUEUE REMAINING ELEMENTS
	AND ENQUEUE TO ANOTHER QUEUE
STEP-3: POP EACH ELEMENT FROM STACK
	AND ENQUEUE TO QUEUE
STEP-4: DEQUEUE THE ELEMENTS OF ANOTHER
	QUEUE AND ENQUEUE IN MAIN QUEUE
**/

Stack<Integer> s=new Stack<>();
RevQueueL q2=new RevQueueL();

while(q.Front != null && K-- != 0) s.push(q.dequeue());

while(q.Front != null) q2.enqueue(q.dequeue());

while(!s.isEmpty()) q.enqueue(s.pop());

while(q2.Front != null) q.enqueue(q2.dequeue());
return;
}
System.out.println("NOTHING TO REVERSE -> QUEUE UNDERFLOW");
}



static void Print(RevQueueL q)					//PRINT METHOD
{
System.out.print("\nQUEUE: ");

Node ptr=q.Front;

if(ptr != null)
{
while(ptr != null)
{
System.out.print(ptr.data+" ");
ptr=ptr.next;
}
System.out.print("\nFRONT: "+q.Front.data+"|REAR: "+q.Rear.data);
}

System.out.println("\n");
}



public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
RevQueueL q=new RevQueueL();

//ELEMENTS TO BE ENQUEUED:
System.out.print("NO. OF ELEMENTS TO BE ENQUEUED: ");
int n=sc.nextInt();

if(n > 0) System.out.print("ENTER THE ELEMENTS TO BE ENQUEUED: ");
while(n-- > 0) q.enqueue(sc.nextInt());
Print(q);

//ELEMENTS TO BE DEQUEUED:
System.out.print("NO. OF ELEMENTS TO BE DEQUEUED: ");
n=sc.nextInt();
while(n-- > 0) System.out.println("ELEMENT DEQUEUED: "+q.dequeue());
Print(q);

/*q.reverseQueue(q);
Print(q);*/

System.out.print("NO. OF ENTRIES TO BE REVERSED: ");
q.reverseKElementsOfQueue(q,sc.nextInt());
Print(q);
}
}



class Node
{
int data;
Node next;
public Node(int data)
{
this.data=data;
}
}
//REVERSE QUEUE[LINKEDLIST IMPLENTATION]
