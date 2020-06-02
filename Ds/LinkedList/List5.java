package LINKEDLIST;
import java.util.*;
public class List5
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("ENTER THE NO. OF TESTCASES: ");
int T=sc.nextInt();
while(T-->0)
{
System.out.print("ENTER THE SIZE. OF LINKEDLIST: ");
int n=sc.nextInt();
System.out.print("SCAN LINKEDLIST: ");
Node head=new Node(sc.nextInt());
Node tail=head;
for(int i=0;i<n-1;i++)
{
tail.next=new Node(sc.nextInt());
tail=tail.next;
}
System.out.print("SCAN POSITION FOR ROTATION: ");
int k=sc.nextInt();//SCAN POSITION
Rotate g=new Rotate();
head=g.rotate(head,k);//UPDATION IN HEAD
Print(head);
}
}
public static void Print(Node head)
{
while(head!=null)
{
System.out.print(head.data+" ");
head=head.next;
}
System.out.println();
}
}

class Rotate
{
/*  This function should rotate list counter-
clockwise by k and return new head (if changed) */
public Node rotate(Node head, int k) {
Node temp=head;
while(temp.next!=null)
temp=temp.next;//LAST NODE

temp.next=head;
temp=head;

while(k-->1)
temp=temp.next;

head=temp.next;
temp.next=null;
return head;
}
}

class Node
{
int data;//DATA
Node next;//NEXT REFERANCE
static int count;
public Node(int data)
{
this.data=data;
this.next=null;
}
}
//ROTATION OF LINKEDLIST
