package CIRCULARLINKEDLIST;
import java.util.Scanner;

public class CList2
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

Print(head);

Node t1=listCut(head);
Print(head);
Print(t1);
}
}


private static Node listCut(Node head)
{
if(head != null)
{
Node tail=head;									//LAST NODE
while(tail.next != head) tail=tail.next;

Node fptr=head;									//FAST POINTER
Node sptr=head;									//SLOW POINTER
Node presptr=sptr;
while(true)
{
presptr=sptr;
fptr=fptr.next.next;
sptr=sptr.next;
if(fptr == head || fptr.next == head) break;
}

//NOW SLOW POINTER WILL BE  AT MID(CEIL VALUE)
presptr.next=head;

Node HEAD=sptr;									//HEAD OF SECOND LIST
tail.next=HEAD;	
return HEAD;
}
return head;
}


private static Node insertAtBegin(Node head,int data)				//INSERTION AT BEGINNING
{
Node HEAD=head;									//HEAD OF CIRCULAR_LINKEDLIST

if(HEAD != null)
{
Node tail=head;									//TAIL OF CIRCULAR_LINKEDLIST
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



private static Node insertAtEnd(Node head,int data)					//INSERTION AT END
{
Node HEAD=head;									//HEAD OF CIRCULAR_LINKEDLIST
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


private static void Print(Node head)							//PRINT METHOD
{
System.out.print("CIRCULAR_LINKEDLIST: ");
Node tail=head;

do
{
System.out.print(tail.data+" ");
tail=tail.next;
}
while(tail != head);
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
//CUT "CIRCULAR_LINKEDLIST" IN TWO PARTS BY MID

/*
TESTCASES:-

4
1 2 3 4
5
OUTPUT:-
=>1 2
=>3 4

5
1 2 3 4 5
OUTPUT:-
=>1 2
=>3 4 5
*/
