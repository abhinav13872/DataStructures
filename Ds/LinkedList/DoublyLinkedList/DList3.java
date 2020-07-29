package DOUBLYLINKEDLIST;
import java.util.Scanner;

public class DList3
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

System.out.print("ENTER THE VALUES TO BE SWAPPED: ");
swapNodes(head,sc.nextInt(),sc.nextInt());
Print(head);									//FORWARD-PRINTING	

}


private static void swapNodes(Node head,int x, int y)
{
if(head != null)
{
Node ptr1=head;
Node ptr2=head;
while(ptr1.next != null && ptr1.data != x) ptr1=ptr1.next;
//NOW "ptr1" IS AT REQUIRED POSITION

while(ptr2.next != null && ptr2.data != y) ptr2=ptr2.next;
//NOW "ptr2" IS AT REQUIRED POSITION

if(ptr1.data != x || ptr2.data != y) return;
int a=ptr1.data;
int b=ptr2.data;
ptr1.data=b;
ptr2.data=a;
}

System.out.println("#NOTHING TO SWAP -> EMPTY DOUBLYLINKEDLIST");
return;
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
//SWAP TWO NODES OF DOUBLYLINKEDLIST	
