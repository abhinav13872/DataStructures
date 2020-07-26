package SINGLYLINKEDLIST;
import java.util.Scanner;

public class List1
{
Node head;									//START NODE

public List1()
{}

public List1(int data)
{
if(head == null)
head=new Node(data);
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("ENTER THE NO. OF ELEMENTS IN A LINKEDLIST: ");
int n=sc.nextInt();

List1 list=null;
if(n > 0)
{
System.out.print("SCAN LINKEDLIST ELEMENTS: ");
list=new List1(sc.nextInt());

Node temp=list.head;
while(n-- != 1)
{
temp.next=new Node(sc.nextInt());
temp=temp.next;
}
}
else
{
list=new List1();
}

/*list.head.next=new Node(sc.nextInt());
list.head.next.next=new Node(sc.nextInt());
list.head.next.next.next=new Node(sc.nextInt());
list.head.next.next.next.next=new Node(sc.nextInt());
list.head.next.next.next.next.next=new Node(sc.nextInt());
list.head.next.next.next.next.next.next=new Node(sc.nextInt());
list.head.next.next.next.next.next.next.next=new Node(sc.nextInt());
*/
list.Print(list.head);
System.out.println("#LINKEDLIST IS IN NON-DECREASING ORDER: "+list.check(list.head));

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

System.out.println("#REVERSING LINKEDLIST:- ");
list.head=list.reverseLL(list.head);
list.Print(list.head);
}



private Node insertAtBegin(Node head,int data)			//INSERTION AT BEGINNING
{
if(head != null)
{
Node temp=new Node(data);
temp.next=head;
return temp;
}

head=new Node(data);
return head;
}



private Node insertAtEnd(Node head,int data)				//INSERTION AT END
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



private Node insertBefore(Node head,int data,int value)		//INSERTION BEFORE A GIVEN VALUE
{
if(head != null)
{
Node ptr=head;
Node preptr=ptr;

while(ptr != null && ptr.next != null && ptr.data != value)
{
preptr=ptr;
ptr=ptr.next;
}

Node temp=new Node(data);

if(ptr == preptr)
{
temp.next=head;
return temp;
}

temp.next=ptr;
preptr.next=temp;
return head;
}

head=new Node(data);
return head;
}



private Node insertAfter(Node head,int data,int value)		//INSERTION AFTER A GIVEN VALUE
{
if(head != null)
{
Node ptr=head;

while(ptr != null && ptr.next != null && ptr.data != value)
ptr=ptr.next;

Node temp=new Node(data);
temp.next=ptr.next;
ptr.next=temp;
return head;
}

head=new Node(data);
return head;
}



private Node insertAtMid(Node head,int data)				//INSERTION AT MID POSITION
{

if(head != null)
{
Node tail=head;
int counter=1;								//COUNT OF NODES
while(tail.next != null)
{
tail=tail.next;
++counter;
}

tail=head;
int count=1;								//COUNT OF POSITION
while(tail != null && tail.next != null && count < counter/2)
{
tail=tail.next;
++count;
}

Node temp=new Node(data);
temp.next=tail.next;
tail.next=temp;
return head;
}

head=new Node(data);
return head;
}



private Node insertAt(Node head,int data,int x)			//INSERTION AT GIVEN POSITION
{
if(x < 1)
{
System.out.println("#INVALID POSTION!!");
return head;
}

if(head != null)
{
int counter=1;
Node ptr=head;
Node preptr=head;
Node temp=new Node(data);

while(ptr != null && counter < x)
{
preptr=ptr;
ptr=ptr.next;
++counter;
}

if(preptr == ptr)							//CASE OF INSERTION AT 1ST POSITION
{
temp.next=head;
return temp;
}

temp.next=preptr.next;
preptr.next=temp;
return head;
}

head=new Node(data);							//CASE OF EMPTY LINKEDLIST
return head;
}



private Node deletionAtBegin(Node head)				//DELETION AT BEGINNING
{
if(head != null)
return head.next;

System.out.println("#CASE OF UNDERFLOW!!");
return head;
}



private Node deletionAtEnd(Node head)					//DELETION AT END
{
Node ptr=head;
Node preptr=head;

if(head != null)
{
while(ptr.next != null)
{
preptr=ptr;
ptr=ptr.next;
}

preptr.next=null;
return head;
}
System.out.println("#CASE OF UNDERFLOW!!");
return head;
}



private Node deleteAt(Node head,int x)				//DELETION AT GIVEN POSITION
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
int count=1;

while(ptr.next != null && count < x)
{
preptr=ptr;
ptr=ptr.next;
++count;
}

if(preptr == ptr) return head.next;					//CASE OF DELETION AT 1ST POSITION

if(count != x) return head;						//CASE OF INVALID POSITION

preptr.next=ptr.next;
return head;
}

System.out.println("#CASE OF UNDERFLOW!!");
return head;
}



private Node delete(Node head,int value)				//DELETION BY VALUE
{
if(head != null)
{
Node ptr=head;
Node preptr=head;

while(ptr.next != null && ptr.data != value)
{
preptr=ptr;
ptr=ptr.next;
}

if(ptr == preptr) return head.next;					//CASE OF DELETION OF 1ST ELEMENT

if(ptr != preptr && ptr.data != value) return head;			//CASE OF NO MATCH FOUND

preptr.next=ptr.next;
return head;
}
System.out.println("#CASE OF UNDERFLOW!!");
return head;
}



//#METHOD-1 TO REVERSE LINKEDLIST:-
private Node reverseLL(Node head)					//REVERSE LINKEDLIST
{
if(head != null)
{
Node prehead=head;							//TO BREAK LINK WITH PREVIOUS ELEMENT CONSUMING MEMORY
Node ptr=null;
Node preptr=ptr;

while(head != null)
{
preptr=ptr;								//OLD REFERANCE
ptr=insertAtEnd(null,head.data);
ptr.next=preptr;							//LINKING

prehead=head;
head=head.next;
prehead.next=null;
}
return ptr;
}

System.out.println("#EMPTY LINKEDLIST!!");
return head;
}



/*
//#METHOD-2 TO REVERSE LINKEDLIST:-

private Node reverseLL(Node head)					//REVERSE LINKEDLIST
{
if(head != null)
{
Node ptr=null;
Node prehead=head;							//TO BREAK LINK WITH PREVIOUS ELEMENT CONSUMING MEMORY

while(head != null)
{
ptr=insertAtBegin(ptr,head.data);

prehead=head;
head=head.next;
prehead.next=null;
}
return ptr;								//NEW HEAD
}

System.out.println("#NOTHING TO REVERSE -> EMPTY LINKEDLIST!!");
return head;
}*/


private boolean check(Node p)						//CHECKS LINKEDLIST IS IN NON-DECREASING FORMAT OR NOT...
{
return ((p == null) || (p.next == null) || (p.data <= p.next.data && check(p.next)));
}


private void Print(Node head)						//PRINT METHOD
{
System.out.print("LINKEDLIST: ");
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

public Node(int data)
{
this.data=data;
this.next=null;
}
}
//OPERATIONS IN A LINKEDLIST
