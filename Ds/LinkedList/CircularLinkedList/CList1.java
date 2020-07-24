package CIRCULARLINKEDLIST;
import java.util.Scanner;

public class CList1
{
Node head;									//START NODE

public CList1()
{}

public CList1(int data)
{
if(head == null)
head=new Node(data);
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("ENTER THE NO. OF ELEMENTS IN A CIRCULAR_LINKEDLIST: ");
int n=sc.nextInt();

CList1 list=null;
if(n > 0)
{
System.out.print("SCAN CIRCULAR_LINKEDLIST ELEMENTS: ");
list=new CList1(sc.nextInt());

Node temp=list.head;
while(n-- != 1)
{
temp.next=new Node(sc.nextInt());
temp=temp.next;
}


Node tail=list.head;								//LINKING LAST-NODE TO HEAD NODE(TO MAKE IT CIRCULAR)
while(tail.next != null) tail=tail.next;
tail.next=list.head;
}
else
{
list=new CList1();
}

list.Print(list.head);

System.out.print("ENTER THE DATA TO FOR INSERTION AT BEGINNING: ");
list.head=list.insertAtBegin(list.head,sc.nextInt());
list.Print(list.head);

System.out.print("ENTER THE DATA TO FOR INSERTION AT END: ");
list.head=list.insertAtEnd(list.head,sc.nextInt());
list.Print(list.head);

System.out.println("#INSERTION BEFORE VALUE:-");
System.out.print("ENTER THE DATA AND VALUE: ");
list.head=list.insertBefore(list.head,sc.nextInt(),sc.nextInt());
list.Print(list.head);

System.out.println("#INSERTION AFTER VALUE:-");
System.out.print("ENTER THE DATA AND VALUE: ");
list.head=list.insertAfter(list.head,sc.nextInt(),sc.nextInt());
list.Print(list.head);

System.out.print("ENTER THE DATA FOR INSERTION AT MID POSITION: ");
list.head=list.insertAtMid(list.head,sc.nextInt());
list.Print(list.head);

System.out.print("ENTER THE DATA AND POSITION FOR INSERTION: ");
list.head=list.insertAt(list.head,sc.nextInt(),sc.nextInt());
list.Print(list.head);

System.out.println("DELETION AT BEGINNING:- ");
list.head=list.deletionAtBegin(list.head);
list.Print(list.head);

System.out.println("DELETION AT END:- ");
list.head=list.deletionAtEnd(list.head);
list.Print(list.head);

System.out.print("ENTER POSITION FOR DELETION: ");
list.head=list.deleteAt(list.head,sc.nextInt());
list.Print(list.head);

System.out.print("ENTER THE VALUE FOR DELETION: ");
list.head=list.delete(list.head,sc.nextInt());
list.Print(list.head);

System.out.println("#REVERSING CIRCULAR_LINKEDLIST:- ");
list.head=list.reverseLL(list.head);
list.Print(list.head);
}



private Node insertAtBegin(Node head,int data)				//INSERTION AT BEGINNING
{
Node HEAD=head;								//HEAD OF CIRCULAR_LINKEDLIST

if(HEAD != null)
{
Node tail=head;								//TAIL OF CIRCULAR_LINKEDLIST
while(tail != null && tail.next != head) tail=tail.next;

Node temp=new Node(data);
temp.next=HEAD;
tail.next=temp;
return temp;
}

HEAD=new Node(data);
HEAD.next=HEAD;
return HEAD;
}



private Node insertAtEnd(Node head,int data)					//INSERTION AT END
{
Node HEAD=head;								//HEAD OF CIRCULAR_LINKEDLIST
Node tail=head;

if(HEAD != null)
{
while(tail != null && tail.next != head) tail=tail.next;

Node temp=new Node(data);
temp.next=tail.next;
tail.next=temp;
return HEAD;
}
HEAD=new Node(data);
HEAD.next=HEAD;
return HEAD;
}



private Node insertBefore(Node head,int data,int value)			//INSERTION BEFORE A GIVEN VALUE
{
if(head != null)
{
Node ptr=head;
Node preptr=ptr;

while(ptr.next != head && ptr.data != value)
{
preptr=ptr;
ptr=ptr.next;
}

Node temp=new Node(data);
if(ptr != preptr && ptr.data == value)					//CASE WHEN MATCH FOUND
{
temp.next=ptr;
preptr.next=temp;
return head;
}
else if(ptr.data != value)							//CASE WHEN NO MATCH FOUND
{
temp.next=ptr.next;
ptr.next=temp;
return head;
}

temp.next=head;								//CASE OF INSERTION AT HEAD
Node tail=head;
while(tail != null && tail.next != head) tail=tail.next;
tail.next=temp;
return temp;
}

head=new Node(data);								//CASE OF EMPTY CIRCULAR_LINKEDLIST
head.next=head;
return head;
}



private Node insertAfter(Node head,int data,int value)			//INSERTION AFTER A GIVEN VALUE
{
if(head != null)
{
Node ptr=head;

while(ptr.next != head && ptr.data != value) ptr=ptr.next;

Node temp=new Node(data);
temp.next=ptr.next;
ptr.next=temp;
return head;
}

head=new Node(data);								//CASE OF EMPTY CIRCULAR_LINKEDLIST
head.next=head;
return head;
}



private Node insertAtMid(Node head,int data)					//INSERTION AT MID POSITION
{

if(head != null)
{
Node tail=head;
int counter=1;									//COUNT OF NODES

while(tail.next != head)
{
tail=tail.next;
++counter;
}

tail=head;
int count=1;									//COUNT OF POSITION
while(tail.next != head && count < counter/2)
{
tail=tail.next;
++count;
}

Node temp=new Node(data);
temp.next=tail.next;
tail.next=temp;
return head;
}

head=new Node(data);								//CASE OF EMPTY CIRCULAR_LINKEDLIST
head.next=head;
return head;
}



private Node insertAt(Node head,int data,int x)				//INSERTION AT GIVEN POSITION
{
Node HEAD=head;
if(x < 1)									//INVALID POSITION
{
System.out.println("#INVALID POSTION!!");
return HEAD;
}

if(HEAD != null)
{
int counter=1;									//COUNTER OF POSITION
Node ptr=HEAD;
Node preptr=HEAD;
Node temp=new Node(data);							//NODE TO BE INSERTED

while(ptr.next != HEAD && counter < x)
{
preptr=ptr;
ptr=ptr.next;
++counter;
}

if(preptr != ptr && counter == x)						//CASE OF INSERTION IN-BETWEEN.
{
temp.next=preptr.next;
preptr.next=temp;
return HEAD;
}
else if(preptr != ptr && counter != x)					//CASE OF INSERTION AT END
{
temp.next=ptr.next;
ptr.next=temp;
return head;
}

temp.next=ptr;									//CASE OF INSERTION AT HEAD
Node tail=head;								//LAST NODE(TAIL OF CIRCULAR_LINKEDLIST)
while(tail.next != head) tail=tail.next;
tail.next=temp;
return temp;
}

HEAD=new Node(data);								//CASE OF EMPTY CIRCULAR_LINKEDLIST
HEAD.next=HEAD;
return HEAD;
}



private Node deletionAtBegin(Node head)					//DELETION AT BEGINNING
{
if(head != null)
{
Node tail=head;
while(tail.next != head) tail=tail.next;

tail.next=head.next;
return head.next;
}

System.out.println("#CASE OF UNDERFLOW!!");
return head;
}



private Node deletionAtEnd(Node head)						//DELETION AT END
{
Node ptr=head;
Node preptr=head;

if(head != null)
{
while(ptr.next != head)
{
preptr=ptr;
ptr=ptr.next;
}

preptr.next=head;
return head;
}
System.out.println("#CASE OF UNDERFLOW!!");
return head;
}



private Node deleteAt(Node head,int x)					//DELETION AT GIVEN POSITION
{
if(x < 1)
{
System.out.println("#INVALID POSTION!!");
return head;
}

if(head != null)
{
Node ptr=head;
Node preptr=head;
int count=1;									//POSITION COUNTER

while(ptr.next != head && count < x)
{
preptr=ptr;
ptr=ptr.next;
++count;
}

if(count != x)									//CASE OF INVALID POSITION (NO DELETION)
{
System.out.println("#INVALID POSTION!!");
return head;
}

if(preptr != ptr)								//CASE OF DELETION EXCEPT HEAD
{
preptr.next=ptr.next;
return head;
}

Node tail=head;								//CASE OF DELETION AT HEAD
while(tail.next != head) tail=tail.next;
tail.next=head.next;
return head.next;
}

System.out.println("#CASE OF UNDERFLOW!!");
return head;
}



private Node delete(Node head,int value)					//DELETION BY VALUE
{
if(head != null)
{
Node ptr=head;
Node preptr=head;

while(ptr.next != head && ptr.data != value)
{
preptr=ptr;
ptr=ptr.next;
}

if(ptr != preptr && ptr.data == value)					//CASE OF DELETION EXCEPT HEAD
{
preptr.next=ptr.next;
return head;
}
else if(ptr.data != value) return head;					//CASE OF NO "MATCH FOUND"

Node tail=head;								//CASE OF DELETION AT HEAD
while(tail.next != head) tail=tail.next;
if(head.next != head)								//CIRCULAR_LINKEDLIST' size > 1
{
tail.next=head.next;
return head.next;
}
return null;									//CIRCULAR_LINKEDLIST'S SIZE = 1
}
System.out.println("#CASE OF UNDERFLOW!!");
return head;
}



private Node reverseLL(Node head)						//REVERSE CIRCULAR_LINKEDLIST
{
if(head != null)
{
Node tail=head;								//LAST_NODE OF LINKED LIST TO BE REVERSED
Node ptr=null;
Node prehead=head;								//TO BREAK LINK WITH PREVIOUS ELEMENT CONSUMING MEMORY

while(tail.next != head)
{
ptr=insertAtBegin(ptr,tail.data);

prehead=tail;
tail=tail.next;
prehead.next=null;
}
if(tail.next == head) ptr=insertAtBegin(ptr,tail.data);
return ptr;									//NEW HEAD
}

System.out.println("#NOTHING TO REVERSE -> EMPTY CIRCULAR_LINKEDLIST!!");
return head;
}



private void Print(Node head)							//PRINT METHOD
{
System.out.print("CIRCULAR_LINKEDLIST: ");
Node tail=head;

if(head != null) System.out.print(head.data+" ");
while(tail != null && tail.next != head)
{
tail=tail.next;
System.out.print(tail.data+" ");
}
System.out.println("\n");
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
//OPERATIONS ON A "CIRCULAR_LINKEDLIST"
