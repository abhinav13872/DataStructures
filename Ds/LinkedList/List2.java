package LINKEDLIST;
import java.util.Scanner;

public class List2
{
Node head;									//START NODE

public List2()
{}

public List2(int data)
{
if(head == null)
head=new Node(data);
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("ENTER THE NO. OF ELEMENTS IN A LINKEDLIST: ");
int n=sc.nextInt();

List2 list=null;
if(n > 0)
{
System.out.print("SCAN LINKEDLIST ELEMENTS: ");
list=new List2(sc.nextInt());

Node temp=list.head;
while(n-- != 1)
{
temp.next=new Node(sc.nextInt());
temp=temp.next;
}
}
else list=new List2();

System.out.println("MIDDLE ELEMENT IS: "+ list.midElement(list.head));
}


private int midElement(Node head)					//MIDDLE ELEMENT
{
Node sptr=head;
Node fptr=head;

while(fptr != null && fptr.next != null)
{
fptr=fptr.next.next;
sptr=sptr.next;
}
return sptr.data;
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
//MIDDLE ELEMENT IN A LINKEDLIST (CEIL VALUE)
