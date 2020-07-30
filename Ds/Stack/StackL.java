package STACK;
import java.util.Scanner;

public class StackL
{
Node top;								//HEAD NODE(TOP)

private void push(int data)						//PUSH METHOD
{
if(top != null)
{
Node temp=new Node(data);
temp.next=top;
top=temp;								//UPDATING TOP
return;
}
top=new Node(data);
}

private int pop()							//POP METHOD
{
if(!this.isEmpty())
{
int DATA=top.data;
top=top.next;								//UPDATING TOP
return DATA;
}
System.out.println("#STACK UNDERFLOW");
return -1;
}


private int peek()							//PEEK METHOD
{
if(!this.isEmpty()) return top.data;
System.out.println("#STACK UNDERFLOW");
return -1;
}


private boolean isEmpty()						//ISEMPTY METHOD
{
if(top != null) return false;
return true;
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
StackL s1=new StackL();

System.out.print("SCAN NO. OF ELEMENT TO BE PUSHED: ");
int n=sc.nextInt();

System.out.print("SCAN ELEMENTS: ");
while(n-- > 0) s1.push(sc.nextInt());

System.out.println("ELEMENT POPPED: "+s1.pop());
}
}


class Node
{
int data;
Node next;
Node(int data)
{
this.data=data;
}
}
//IMPLEMENTATION OF STACK USING LINKEDLIST
