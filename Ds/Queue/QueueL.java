package QUEUE;
import java.util.Scanner;


public class QueueL
{
Node Front;

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
QueueL q=new QueueL();

System.out.print("NO. OF ELEMENTS TO BE ENQUEUED: ");
int n=sc.nextInt();

if(n > 0) System.out.print("ENTER THE ELEMENTS TO BE ENQUEUED: ");
while(n-- > 0) q.enqueue(sc.nextInt());

Print(q.Front);

System.out.print("NO. OF ELEMENTS TO BE DEQUEUED: ");
n=sc.nextInt();
while(n-- > 0) System.out.println("ELEMENT DEQUEUED: "+q.dequeue());

Print(q.Front);

System.out.print("ENTER THE ELEMENTS TO BE ENQUEUED: ");
q.enqueue(sc.nextInt());

Print(q.Front);
}



void enqueue(int data)						//ENQUEUE [INSERTION AT END]
{
if(Front != null)
{
Node Rear=Front;
while(Rear.next != null) Rear=Rear.next;

Rear.next=new Node(data);
return;
}
Front=new Node(data);
}



int dequeue()							//DEQUEUE [DELETION AT BEGINNING]
{
if(Front != null)
{
int x=Front.data;
Front=Front.next;
return x;
}

System.out.println("#NOTHING TO DEQUEUE -> QUEUE UNDERFLOW");
return -1;
}



static void Print(Node head)					//PRINT METHOD
{
System.out.print("QUEUE: ");
while(head != null)
{
System.out.print(head.data+" ");
head=head.next;
}
System.out.println("\n");
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
//LINKEDLIST IMPLENTATION OF QUEUE
