package SINGLYLINKEDLIST;
import java.util.Scanner;

public class SortList
{
Node head;								//START NODE

public SortList()
{}

public SortList(int data)
{
if(head == null)
head=new Node(data);
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("ENTER THE NO. OF ELEMENTS IN A LINKEDLIST: ");
int n=sc.nextInt();

SortList list=null;
if(n > 0)
{
System.out.print("SCAN LINKEDLIST ELEMENTS: ");
list=new SortList(sc.nextInt());

Node temp=list.head;
while(n-- != 1)
{
temp.next=new Node(sc.nextInt());
temp=temp.next;
}
}
else list=new SortList();

list.head=list.sortLL(list.head);
list.Print(list.head);
}



private Node sortLL(Node head)					//SORT LINKEDLIST
{
if(head != null)
{
Node HEAD=null;							//HEAD OF SORTED LINKEDLIST
Node ptr1=head;							//POINTER ON UN-SORTED LINKEDLIST

while(ptr1 != null)
{
if(HEAD != null)
{
Node temp=new Node(ptr1.data);					//NODE TO BE INSERTED

if(temp.data < HEAD.data)						//INSERTION AT HEAD
{
temp.next=HEAD;
HEAD=temp;
//System.out.println("UPDATING HEAD: "+HEAD.data);
}
else
{
Node ptr2=HEAD;							//PTR ON SORTED LIST
Node preptr2=ptr2;							//PRE-PTR ON SOTED LIST

while(ptr2 != null && (ptr2.data <= ptr1.data))
{
preptr2=ptr2;
//System.out.println("PREPTR: "+preptr2.data);
ptr2=ptr2.next;
}

temp.next=preptr2.next;
preptr2.next=temp;
}
}
else HEAD=new Node(ptr1.data);					//INITIALIZING HEAD
ptr1=ptr1.next;
}
return HEAD;
}


System.out.println("#NOTHING TO SORT -> EMPTY LINKEDLIST");
return head;
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
//SORT LINKEDLIST
