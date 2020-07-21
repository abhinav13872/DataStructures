package LINKEDLIST;
import java.util.*;

public class List2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Node head=new Node(1);
head.next=new Node(2);
head.next.next=new Node(3);

System.out.print("LinkedList: ");
Print(head);//PRINT FUNCTION

//head=deleteAtStart(head);							//DELETION OF NODE FROM BEGINNING
//deleteAtEnd(head);								//DELETION OF NODE AT END
System.out.print("Scan the Position for Insertion: ");
int p=sc.nextInt();								//SCANS THE POSITION(FOR INSERTION/DELETION OF NODE)
System.out.print("Scan the Element for Insertion: ");
int d=sc.nextInt();
head=insertNode(head,d,p);

System.out.print("LinkedList: ");
Print(head);

System.out.print("Scan the Position for Deletion: ");
int p1=sc.nextInt();								//SCANS THE POSITION(FOR INSERTION/DELETION OF NODE)
head=deleteNode(head,p1);							//DELETION AT Nth POSITION

System.out.print("LinkedList: ");
Print(head);
}



public static Node deleteAtStart(Node head)
{
head=head.next;
return head;
}



public static void deleteAtEnd(Node head)
{
Node temp=head;
while(temp.next.next!=null)
{
temp=temp.next;
}
temp.next=null;
//System.out.println(temp.data);
}



public static Node insertNode(Node head,int data,int p)			//INSERTION AT Nth POSITION
{
if(p==1)
{
Node temp1=new Node(data);
temp1.next=head;
return temp1;
}
Node temp1=new Node(data);
Node temp=head;
int l=0;
while(l<p-2)
{
temp=temp.next;
l++;
}
//System.out.println(temp.data);
temp1.next=temp.next;
temp.next=temp1;
return head;
}


public static Node deleteNode(Node head,int p)
{
if(p==1)
{
return head.next;//NEW HEAD
}
int l=0;
Node temp=head;
while(l<p-2)
{
temp=temp.next;
l++;
}
temp.next=temp.next.next;
return head;
}


public static void Print(Node head)						//PRINT FUNCTION
{
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
