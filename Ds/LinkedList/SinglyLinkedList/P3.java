package SINGLYLINKEDLIST;
import java.util.Scanner;


class Node {
int data;
Node next;
Node()
{}
Node(int d) {
data=d;
}
}

public class P3
{
static Node shiftSmallLarge(Node org)
{
if(org != null)
{
System.out.println("-----------------");
Node HEAD=org;
int min=99999;							//MIN IN A LINKEDLIST
int max=-99999;						//MAX IN A LINKEDLIST
while(HEAD != null)
{
if(min > HEAD.data) min=HEAD.data;
if(max < HEAD.data) max=HEAD.data;
HEAD=HEAD.next;
}

System.out.println("min: "+min);
System.out.println("max: "+max);

//BREAKING THE MIN ELEMENT LINKS
if(min == max) return org;

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

//INSERTING MIN ELEMENT AT HEAD
Node temp=new Node(min);
temp.next=org;
org=temp;							//UPDATING LINKEDLIST HEAD

Node ptr=org;
Node preptr=ptr;
while(ptr.data != max)
{
preptr=ptr;
ptr=ptr.next;
}
//BREAKING MAX ELEMENT LINKS
preptr.next=ptr.next;
//ptr.next=null;

//INSERTING MAX ELEMENT AT END
Node tail=org;
while(tail.next != null) tail=tail.next;//LASTNODE OF LINKEDLIST
tail.next=new Node(max);
return org;
}
return org;
}


static Node insertEnd(Node head, int data)
{
Node newLink = new Node(data);
Node last = head;
newLink.next = null;   					// link new node to NULL as it is last node
if (head == null)  						// if list is empty add in beginning.
{
head = newLink;
return head;
}
while (last.next != null)  					// Find the last node
last = last.next;
last.next = newLink;  						// Add the node after the last node of list
return head;
}


static void forwardPrint(Node head)
{
Node current = head; 						// start at beginning of list
while(current != null) 					// until end of list,
{
System.out.print(current.data + " "); 			// print data
current = current.next; 					// move to next link
}
}


public static void main(String[] args)
{
int t=0,n=0,m=0;
Scanner s = new Scanner(System.in);
System.out.print("ENTER THE NO. OF TESTCASES: ");
t=Integer.parseInt(s.nextLine());
while(t>0)
{
Node head = null;
System.out.print("ENTER THE NO. OF OF ELEMENTS FOR LINKEDLIST: ");
n = Integer.parseInt(s.nextLine());
if(n > 0) 
{
System.out.print("SCAN LINKEDLIST: ");
while(n>0)
{
m=Integer.parseInt(s.next());
head = insertEnd(head, m);
n--;
}
}
head = shiftSmallLarge(head);
forwardPrint(head);
System.out.print("\n");     
t--;
}
}
}
//MOVE THE MIN TO HEAD AND MAX TO TAIL OF LINKEDLIST
