package CIRCULARLINKEDLIST;
import java.util.Scanner;

public class CList3
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("ENTER THE NO. OF TESTCASES: ");
int t=sc.nextInt();
while(t-- > 0)
{
Node head=null;									//START NODE
System.out.print("ENTER THE NO. OF ELEMENTS IN A CIRCULAR_LINKEDLIST: ");
int n=sc.nextInt();

if(n > 0) System.out.print("SCAN CIRCULAR_LINKEDLIST ELEMENTS: ");

while(n-- > 0) head=insertAtEnd(head,sc.nextInt());

forwardPrint(head);									//FORWARD_PRINTING

backwardPrint(head);									//BACKWARD-PRINTING

System.out.print("SCAN AN ELEMENT TO BE INSERTED AT BEGAN: ");
head=insertAtBegin(head,sc.nextInt());
forwardPrint(head);									//FORWARD_PRINTING

System.out.println("#INSERTION BEFORE VALUE:-");
System.out.print("ENTER THE DATA AND VALUE: ");
head=insertBefore(head,sc.nextInt(),sc.nextInt());
forwardPrint(head);

System.out.println("#INSERTION AFTER VALUE:-");
System.out.print("ENTER THE DATA AND VALUE: ");
head=insertAfter(head,sc.nextInt(),sc.nextInt());
forwardPrint(head);

System.out.print("ENTER THE DATA FOR INSERTION AT MID POSITION: ");
head=insertAtMid(head,sc.nextInt());
forwardPrint(head);

System.out.print("ENTER THE DATA AND POSITION FOR INSERTION: ");
head=insertAt(head,sc.nextInt(),sc.nextInt());
forwardPrint(head);

System.out.println("#DELETION AT BEGINNING:- ");
head=deletionAtBegin(head);
forwardPrint(head);

System.out.println("#DELETION AT END:- ");
head=deletionAtEnd(head);
forwardPrint(head);

System.out.println("#DELETION AT MID:-");
head=deletionAtMid(head);
forwardPrint(head);

System.out.print("ENTER POSITION FOR DELETION: ");
head=deleteAt(head,sc.nextInt());
forwardPrint(head);

System.out.print("ENTER THE VALUE FOR DELETION: ");
head=delete(head,sc.nextInt());
forwardPrint(head);

}
}


private static Node delete(Node head,int value)					//DELETION BY VALUE
{
if(head != null)
{
Node ptr=head;

while(ptr.next != head && ptr.data != value) ptr=ptr.next;
/*
NOW "ptr" IS AT THE POSITION OF ELEMENT TO BE DELETED
IF ELEMENT EXISTS
*/

if(head.data == value)
{
if(head.next != head)
{
Node ptr2=head;
ptr2.prev.next=ptr2.next;
ptr2.next.prev=ptr2.prev;
head=ptr2.next;									//UPDAING HEAD
ptr2.next=null;
ptr2.prev=null;
return head;
}

//CASE OF SINGLE NODE:
return null;
}

//CASE OF NO DELETION:
if(ptr.data != value)
{
System.out.println("#NO MATCH FOUND -> NO DELETION");
return head;
}

ptr.prev.next=ptr.next;
ptr.next.prev=ptr.prev;
ptr.next=null;
ptr.prev=null;
return head;
}
System.out.println("#UNDERFLOW!!");
return head;
}


private static Node deleteAt(Node head,int x)						//DELETION BY POSITION
{
if(x < 1)
{
System.out.println("#INVALID POSITION -> NO DELETION");
return head;
}

if(head != null)
{
Node ptr=head;
int count=1;

while(ptr.next != head && count < x)
{
count++;
ptr=ptr.next;
}
/*
NOW "ptr" IS AT THE POSITION OF ELEMENT TO BE DELETED
AND "count" WILL BE EQUAL TO GIVEN POSITION "x"
*/

//CASE OF NO DELETION:
if(count != x)
{
System.out.println("#INVALID POSITION -> NO DELETION");
return head;
}

//CASE OF DELETION AT HEAD ONWARDS:
if(x > 1)
{
ptr.prev.next=ptr.next;
ptr.next.prev=ptr.prev;
ptr.next=null;
ptr.prev=null;
return head;
}

//CASE OF DELETION AT HEAD:-

if(head.next != head)
{
Node ptr2=head;
ptr2.prev.next=ptr2.next;
ptr2.next.prev=ptr2.prev;
head=ptr2.next;									//UPDAING HEAD
ptr2.next=null;
ptr2.prev=null;
return head;
}

//CASE OF SINGLE NODE:
return null;
}
System.out.println("#UNDERFLOW!!");
return head;
}


private static Node deletionAtBegin(Node head)					//DELETION AT BEGINNING
{
if(head != null)
{
if(head.next != head)
{
Node ptr=head;
ptr.prev.next=ptr.next;
ptr.next.prev=ptr.prev;
head=ptr.next;										//UPDAING HEAD
ptr.next=null;
ptr.prev=null;
return head;
}

//CASE OF SINGLE NODE:
return null;
}
System.out.println("#UNDERFLOW!!");
return head;
}


private static Node deletionAtEnd(Node head)						//DELETION AT END
{
if(head != null)
{
if(head.next != head)
{
Node ptr=head;										//LAST-NODE

while(ptr.next != head) ptr=ptr.next;

ptr.prev.next=ptr.next;
ptr.next.prev=ptr.prev;
ptr.next=null;
ptr.prev=null;
return head;
}

//CASE OF SINGLE NODE:
return null;
}
System.out.println("#UNDERFLOW!!");
return head;
}


private static Node deletionAtMid(Node head)						//DELETION AT MID
{
if(head != null)
{
if(head.next != head)
{
Node fptr=head;									//FAST-POINTER
Node sptr=head;									//SLOW-POINTER

while(true)
{
fptr=fptr.next.next;
sptr=sptr.next;
if(fptr == head || fptr.next == head) break;
}
//NOW "sptr" IS AT MID(CEIL)

sptr.prev.next=sptr.next;
sptr.next.prev=sptr.prev;
sptr.next=null;
sptr.prev=null;
return head;
}

//CASE OF SINGLE NODE:
return null;
}
System.out.println("#UNDERFLOW!!");
return head;
}


private static Node insertAt(Node head,int data,int x)				//INSERTION AT GIVEN POSITION
{
if(x < 1)										//CASE OF INVALID POSITION
{
System.out.println("#INVALID POSITION");
return head;
}

if(head != null)
{
Node ptr=head;
Node temp=new Node(data);
int count=1;

while(ptr.next != head && count < x) 
{
ptr=ptr.next;
count++;
}

//CASE OF INSERTION AFTERWARDS HEAD
if(x > 1)
{
if(count != x)										//CASE OF INVALID POSITION
{
//(INSERTION AT END)
temp.next=head;
temp.prev=head.prev;
head.prev.next=temp;
head.prev=temp;
return head;
}
temp.next=ptr;
temp.prev=ptr.prev;
ptr.prev.next=temp;
ptr.prev=temp;
return head;
}

//CASE OF INSERTION AT HEAD
temp.next=head;
temp.prev=head.prev;
head.prev.next=temp;
head.prev=temp;
return temp;
}

//CASE OF CREATION OF HEAD NODE:
head=new Node(data);
head.next=head;
head.prev=head;
return head;
}


private static Node insertAfter(Node head,int data,int value)			//INSERTION AFTER GIVEN VALUE
{
if(head != null)
{
Node temp=new Node(data);
Node ptr=head;

while(ptr.next != head && ptr.data != value) ptr=ptr.next;

temp.next=ptr.next;
temp.prev=ptr;
ptr.next.prev=temp;
ptr.next=temp;
return head;
}
//CASE OF CREATION OF HEAD NODE:
head=new Node(data);
head.next=head;
head.prev=head;
return head;
}


private static Node insertBefore(Node head,int data,int value)			//INSERTION BEFORE GIVEN VALUE
{
if(head != null)
{
Node temp=new Node(data);
if(head.data != value)
{
Node ptr=head;

while(ptr.next != head && ptr.data != value) ptr=ptr.next;

//CASE OF INSERTION AT END:
if(ptr.data != value)
{
temp.next=head;
temp.prev=head.prev;
head.prev.next=temp;
head.prev=temp;
return head;
}

//CASE OF INSERTION IN BETWEEN:
temp.next=ptr;
temp.prev=ptr.prev;
ptr.prev.next=temp;
ptr.prev=temp;
return head;
}

//CASE OF INSERTION AT HEAD
temp.next=head;
temp.prev=head.prev;
head.prev.next=temp;
head.prev=temp;
return temp;
}
//CASE OF CREATION OF HEAD NODE:
head=new Node(data);
head.next=head;
head.prev=head;
return head;
}


private static Node insertAtMid(Node head,int data)					//INSERTION AT MID
{
if(head != null)
{
Node temp=new Node(data);								//NODE TO BE INSERTED
Node fptr=head;
Node sptr=head;

while(true)
{
fptr=fptr.next.next;
sptr=sptr.next;
if(fptr == head || fptr.next == head) break;
}
//NOW "sptr" WILL BE AT MID:

//CASE OF INSERTION AT MID:
if(sptr != fptr)
{
temp.prev=sptr.prev;
temp.next=sptr;
sptr.prev.next=temp;
sptr.prev=temp;
return head;
}

//CASE OF INSERTION AT END:
temp.next=head;
temp.prev=sptr;
sptr.next=temp;
head.prev=temp;
return head;
}
//CASE OF CREATION OF HEAD NODE:
head=new Node(data);
head.next=head;
head.prev=head;
return head;
}


private static Node insertAtBegin(Node head,int data)				//INSERTION AT BEGINNING
{
Node HEAD=head;									//HEAD OF CIRCULAR_LINKEDLIST

if(HEAD != null)
{
Node tail=head;									//TAIL OF CIRCULAR_LINKEDLIST
while(tail.next != head) tail=tail.next;

Node temp=new Node(data);
temp.next=HEAD;
HEAD.prev=temp;
tail.next=temp;
temp.prev=tail;
return temp;
}

HEAD=new Node(data);
HEAD.next=HEAD;
HEAD.prev=HEAD;
return HEAD;
}



private static Node insertAtEnd(Node head,int data)					//INSERTION AT END
{
Node HEAD=head;									//HEAD OF CIRCULAR_LINKEDLIST
Node tail=head;

if(HEAD != null)
{
while(tail.next != head) tail=tail.next;

Node temp=new Node(data);
tail.next=temp;
temp.prev=tail;
temp.next=HEAD;
HEAD.prev=temp;
return HEAD;
}

HEAD=new Node(data);
HEAD.next=HEAD;
HEAD.prev=HEAD;
return HEAD;
}


private static void forwardPrint(Node head)							//FORWARD-PRINT
{
System.out.print("FORWARD_PRINTING CIRCULAR_LINKEDLIST: ");
Node ptr=head;

if(head != null)
{
do
{
System.out.print(ptr.data+" ");
ptr=ptr.next;
}
while(ptr != head);
}
System.out.println("\n");
}


private static void backwardPrint(Node head)							//BACKWARD-PRINT
{
System.out.print("BACKWARD_PRINTING CIRCULAR_LINKEDLIST: ");
if(head != null)
{
Node tail=head;										//LAST-NODE
while(tail.next != head) tail=tail.next;

Node ptr=tail;
do
{
System.out.print(ptr.data+" ");
ptr=ptr.prev;
}
while(ptr != tail);
}
System.out.println("\n");
}
}



class Node
{
int data;											//NODE's DATA
Node prev;											//NODE's PREVIOUS LINK
Node next;											//NODE's NEXT LINK

public Node(int data)
{
this.data=data;
}
}
//OPERATIONS ON A "CIRCULAR_DOUBLYLINKEDLIST"
