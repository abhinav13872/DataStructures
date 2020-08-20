package PRIORITYQUEUE;
import java.util.Scanner;


public class PQueueL
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("QUEUE SIZE: ");
int n=sc.nextInt();

Node queue=null;
while(n-- > 0)
{
System.out.print("SCAN PRIORITY AND DATA OF NODE: ");
queue=insertAtEnd(queue,sc.nextInt(),sc.nextInt());
}
Print(queue);

queue=sortLL(queue);
Print(queue);

System.out.print("ENTER PRIORITY FOR DELETION: ");
queue=delete(queue,sc.nextInt());
Print(queue);
}


private static Node insertAtEnd(Node head,int prty,int data)		//INSERTION AT END
{
if(head != null)
{
Node tail=head;
while(tail != null && tail.next != null) tail=tail.next;

Node temp=new Node(prty,data);
tail.next=temp;
return head;
}
head=new Node(prty,data);
return head;
}



private static Node delete(Node head,int value)			//DELETION BY PRIORITY
{
if(head != null)
{
Node ptr=head;
Node preptr=head;

while(ptr.next != null && ptr.prty != value)
{
preptr=ptr;
ptr=ptr.next;
}

if(ptr == preptr) return head.next;					//CASE OF DELETION OF 1ST ELEMENT

if(ptr != preptr && ptr.prty != value) return head;			//CASE OF NO MATCH FOUND

preptr.next=ptr.next;
return head;
}
System.out.println("#CASE OF UNDERFLOW!!");
return head;
}



private static Node sortLL(Node head)						//SORT LINKEDLIST
{
if(head != null)
{
Node HEAD=null;								//HEAD OF SORTED LINKEDLIST
Node ptr1=head;								//POINTER IN UN-SORTED LINKEDLIST
Node ptr2=null;								//POINTER IN SORTED LINKEDLIST

while(ptr1 != null)
{
ptr2=HEAD;
Node preptr2=ptr2;

while(ptr2 != null && ptr2.next != null)
{
if(ptr1.prty <= ptr2.prty) break;

preptr2=ptr2;
ptr2=ptr2.next;
}


//LINKING:-
Node temp=new Node(ptr1.prty,ptr1.data);
if(HEAD != null)
{
if(ptr1.prty <= ptr2.prty)
{
if(ptr1.prty < HEAD.prty)
{
//INSERTION AT HEAD:
temp.next=ptr2;
HEAD=temp;
}
else
{
temp.next=ptr2;
preptr2.next=temp;
}
}

else
{
temp.next=null;
ptr2.next=temp;
}

}
else
{
//INITIALIZING HEAD:
temp.next=HEAD;
HEAD=temp;
}
ptr1=ptr1.next;
}
return HEAD;
}
return head;
}


private static void Print(Node head)					//PRINT METHOD
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


class Node								//NODE
{
int data,prty;
Node next;

public Node(int prty,int data)
{
this.prty=prty;
this.data=data;
}
}
