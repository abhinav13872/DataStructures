package DOUBLYLINKEDLIST;
import java.util.Scanner;

public class DList1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
Node head=null;								//START NODE
System.out.print("ENTER THE NO. OF ELEMENTS IN A DOUBLYLINKEDLIST: ");
int n=sc.nextInt();

if(n > 0) System.out.print("SCAN DOUBLYLINKEDLIST ELEMENTS: ");

while(n-- > 0) head=insertAtEnd(head,sc.nextInt());
Print(head);

System.out.print("ENTER THE DATA TO FOR INSERTION AT BEGINNING: ");
head=insertAtBegan(head,sc.nextInt());
Print(head);

System.out.println("#INSERTION BEFORE VALUE:-");
System.out.print("ENTER THE DATA AND VALUE: ");
head=insertBefore(head,sc.nextInt(),sc.nextInt());
Print(head);

System.out.println("#INSERTION AFTER VALUE:-");
System.out.print("ENTER THE DATA AND VALUE: ");
head=insertAfter(head,sc.nextInt(),sc.nextInt());
Print(head);

System.out.print("ENTER THE DATA FOR INSERTION AT MID POSITION: ");
head=insertAtMid(head,sc.nextInt());
Print(head);

System.out.print("ENTER THE DATA AND POSITION FOR INSERTION: ");
head=insertAt(head,sc.nextInt(),sc.nextInt());
Print(head);

System.out.println("DELETION AT BEGINNING:- ");
head=deletionAtBegan(head);
Print(head);

System.out.println("DELETION AT END:- ");
head=deletionAtEnd(head);
Print(head);

System.out.print("ENTER POSITION FOR DELETION: ");
head=deleteAt(head,sc.nextInt());
Print(head);

System.out.print("ENTER THE VALUE FOR DELETION: ");
head=delete(head,sc.nextInt());
Print(head);

System.out.println("#REVERSING DOUBLYLINKEDLIST:- ");
head=reverseLL(head);
Print(head);
}


private static Node insertAtBegan(Node head,int data)			//INSERTION AT BEGINNING
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


private static Node insertAtEnd(Node head,int data)				//INSERTION AT END
{
if(head != null)
{
Node tail=head;								//LAST NODE
while(tail.next != null) tail=tail.next;

Node temp=new Node(data);
tail.next=temp;								//UPDATING LASTNODE's NEXT LINK
temp.prev=tail;								//UPDATING NODE's PREVIOUS LINK
return head;
}

head=new Node(data);
return head;
}


private static Node insertAtMid(Node head,int data)
{
if(head != null)
{
Node fptr=head;								//FAST-POINTER
Node sptr=head;								//SLOW-POINTER
Node temp=new Node(data);							//NODE TO BE INSERTED

while(fptr != null && fptr.next != null)
{
fptr=fptr.next.next;
sptr=sptr.next;
}

if(sptr.next != null)								//CASE OF MULTIPLE NODES
{
temp.next=sptr;
temp.prev=sptr.prev;
sptr.prev.next=temp;
sptr.prev=temp;
return head;
}

sptr.next=temp;								//CASE OF SINGLE NODE
temp.prev=sptr;
return head;
}
head=new Node(data);
return head;
}


private static Node insertBefore(Node head,int data,int value)
{
if(head != null)
{
Node ptr=head;
Node temp=new Node(data);							//NODE TO BE INSERTED

while(ptr.next != null && ptr.data != value)
{
ptr=ptr.next;
}

if(ptr.data == head.data)							//INSERTION AT HEAD
{
temp.next=head;
head.prev=temp;
return temp;
}

if(ptr.data != value)								//CASE OF NO MATCH OF GIVEN VALUE FOUND
{
ptr.next=temp;
temp.prev=ptr;
return head;
}

temp.next=ptr;
ptr.prev.next=temp;
temp.prev=ptr.prev;
ptr.prev=temp;
return head;
}
head=new Node(data);
return head;
}


private static Node insertAfter(Node head,int data,int value)
{
if(head != null)
{
Node ptr=head;
Node temp=new Node(data);							//NODE TO BE INSERTED

while(ptr.next != null && ptr.data != value) ptr=ptr.next;

if(ptr.data != value || ptr.next == null)					//CASE OF NO MATCH FOUND
{
ptr.next=temp;
temp.prev=ptr;
return head;
}

//LINKING ACCORDINGLY:-
temp.next=ptr.next;
ptr.next.prev=temp;
ptr.next=temp;
temp.prev=ptr;
return head;
}

head=new Node(data);
return head;
}


private static Node insertAt(Node head,int data,int x)
{
if(x < 1)
{
System.out.println("#INVALID POSITION");
return head;
}

if(head != null)
{
Node ptr=head;
Node temp=new Node(data);							//NODE TO BE INSERTED

int count=1;

while(ptr.next != null &&  count < x)
{
count++;
ptr=ptr.next;
}

//CASE OF INSERTION AT END:-
if(count != x)
{
ptr.next=temp;
temp.prev=ptr;
return head;
}

//CASE OF INSERTION IN BETWEEN THE LIST:-
if(ptr.prev != null)
{
temp.next=ptr;
temp.prev=ptr.prev;
ptr.prev.next=temp;
ptr.prev=temp;
return head;
}

//CASE OF INSERTION AT HEAD:-
temp.next=head;
head.prev=temp;
return temp;
}

head=new Node(data);
return head;
}


private static Node deletionAtBegan(Node head)
{
if(head != null)
{
head.next.prev=null;
return head.next;
}
System.out.println("#UNDERFLOW!!");
return head;
}


private static Node deletionAtEnd(Node head)
{
if(head != null)
{
Node tail=head;
while(tail.next != null) tail=tail.next;

//CASE OF MULTIPLE NODES:-
if(tail.prev != null)
{
tail.prev.next=null;
tail.prev=null;
return head;
}

//CASE OF SINGLE NODE:-
return null;
}
System.out.println("#UNDERFLOW!!");
return head;
}


private static Node deleteAt(Node head,int x)
{
if(x < 1)
{
System.out.println("#INVALID POSITION");
return head;
}

if(head != null)
{
Node ptr=head;
int count=1;

while(ptr.next != null && count < x)
{
ptr=ptr.next;
count++;
}

//CASE OF INVALID POSITION:-
if(count != x)
{
System.out.println("#INVALID POSITION -> NO DELETION");
return head;
}

//CASE WHEN POSITION IS GREATER THAN 1:-
if(ptr.prev != null)
{
if(ptr.next != null)
{
ptr.prev.next=ptr.next;
ptr.next.prev=ptr.prev;

ptr.next=null;
ptr.prev=null;
return head;
}

//CASE OF DELETION AT END:-
ptr.prev.next=null;
ptr.prev=null;
return head;
}

//CASE OF DELETION AT HEAD:-
if(head.next != null) head.next.prev=null;
return head.next;
}

System.out.println("#UNDERFLOW!!");
return head;
}


private static Node delete(Node head,int value)
{
if(head != null)
{
Node ptr=head;

while(ptr.next != null && ptr.data != value) ptr=ptr.next;

if(ptr.data != value)							
{
System.out.println("#NO MATCH FOUND -> NO DELETION");
return head;
}

if(ptr.prev != null)
{
if(ptr.next != null)
{
ptr.prev.next=ptr.next;
ptr.next.prev=ptr.prev;

ptr.next=null;
ptr.prev=null;
return head;
}

//CASE OF DELETION AT END:-
ptr.prev.next=null;
ptr.prev=null;
return head;
}

//CASE OF DELETION AT HEAD:-
if(head.next != null) head.next.prev=null;
return head.next;
}
System.out.println("#UNDERFLOW!!");
return head;
}


private static Node reverseLL(Node head)
{
if(head != null)
{
Node HEAD=null;								//HAED OF REVERSED LIST
while(head != null)
{
HEAD=insertAtBegan(HEAD,head.data);
head=head.next;
}
return HEAD;
}
return head;
}


private static void Print(Node head)						//PRINT METHOD
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


class Node
{
int data;									//NODE's DATA
Node prev;									//NODE's PREVIOUS LINK
Node next;									//NODE's NEXT LINK

public Node(int data)
{
this.data=data;
prev=null;
next=null;
}
}
//OPERATIONS ON DOUBLYLINKEDLIST
