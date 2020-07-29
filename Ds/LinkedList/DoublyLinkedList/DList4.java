package DOUBLYLINKEDLIST;
import java.util.Scanner;

public class DList4
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Node head=null;								//START NODE
System.out.print("ENTER THE NO. OF ELEMENTS IN A DOUBLYLINKEDLIST: ");
int n=sc.nextInt();

if(n > 0) System.out.print("SCAN DOUBLYLINKEDLIST ELEMENTS: ");

while(n-- > 0) head=insertAtEnd(head,sc.nextInt());
Print(head);									//FORWARD-PRINTING	

System.out.println("#AFTER REARRANGING:- ");
head=rearrangeList(head);
Print(head);									//FORWARD-PRINTING	

}


private static Node rearrangeList(Node head)					//REARRANGE METHOD
{
if(head != null)
{
//FOR EVEN POSITION's ELEMENTS:-
Node fptr=head.next;								//POINTER FOR EVEN POSITION
Node HEAD=null;

while(fptr != null && fptr.next != null)
{
HEAD=insertAtEnd(HEAD,fptr.data);
fptr=fptr.next.next;
}
if(fptr != null) HEAD=insertAtEnd(HEAD,fptr.data);
/*
SINCE LAST ELEMENT ARE GETTING IGNORED SO WE HAVE INSERTED THEM
VIA "if" STATEMENT IF THE LAST ELEMENT IS AT "EVEN POSITION"
*/


//FOR ODD POSITION's ELEMENTS:-
fptr=head;									//POINTER FOR ODD POSITION
while(fptr != null && fptr.next != null)
{
HEAD=insertAtEnd(HEAD,fptr.data);
fptr=fptr.next.next;
}
if(fptr != null) HEAD=insertAtEnd(HEAD,fptr.data);
return HEAD;
/*
SINCE LAST ELEMENT ARE GETTING IGNORED SO WE HAVE INSERTED THEM
VIA "if" STATEMENT IF THE LAST ELEMENT IS AT "ODD POSITION"
*/

}
System.out.println("#NOTHING TO REARRANGE -> EMPTY DOUBLYLINKEDLIST");
return head;
}


private static Node insertAtEnd(Node head,int data)				//INSERTION AT END
{
if(head != null)
{
Node tail=head;								//LAST NODE
while(tail.next != null) tail=tail.next;

Node temp=new Node(data);
tail.next=temp;								//UPDATING LASTNODE's NEXT LINK
temp.prev=tail;								//UPDATING NODE's PREVIOUS LINK
return head;
}

head=new Node(data);
return head;
}


private static void Print(Node head)						//FORWARD-PRINT
{
System.out.print("DOUBLYLINKEDLIST: ");
while(head != null)
{
System.out.print(head.data+" ");
head=head.next;
}
System.out.println("\n");
}


private static void backwardPrint(Node head)					//BACKWARD-PRINT
{
System.out.print("BACKWARD_PRINTING CIRCULAR_LINKEDLIST: ");
Node tail=head;								//LAST-NODE
while(tail.next != null) tail=tail.next;

Node ptr=tail;
while(ptr != null)
{
System.out.print(ptr.data+" ");
ptr=ptr.prev;
}

System.out.println("\n");
}
}


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
//REARRANGE SUCH EVEN POSITION ELEMENTS COMES BEFORE ODD ONES..
