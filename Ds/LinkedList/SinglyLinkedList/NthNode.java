package SINGLYLINKEDLIST;
import java.util.*;


public class NthNode
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Scan LINKEDLIST size: ");
int n=sc.nextInt();

Node head=null;
System.out.print("Scan LINKEDLIST: ");
while(n-- > 0) head=insertAtEnd(head,sc.nextInt());

System.out.print("ENTER THE VALUE OF N: ");
Node temp=NthNode(head,sc.nextInt());
System.out.println("Nth NODE FROM END: "+temp.data);
}


private static Node NthNode(Node head,int n)					//Nth NODE FROM END
{
if(head != null)
{
Node fptr=head;
Node sptr=head;

while(n-- > 1) fptr=fptr.next;

while(fptr.next != null)
{
fptr=fptr.next;
sptr=sptr.next;
}
return sptr;
}
return head;
} 


private static Node insertAtEnd(Node head,int data)				//INSERTION AT END
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


private static void Print(Node head)						//PRINT
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



class Node									//NODE
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
Nth NODE FROM END
*/
