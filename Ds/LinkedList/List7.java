package LINKEDLIST;
import java.util.*;
public class List7
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
System.out.print("Scan Nth term of LINKEDLIST to get: ");
int n1=sc.nextInt();
Print(head);
System.out.println("Term at position "+n1+" from last is: "+getNthFromLast(head,n1));

}
}
static int getNthFromLast(Node head, int n)
{
Node temp=head;
int len=0;
while(temp!=null)
{
len++;
temp=temp.next;
}
if(n>len) return -1;

Node fptr=head;
Node sptr=head;
for(int i=0;i<n-1;i++)
fptr=fptr.next;
     	
while(fptr.next!=null)
{
//System.out.println("=>"+fptr.data);
//System.out.println("===>"+sptr.data);
fptr=fptr.next;
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
//NTH ELEMENT FROM LAST IN A LINKEDLIST
