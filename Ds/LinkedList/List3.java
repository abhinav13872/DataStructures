package LINKEDLIST;
import java.util.*;
public class List3
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the no. of Testcases: ");
int T=sc.nextInt();//TESTCASES
while(T-->0)
{
System.out.print("Scan LINKEDLIST size: ");
int n=sc.nextInt();
System.out.print("Scan LINKEDLIST: ");
Node head=new Node(sc.nextInt());
Node tail=head;
for(int i=0;i<n-1;i++)
{
tail.next=new Node(sc.nextInt());
tail=tail.next;
}
Print(head);
System.out.println("MiddleElement: " + MiddleElement(head));
}
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
