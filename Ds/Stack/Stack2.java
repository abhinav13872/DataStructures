package STACK;
import java.util.*;
public class Stack2
{
Node top;//TOP NODE'S REFERANCE
Node head;//NODE'S HEAD REFERANCE
Node tail;//2ND LAST NODE'S REFERANCE
/*
Instance variables get initialized with their default value
S these referances will be initialized with null
*/

boolean isEmpty()
{
if(top==null) return true;
return false;
}


int peek()
{
if(this.isEmpty())
{
System.out.println("CAN'T SEE TOP->STACK IS EMPTY!!");
return -1;
}
return top.data;//RETURNS DATA OF ELEMENT AT TOP
}


void push(int data)
{
if(top==null)
{
head=new Node(data);
top=head;
return;
}
tail=top;
top.next=new Node(data);
top=top.next;
}


int pop()
{
if(this.isEmpty())
{
System.out.println("CAN'T POP ANY ELEMENT->STACK IS EMPTY");
return -1;
}
int d=tail.next.data;
tail.next=null;
top=tail;
return d;
}


public static void main(String[] args)
{
Stack2 s=new Stack2();
System.out.println("EMPTY STACK: "+s.isEmpty());
System.out.println("ELEMENT POPED: "+s.pop());
s.push(1);
s.push(2);
s.pop();
s.push(3);
s.push(4);
s.push(5);
s.pop();
s.push(6);
s.push(7);
s.push(8);
s.push(9);
s.pop();
s.push(10);
System.out.print("LINKEDLIST: ");
Print(s.head);
System.out.println("ELEMENT AT PEEK: "+s.peek());

}


public static void Print(Node head)
{
while(head!=null)
{
System.out.print(head.data+" ");
head=head.next;
}
System.out.println();
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
