package SINGLYLINKEDLIST;
import java.util.Scanner;


public class ShiftMinMax
{
public static void main(String[] args)
{
int t=0,n=0,m=0;
Scanner s = new Scanner(System.in);

System.out.print("ENTER THE NO. OF TESTCASES: ");
t=Integer.parseInt(s.nextLine());

while(t-- > 0)
{
Node head = null;
System.out.print("ENTER THE NO. OF OF ELEMENTS FOR LINKEDLIST: ");
n = Integer.parseInt(s.nextLine());
if(n > 0) 
{
System.out.print("SCAN LINKEDLIST: ");

while(n-- > 0)
{
m=Integer.parseInt(s.next());
head = insertAtEnd(head, m);
}
}

head = shift(head);
forwardPrint(head);
}
}



private static Node shift(Node org)						//SHIFT METHOD
{
if(org != null)
{
Node HEAD=org;
int min=99999;									//MIN IN A LINKEDLIST
int max=-99999;								//MAX IN A LINKEDLIST

while(HEAD != null)
{
if(min > HEAD.data) min=HEAD.data;
if(max < HEAD.data) max=HEAD.data;
HEAD=HEAD.next;
}
System.out.println("min: "+min);
System.out.println("max: "+max);


if(min == max) return org;

//BREAKING THE MIN ELEMENT LINKS:-
if(min != org.data)
{
Node ptr=org;
Node preptr=ptr;

while(ptr.data != min)
{
preptr=ptr;
ptr=ptr.next;
}
preptr.next=ptr.next;
//ptr.next=null;
}
else org=org.next;

//INSERTING MIN ELEMENT AT HEAD:-
Node temp=new Node(min);
temp.next=org;
org=temp;									//UPDATING LINKEDLIST HEAD

Node ptr=org;
Node preptr=ptr;

while(ptr.data != max)
{
preptr=ptr;
ptr=ptr.next;
}

//BREAKING MAX ELEMENT LINKS
preptr.next=ptr.next;
ptr.next=null;

//INSERTING MAX ELEMENT AT END:-
Node tail=org;

while(tail.next != null) tail=tail.next;					//LASTNODE OF LINKEDLIST
tail.next=new Node(max);
return org;
}
return org;
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


private static void forwardPrint(Node head)					//PRINT
{
System.out.print("LINKEDLIST: ");
while(head!=null)
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
Node next;
public Node(int data)
{
this.data=data;
this.next=null;
}
}
//MOVE THE MIN TO HEAD AND MAX TO TAIL OF LINKEDLIST
