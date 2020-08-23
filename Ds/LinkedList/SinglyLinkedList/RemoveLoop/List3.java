package REMOVELOOP;
import java.util.*;


public class List3
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
List3 R=new List3();

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



private static void makeLoop(Node head,int p)					//MAKE-LOOP METHOD
{
if(p==0) return;
Node curr=head;
Node last=head;

for(int i=0;i<p-1;i++)
curr=curr.next;

System.out.println("Starting Element of Loop: "+curr.data);

while(last.next!=null)
last=last.next;
last.next=curr;
}



private static boolean detectLoop(Node head)					//DETECT LOOP
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



private void RemoveLoop(Node head)
{
Node fptr=head;//FAST POINTER
Node sptr=head;//SLOW POINTER
Node LoopNode=null;
boolean LoopCheck=false;

while(fptr!=null && fptr.next!=null)
{
fptr=fptr.next.next;
sptr=sptr.next;
if(fptr==sptr)
{
LoopCheck=true;
LoopNode=fptr;
break;
}
}

if(LoopCheck)
{
sptr=head;
while(true)
{

if(fptr!=sptr && sptr.next==fptr.next) break;

fptr=fptr.next;
sptr=sptr.next;

//CASE WHEN LOOP HEAD SE SHURU HUI H:
if(fptr==sptr && fptr.next==LoopNode) break;
}

//System.out.println("====>"+fptr.data);
fptr.next=null;
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
//REMOVE-LINKEDLIST-LOOP-METHOD-3
