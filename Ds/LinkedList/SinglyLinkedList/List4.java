package SINGLYLINKEDLIST;
import java.util.*;
public class List4
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

head=ReverseLinkedList(head);//REVERSE METHOD CALLED
Print(head);
}

}
public static Node ReverseLinkedList(Node head)
{
Node prev=null;
Node current=head;
Node next=null;
while(current!=null)
{
next=current.next;//STORES REFERANCE OF NEXT NODE ELSE IT WILL BE DEREFERANCED
current.next=prev;//STORES REFERANCE OF PREVIOUS NODE

prev=current;//UPDATING PREVIOUS NODE REFERANCE FOR NEXT NODE
current=next;//ITERATOR FOR LOOP
}
return prev;
}
public static void Print(Node head)
{
System.out.print("REVERSED LINKEDLIST: ");
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
//REVERSE LINKEDLIST
