package DOUBLYLINKEDLIST;
import java.util.Scanner;


public class RemDuplicate
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("SCAN DOUBLYLINKEDLIST SIZE: ");
int n=sc.nextInt();

Node head=null;
System.out.print("SCAN DOUBLYLINKEDLIST: ");
while(n-- > 0) head=insertAtEnd(head,sc.nextInt());

System.out.println("#AFTER REMOVING DUPLICATES:- ");
head=removeDuplicates(head);
Print(head);
}



private static Node removeDuplicates(Node head)				//REMOVE_DUPLICATES
{
if(head != null)
{
Node ptr1=head;
while(ptr1 != null)
{
//System.out.println("ptr1: "+ptr1.data);
Node ptr2=ptr1.next;

while(ptr2 != null)
{
//System.out.println("ptr2: "+ptr2.data); 
Node temp=ptr2.next;
if(ptr1.data == ptr2.data)
{
head=deleteNode(head,ptr2);
//Print(head);
}
ptr2=temp;
}

ptr1=ptr1.next;
}
return head;
}
System.out.println("#NOTHING TO REMOVE -> EMPTY DOUBLYLINKEDLIST");
return head;
}



private static Node deleteNode(Node head,Node temp)				//DELETION BY REFERANCE
{
if(head != null)
{
Node ptr=head;
while(ptr != null && ptr.next != null && ptr.next != temp) ptr=ptr.next;

if(ptr.next == temp)
{
ptr.next=temp.next;
if(temp.next != null) temp.next.prev=ptr;
temp.prev=null;
temp.next=null;
}

return head;
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
temp.prev=tail;
tail.next=temp;
return head;
}
head=new Node(data);
return head;
}



private static void Print(Node head)						//PRINT
{
System.out.print("DOUBLYLINKEDLIST: ");
while(head != null)
{
System.out.print(head.data+" ");
head=head.next;
}
System.out.println("\n");
}
}



class Node									//NODE
{
int data;
Node prev;
Node next;
public Node(int data)
{
this.data=data;
this.next=null;
}
}
//GROUP SWAP IN A DOUBLYLINKEDLIST
