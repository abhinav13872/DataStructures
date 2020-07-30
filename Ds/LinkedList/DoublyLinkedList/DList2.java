package DOUBLYLINKEDLIST;
import java.util.Scanner;

public class DList2
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

System.out.println("COUNT OF NODES: "+getCount(head));

System.out.println("#ROTATE THE DOUBLYLINKEDLIST BY K ELEMENTS:-");
System.out.print("SCAN VALUE OF K: ");
head=rotateByK(head,sc.nextInt());
Print(head);									//FORWARD-PRINTING	

}


private static int getCount(Node head)					//COUNT OF NODES
{
if(head != null)
{
Node tail=head;
while(tail.next != null) tail=tail.next;

Node x=tail;
int total=0;
for(total=0;(x != null);total++) x=x.prev;
return total;
}
return 0;
}


private static Node rotateByK(Node head, int k)
{
if(head != null)
{
Node tail=head;								//LAST NODE
int len=1;
while(tail.next != null)
{
tail=tail.next;
len++;
}

if(k < 1 || k >= len) return head;

tail.next=head;
head.prev=tail;
Node ptr=tail;
while(k-- > 1) ptr=ptr.prev;

head=ptr;									//UPDATING HEAD
ptr.prev.next=null;
ptr.prev=null;
return head;									//NEW HEAD
}
System.out.println("#NOTHING TO ROTATE -> EMPTY DOUBLYLINKEDLIST");
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
//ROTATE DOUBLYLINKEDLIST BY K ELEMENTS
