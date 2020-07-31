package SINGLYLINKEDLIST;
import java.util.*;


public class List4
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Scan LINKEDLIST size: ");
int n=sc.nextInt();

Node head=null;
System.out.print("Scan LINKEDLIST: ");
while(n-- > 0) head=insertAtEnd(head,sc.nextInt());

System.out.print("ENTER THE SIZE OF GROUP: ");
head=groupSwap(head,sc.nextInt());
Print(head);
}


private static Node groupSwap(Node head,int k)				//GROUP SWAP
{
if(head != null)
{
Node HEAD=head;
int count=1;
while(HEAD.next !=null)
{
count++;
HEAD=HEAD.next;
}
System.out.println("NO. OF NODES: "+count);

if(k >= count || k < 1) return head;						//"NO SWAP"

Node ptr1=head;
Node NEXT=null;
Node PREV=null;

while(ptr1 != null && ptr1.next != null)
{
int gs=k;
Node ptr2=ptr1;

while(gs-1 > 0) 
{
ptr2=ptr2.next;
gs--;
}
System.out.println("ptr1.data: "+ptr1.data);
System.out.println("ptr2.data: "+ptr2.data);

Node ptr3=ptr2.next;
if(ptr3 != null)
{

Node ptr4=ptr3;
if(ptr4 != null)
{
gs=k;
while(gs-1 > 0 && ptr4.next != null)
{
ptr4=ptr4.next;
gs--;
}

System.out.println("ptr3.data: "+ptr3.data);
System.out.println("ptr4.data: "+ptr4.data);

NEXT=ptr4.next;								//STORING NEXT NODE
ptr2.next=ptr4.next;
ptr4.next=ptr1;
if(ptr1 == head) head=ptr3;
if(PREV != null) PREV.next=ptr3;						//LINKING WITH PREVIOUS
}
else
{
//CASE WHEN "ptr4" IS NULL:-

ptr2.next=ptr3.next;
ptr3.next=ptr1;
if(ptr1 == head) head=ptr3;
if(PREV != null) PREV.next=ptr3;						//LINKING WITH PREVIOUS
}

}
else return head;								//"NO SWAP"

PREV=ptr2;									//STORING PREVIOUS NODE
ptr1=NEXT;									//UPDATING POINTER
}
return head;
}
System.out.println("#NOTHING TO SWAP -> EMPTY LINKEDLIST");
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
//GROUP SWAP IN A LINKEDLIST
