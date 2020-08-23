package SINGLYLINKEDLIST;
import java.util.Scanner;



public class MidProb
{
static Node head=null;								//HEAD OF LINKEDLIST

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
MidProb list=new MidProb();

System.out.print("ENTER THE NO. OF ELEMENTS IN A LINKEDLIST: ");
int n=sc.nextInt();

System.out.print("LINKEDLIST: ");
while(n-- > 0) head=list.insertAtEnd(head,sc.nextInt());

System.out.println("MIDDLE ELEMENT IS: "+ list.midElement(list.head));

System.out.println("\n#ROTATING BY MID:-");
list.head=list.rotateByMid(list.head);
list.Print(list.head);
}



private Node insertAtEnd(Node head,int data)					//INSERTION AT END
{
if(head != null)
{
Node tail=head;
while(tail != null && tail.next != null) tail=tail.next;

Node temp=new Node(data);
tail.next=temp;
return head;
}
head=new Node(data);
return head;
}



private int midElement(Node head)						//MIDDLE ELEMENT
{
Node sptr=head;
Node fptr=head;

while(fptr != null && fptr.next != null)
{
fptr=fptr.next.next;
sptr=sptr.next;
}
return sptr.data;
}



private Node rotateByMid(Node head)						//ROTATE BY MID
{
if(head != null)
{
Node sptr=head;
Node fptr=head;

while(fptr != null && fptr.next != null)
{
fptr=fptr.next.next;
sptr=sptr.next;
}

Node tail=head;
while(tail.next != null) tail=tail.next;

tail.next=head;
head=sptr.next;								//UPDATE HEAD
sptr.next=null;
return head;
}
return head;
}



private void Print(Node head)							//PRINT METHOD
{
System.out.print("LINKEDLIST: ");
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
this.next=null;
}
}
/*
1.MIDDLE ELEMENT IN A LINKEDLIST (CEIL VALUE)
2.ROTATION BY MID
*/
