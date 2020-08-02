package SINGLYLINKEDLIST;
import java.util.*;


public class List8
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("No. of Testcases: ");
int T=sc.nextInt();

while(T-->0)
{
System.out.print("Enter the Size of LINKEDLIST: ");
int n=sc.nextInt();

System.out.print("Scan LINKEDLIST: ");
Node head=new Node(sc.nextInt());
Node tail=head;
for(int i=0;i<n-1;i++)
{
tail.next=new Node(sc.nextInt());
tail=tail.next;
}

Print(head);

System.out.print("Scan Position for creating Loop in a LINKEDLIST: ");
int p=sc.nextInt();
makeLoop(head,p);

Solver s=new Solver();
s.RemoveLoop(head);//REMOVE LOOP METHOD CALLED

if(detectLoop(head)) System.out.println("LOOP PRESENT!!");
else System.out.println("NO LOOP");

Print(head);
}
}


public static void makeLoop(Node head,int p)					//MAKE LOOP
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


public static void Print(Node head)						//PRINT
{
System.out.print("LINKEDLIST: ");
while(head != null)
{
System.out.print(head.data+" ");
head=head.next;
}
System.out.println("\n");
}


public static boolean detectLoop(Node head)					//DETECT LOOP
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
}



class Solver
{
public void RemoveLoop(Node head)						//REMOVE LOOP
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
