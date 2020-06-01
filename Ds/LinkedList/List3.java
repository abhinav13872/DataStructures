package LINKEDLIST;
import java.util.*;
public class List3
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Node head=new Node(1);
head.next=new Node(2);
head.next.next=new Node(3);
Print(head);
System.out.println("MiddleElement: " + MiddleElement(head));
}
public static int MiddleElement(Node head)
{
Node fptr=head;
Node sptr=head;
while(fptr.next!=null && fptr!=null)
{
fptr=fptr.next.next;
sptr=sptr.next;
}
return sptr.data;
}
public static void Print(Node head)
{
System.out.print("LINKEDLIST: ");
while(head!=null)
{
System.out.print(head.data+" ");
head=head.next;
}
System.out.println();
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
MIDDLE ELEMENT OF LINKEDLIST
(SECOND FOR EVEN)
*/
