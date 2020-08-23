package SINGLYLINKEDLIST;
import java.util.*;


public class RotateList
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
RotateList R=new RotateList();

System.out.print("TESTCASES: ");
int T=sc.nextInt();

while(T-->0)
{
System.out.print("ENTER THE SIZE. OF LINKEDLIST: ");
int n=sc.nextInt();

System.out.print("LINKEDLIST: ");
Node head=new Node(sc.nextInt());
Node tail=head;

for(int i=0;i<n-1;i++)
{
tail.next=new Node(sc.nextInt());
tail=tail.next;
}

System.out.print("POSITION FOR ROTATION: ");
int k=sc.nextInt();							//SCAN POSITION
head=R.rotate(head,k);							//UPDATION IN HEAD
Print(head);
}
}



/*  This function should rotate list counter-
clockwise by k and return new head (if changed) */
private Node rotate(Node head, int k)					//ROTATE-LIST METHOD
{
Node temp=head;
while(temp.next!=null) temp=temp.next;//LAST NODE

temp.next=head;
temp=head;

while(--k > 0) temp=temp.next;

head=temp.next;
temp.next=null;
return head;
}



public static void Print(Node head)					//PRINT-METHOD
{
System.out.print("LINKEDLIST: ");
while(head!=null)
{
System.out.print(head.data+" ");
head=head.next;
}
System.out.println("\n");
}
}



class Node
{
int data;								//DATA
Node next;								//NEXT ELEMENT's  REFERANCE
static int count;

public Node(int data)
{
this.data=data;
this.next=null;
}
}
//ROTATION OF LINKEDLIST
