package DOUBLEENDEDQUEUE;
import java.util.Scanner;


class Node
{
int data;									//NODE's DATA
Node prev;									//NODE's PREVIOUS LINK
Node next;									//NODE's NEXT LINK

public Node(int data)
{
this.data=data;
prev=null;
next=null;
}
}



public class ODEQueueDL
{
Node Left,Right;								//"LEFT" AND "RIGHT" POINTERS
Scanner sc=new Scanner(System.in);



private void enqueue(int data)						//ENQUEUE
{
if(Left != null)
{
Right=Left;
while(Right.next != null) Right=Right.next;

Node temp=new Node(data);
Right.next=temp;
temp.prev=Right;
Right=temp;
}
else Left=Right=new Node(data);
}



private int dequeue()								//DEQUEUE
{
if(Left != null)
{
Left.next.prev=null;
Left=Left.next;
return Left.data; 
}
System.out.println("#UNDERFLOW!!");
return -1;
}



void OutputRest(String str)							//OUTPUT RESTRICTION
{
/*
->INSERTION CAN BE DONE FROM
USER'S SCANNED DIRECTION ONLY

->DELETION CAN BE DONE FROM
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
if(Left != null)
{
int x=Left.data;
System.out.println("ELEMENT DEQUEUED: "+x);
Left=Left.next;
Left.prev=null;
}
else System.out.println("#NOTHING TO DEQUEUE -> QUEUE UNDERFLOW");
}

//DELETION FROM RIGHT
else if(str.equals("right"))
{
if(Left != null)
{
int x=Right.data;
System.out.println("ELEMENT DEQUEUED: "+x);
Right=Right.prev;
Right.next=null;
}
else System.out.println("#NOTHING TO DEQUEUE -> QUEUE UNDERFLOW");
}

//INVALID DIRECTION
else System.out.println("#INVALID DIRECTION FOR DELETION");
}

else
{
//CASE OF INSERTION:-
System.out.print("ENTER THE \"DIRECTION\" FOR INSERTION: ");
str=sc.next();

System.out.print("ENTER THE \"DATA\" FOR INSERTION: ");
int data=sc.nextInt();

//INSERTION FROM LEFT
if(str.equals("left"))
{
if(Left != null)
{
Node temp=new Node(data);
temp.next=Left;
Left=temp;
}
else Left=Right=new Node(data);
}

//INSERTION FROM RIGHT:-
else if(str.equals("right"))
{
if(Left != null)
{
Right=Left;
while(Right.next != null) Right=Right.next;

Node temp=new Node(data);
Right.next=temp;
temp.prev=Right;
Right=temp;
}
else Left=Right=new Node(data);
}

//INVALID DIRECTION
else System.out.println("#INVALID DIRECTION FOR INSERTION");
}
}



static void Print(ODEQueueDL q)						//PRINT
{
System.out.print("QUEUE: ");

Node Left=q.Left;
while(Left != null)
{
System.out.print(Left.data+" ");
Left=Left.next;
}
if(q.Left != null) System.out.print("\nLEFT: "+q.Left.data+"|RIGHT: "+q.Right.data);
System.out.println("\n");
}



public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

ODEQueueDL q=new ODEQueueDL();
System.out.print("#NO. OF ELEMENTS TO BE ENQUEUED: ");
int E=sc.nextInt();

if(E > 0) System.out.print("ENTER ELEMENTS TO BE ENQUEUED: ");
while(E-- > 0) q.enqueue(sc.nextInt());

Print(q);

System.out.print("ENTER THE DIRECTION FOR OUTPUT[DELETION] RESTRICTION: ");
q.OutputRest(sc.next());

Print(q);
}
}
//OUTPUT RESTRICTED DOUBLE_ENDED_QUEUE USING "DOUBLYLINKEDLIST"
