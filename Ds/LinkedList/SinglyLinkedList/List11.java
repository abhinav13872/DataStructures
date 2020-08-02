package SINGLYLINKEDLIST;
import java.util.Scanner;
import java.util.Stack;


public class List11
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

Node head1=null;
System.out.print("LINKEDLIST-1 SIZE: ");
int n1=sc.nextInt();

if(n1 > 0)
{
System.out.print("SCAN LINKEDLIST-1: ");
while(n1-- > 0) head1=insertAtEnd(head1,sc.nextInt());
}

Node head2=null;
System.out.print("LINKEDLIST-2 SIZE: ");
int n2=sc.nextInt();

if(n2 > 0)
{
System.out.print("SCAN LINKEDLIST-2: ");
while(n2-- > 0) head2=insertAtEnd(head2,sc.nextInt());
}

//Print(head1);
//Print(head2);

System.out.println("#SUM:- ");
Node SUM=sum(head1,head2);
Print(SUM);

System.out.println("#SUBTRACTION:- ");
Node SUB=sub(head1,head2);
Print(SUB);
}




private static Node sum(Node head1,Node head2)				//SUM
{
Node HEAD1=head1;
Node HEAD2=head2;

Stack<Integer> s1=new Stack<>();						//LIST1's STACK
Stack<Integer> s2=new Stack<>();						//LIST2's STACK
Stack<Integer> res=new Stack<>();						//RESULT's STACK

//FILLING OF STACK-1 (s1):-
while(HEAD1 != null)
{
s1.push(HEAD1.data);
HEAD1=HEAD1.next;
}

//FILLING OF STACK-2 (s2):-
while(HEAD2 != null)
{
s2.push(HEAD2.data);
HEAD2=HEAD2.next;
}

int c=0;									//CARRY
while(!s1.isEmpty() || !s2.isEmpty())
{
int a = s1.isEmpty() ? 0 : s1.pop();
int b = s2.isEmpty() ? 0 : s2.pop();
int x= a + b + c;
c=x/10;
//System.out.println("CARRY IS: "+c);
int z=x%10;
//System.out.println("Z PUSHED TO STACK IS: "+z);
res.push(z);
}
if(c != 0) res.push(c);
/*
IF THE CARRY DOESN'T GET BALANCED MEANS IT HAS TO
BE ADDED...
*/

Node head3=null;
while(!res.isEmpty()) head3=insertAtEnd(head3,res.pop());
return head3;
}




static int sign=1;								//SIGN
private static Node sub(Node head1,Node head2)				//SUBTRACTION
{
Node HEAD1=head1;
Node HEAD2=head2;

Stack<Integer> s1=new Stack<>();						//LIST1's STACK
Stack<Integer> s2=new Stack<>();						//LIST2's STACK
Stack<Integer> res=new Stack<>();						//RESULT's STACK

//FILLING OF STACK-1 (s1):-
while(HEAD1 != null)
{
s1.push(HEAD1.data);
HEAD1=HEAD1.next;
}

//FILLING OF STACK-2 (s2):-
while(HEAD2 != null)
{
s2.push(HEAD2.data);
HEAD2=HEAD2.next;
}

int bor=0;									//BORROW
while(!s1.isEmpty() || !s2.isEmpty())
{
int a = s1.isEmpty() ? 0 : s1.pop();
int b = s2.isEmpty() ? 0 : s2.pop();

if(a < b)
{
a = a + 10 - bor;
bor=1;
}
else if(a > b)
{
a= a - bor;
bor=0;
}
 
int x= a - b;
res.push(x);
}

if(bor != 0) 
{
sign=-1;
System.out.println("[\"NO.s SWAPPED AND SIGNS CHANGED\"]");
return sub(head2,head1);
}
/*
IF THE BORROW DOESN'T GET BALANCED MEANS SECOND NO. IS GREATER
THAN FIRST SO SWAP AND HENCE CHANGE THE SIGN...
*/

Node head3=null;
while(!res.isEmpty()) head3=insertAtEnd(head3,(sign * res.pop()));
return head3;
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




private static void Print(Node head)						//PRINT
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
//"SUM" AND "SUBTRACTION" OF NO's OF LINKEDLISTS
