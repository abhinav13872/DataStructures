package REMOVELOOP;
import java.util.*;


public class List1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
List1 R=new List1();

System.out.print("Testcases: ");
int T=sc.nextInt();

while(T-- > 0)
{
System.out.print("ENTER THE NO. OF ELEMENTS IN A LINKEDLIST: ");
int n=sc.nextInt();
Node head=null;

if(n > 0) System.out.print("SCAN LINKEDLIST: ");
while(n-- > 0) head=insertAtEnd(head,sc.nextInt());
Print(head);

System.out.print("POSITION FOR CREATING LOOP IN A LINKEDLIST: ");
makeLoop(head,sc.nextInt());							//MAKES LOOP

R.RemoveLoop(head);								//REMOVES LOOP

if(detectLoop(head)) System.out.println("LOOP PRESENT!!");
else System.out.println("NO LOOP");

Print(head);
}
}



private static Node insertAtEnd(Node head,int data)				//INSERTION_AT_END
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



private static void makeLoop(Node head,int p)					//MAKE-LOOP METHOD
{
if(p == 0) return;
Node curr=head;
Node last=head;

for(int i=0;i<p-1;i++)
curr=curr.next;

System.out.println("Starting Element of Loop: "+curr.data);

while(last.next!=null)
last=last.next;

last.next=curr;
}



private static boolean detectLoop(Node head)					//DETECT-LOOP METHOD
{
Node fptr=head;//FAST POINTER
Node sptr=head;//SLOW POINTER

/*
Linearly FAST POINTER AND SLOW POINTER NEVER MEETS
LOOP IS THE CASE WHERE IN THEY MEET!!
*/

while(fptr != null && fptr.next != null)
{
fptr=fptr.next.next;
sptr=sptr.next;
if(fptr == sptr) return true;
}
return false;
}



private static void RemoveLoop(Node head)					//REMOVE-LOOP METHOD
{
Node fptr=head;
Node sptr=head;
Node LoopNode=null;
boolean LoopCheck=false;

while(fptr != null && fptr.next != null)
{
fptr=fptr.next.next;
sptr=sptr.next;

if(fptr == sptr)
{
LoopNode=fptr;
LoopCheck=true;
break;
}
}

//System.out.println("LoopCheck: "+LoopCheck);
System.out.println("LoopNode: "+LoopNode.data);

if(LoopCheck)
{
Node temp1=head;								//LISTNODE
while(true)
{
Node temp2=LoopNode;								//REF OF LOOPNODE
System.out.println("temp1: "+temp1.data);

while(temp2.next != LoopNode && temp2.next != temp1) temp2=temp2.next;
System.out.println("temp2: "+temp2.data);

if(temp2.next == temp1)
{
System.out.println("LAST NODE: "+temp2.data+"\n");
temp2.next=null;
break;
}

temp1=temp1.next;
}
}
return;
}



private static void Print(Node head)						//PRINT
{
System.out.print("\nLINKEDLIST: ");
while(head != null)
{
System.out.print(head.data+" ");
head=head.next;
}
System.out.println("\n");
}
}



class Node
{
int data;
Node next;
Node(int data)
{
this.data=data;
this.next=null;
}
}
//REMOVE-LINKEDLIST-LOOP-METHOD-1
