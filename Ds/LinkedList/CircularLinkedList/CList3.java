package CIRCULARLINKEDLIST;
import java.util.Scanner;

public class CList3
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("ENTER THE NO. OF TESTCASES: ");
int t=sc.nextInt();
while(t-- > 0)
{
Node head=null;									//START NODE
System.out.print("ENTER THE NO. OF ELEMENTS IN A CIRCULAR_LINKEDLIST: ");
int n=sc.nextInt();

if(n > 0) System.out.print("SCAN CIRCULAR_LINKEDLIST ELEMENTS: ");

while(n-- > 0) head=insertAtEnd(head,sc.nextInt());

forwardPrint(head);									//FORWARD_PRINTING
/*
System.out.print("SCAN AN ELEMENT TO BE INSERTED AT BEGAN: ");
head=insertAtBegin(head,sc.nextInt());
forwardPrint(head);									//FORWARD_PRINTING

backwardPrint(head);									//BACKWARD-PRINTING
*/

}
}


private static Node insertAtBegin(Node head,int data)				//INSERTION AT BEGINNING
{
Node HEAD=head;									//HEAD OF CIRCULAR_LINKEDLIST

if(HEAD != null)
{
Node tail=head;									//TAIL OF CIRCULAR_LINKEDLIST
while(tail.next != head) tail=tail.next;

Node temp=new Node(data);
temp.next=HEAD;
HEAD.prev=temp;
tail.next=temp;
temp.prev=tail;
return temp;
}

HEAD=new Node(data);
HEAD.next=HEAD;
HEAD.prev=HEAD;
return HEAD;
}



private static Node insertAtEnd(Node head,int data)					//INSERTION AT END
{
Node HEAD=head;									//HEAD OF CIRCULAR_LINKEDLIST
Node tail=head;

if(HEAD != null)
{
while(tail.next != head) tail=tail.next;

Node temp=new Node(data);
tail.next=temp;
temp.prev=tail;
temp.next=HEAD;
HEAD.prev=temp;
return HEAD;
}

HEAD=new Node(data);
HEAD.next=HEAD;
HEAD.prev=HEAD;
return HEAD;
}


private static void forwardPrint(Node head)							//FORWARD-PRINT
{
System.out.print("FORWARD_PRINTING CIRCULAR_LINKEDLIST: ");
Node ptr=head;

do
{
System.out.print(ptr.data+" ");
ptr=ptr.next;
}
while(ptr != head);
System.out.println("\n");
}


private static void backwardPrint(Node head)							//BACKWARD-PRINT
{
System.out.print("BACKWARD_PRINTING CIRCULAR_LINKEDLIST: ");
Node tail=head;										//LAST-NODE
while(tail.next != head) tail=tail.next;

Node ptr=tail;
do
{
System.out.print(ptr.data+" ");
ptr=ptr.prev;
}
while(ptr != tail);

System.out.println("\n");
}
}



class Node
{
int data;											//NODE's DATA
Node prev;											//NODE's PREVIOUS LINK
Node next;											//NODE's NEXT LINK

public Node(int data)
{
this.data=data;
}
}
//CIRCULAR_DOUBLYLINKEDLIST
