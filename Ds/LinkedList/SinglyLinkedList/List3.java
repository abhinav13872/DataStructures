package SINGLYLINKEDLIST;
import java.util.Scanner;

public class List3
{
Node head;									//START NODE

public List3()
{}

public List3(int data)
{
if(head == null)
head=new Node(data);
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("ENTER THE NO. OF ELEMENTS IN A LINKEDLIST: ");
int n=sc.nextInt();

List3 list=null;
if(n > 0)
{
System.out.print("SCAN LINKEDLIST ELEMENTS: ");
list=new List3(sc.nextInt());

Node temp=list.head;
while(n-- != 1)
{
temp.next=new Node(sc.nextInt());
temp=temp.next;
}
}
else list=new List3();

list.head=list.sortLL(list.head);
list.Print(list.head);
}


private Node sortLL(Node head)					//SORT LINKEDLIST
{
if(head != null)
{
Node HEAD=null;							//HEAD OF SORTED LINKEDLIST
Node ptr1=head;							//POINTER IN UN-SORTED LINKEDLIST
Node ptr2=null;							//POINTER IN SORTED LINKEDLIST

while(ptr1 != null)
{
ptr2=HEAD;
Node preptr2=ptr2;

while(ptr2 != null && ptr2.next != null)
{
if(ptr1.data <= ptr2.data) break;

preptr2=ptr2;
ptr2=ptr2.next;
}


//LINKING:-
Node temp=new Node(ptr1.data);
if(HEAD != null)
{
if(ptr2.data <= ptr1.data)					//INSERTION IN BETWEEN THE SORTED LINKEDLIST [ptr2.data <= ptr1.data]
{
temp.next=ptr2.next;
ptr2.next=temp;
}
else  if(ptr2.data > ptr1.data)
{
if(ptr1.data < HEAD.data)
{
System.out.println("#UPDATING HEAD:"+temp.data);
temp.next=ptr2;
HEAD=temp;
}
else
{
temp.next=ptr2;
preptr2.next=temp;
}
}
}
else
{
System.out.println("#INITIALIZING HEAD:"+temp.data);
temp.next=HEAD;
HEAD=temp;
}

Print(HEAD);
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
