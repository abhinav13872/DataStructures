package PRIORITYQUEUE;
import java.util.Scanner;


public class PQueueL
{
public static Node front, rear;

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
PQueueL q=new PQueueL();

System.out.print("NO. OF QUERIES: ");
int n=sc.nextInt();

while(n-- > 0)
{
System.out.print("#QUERY: ");
int n1=sc.nextInt();

if(n1 == 1)
{
System.out.print("SCAN DATA AND PRIORITY OF NODE: ");
q.EnQueue(sc.nextInt(),sc.nextInt());
}
else System.out.print("ELEMENT DEQUEUED: "+q.DeQueue());
Print(front);
}

}

public void EnQueue(int data, int priority)				//ENQUEUE
{
if(front != null)
{

Node temp=new Node(data,priority);
if(priority < front.priority)
{
//INSERTION AT FRONT
temp.next=front;
front=temp;
return;
}

else
{
//INSERTION IN BETWEEN....
Node ptr=front;
Node preptr=ptr;

System.out.println("PREPTR: "+preptr.data);
while(ptr != null && ptr.priority <= priority)
{
preptr=ptr;
System.out.println("=====>PREPTR: "+preptr.data);
ptr=ptr.next;
}

temp.next=preptr.next;
preptr.next=temp;
return;
}
}

//EMPTY QUEUE CASE:
front=new Node(data,priority);
}    


public int DeQueue()							//DEQUEUE
{
if(front != null)
{
int x=front.data;
if(front == rear) front=rear=null;
else front=front.next;
return x;
}
return -1;
} 


private static Node delete(Node head,int value)			//DELETION BY PRIORITY
{
if(head != null)
{
Node ptr=head;
Node preptr=head;

while(ptr.next != null && ptr.priority != value)
{
preptr=ptr;
ptr=ptr.next;
}

if(ptr == preptr) return head.next;					//CASE OF DELETION OF 1ST ELEMENT

if(ptr != preptr && ptr.priority != value) return head;			//CASE OF NO MATCH FOUND

preptr.next=ptr.next;
return head;
}
System.out.println("#CASE OF UNDERFLOW!!");
return head;
}


private static void Print(Node head)					//PRINT METHOD
{
System.out.print("\nQUEUE: ");
while(head != null)
{
System.out.print(head.data+" ");
head=head.next;
}
System.out.println("\n");
}
}


class Node								//NODE
{
int data,priority;
Node next;

public Node(int data,int priority)
{
this.priority=priority;
this.data=data;
}
}
