package LINKEDLIST;
import java.util.*;
public class List1
{
public static void main(String[] args)
{
/*
AVOID USING REFERANCE OF HEAD SINCE NULL REACH KRNE 
KE BAAD WE CANT PRINT AGAIN BCOZ HEAD IS NULL ATLAST!!
Node head=new Node(1);//STEP-1
head.next=new Node(2);
head.next.next=new Node(3);
head.next.next.next=new Node(4);
while(head!=null)
{
System.out.println(head.data);
head=head.next;
}
while(head!=null)
{
System.out.println(head.data);
head=head.next;
}*/
Scanner sc=new Scanner(System.in);
Node head=new Node(1);
Node temp=head;//STORING REFERANCE OF HEAD
temp.next=new Node(2);
temp.next.next=new Node(3);
temp.next.next.next=new Node(4);

System.out.print("LinkedList: ");
Print(head);//PRINT FUNCTION

System.out.print("scan DATA to be inserted at START of LinkedList: ");
int n1=sc.nextInt();
head=insertAtHead(head,n1);//INSERTION AT START
temp=head;//UPDATION IN REFERANCE OF HEAD

System.out.print("LinkedList: ");
Print(head);//PRINT FUNCTION

System.out.print("scan DATA to be inserted at End of LinkedList: ");
int n2=sc.nextInt();
insertAtEnd(head,n2);//INSERTION AT END

System.out.print("LinkedList: ");
Print(head);//PRINT FUNCTION
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
static Node insertAtHead(Node head,int data)
{
Node temp1=new Node(data);
temp1.next=head;
head=temp1;
return head;
}
static void insertAtEnd(Node head,int data)
{
Node temp=new Node(data);
Node last=head;
while(last.next!=null)
{
last=last.next;
}
last.next=temp;
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
count++;
}
int getCount()
{return count;}

}
