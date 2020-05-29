package LINKEDLIST;
public class List1
{
public static void main(String[] args)
{
/*
AVOID USING REFERANCE OF HEAD SINCE NULL REACH KRNE 
KE BAAD WE CANT PRINT AGAIN BCOZ HEAD IS NULL ATLAST!!
Node head=new Node(1);//STEP-1
head.next=new Node(2);
head.next.next=new Node(3);
head.next.next.next=new Node(4);
while(head!=null)
{
System.out.println(head.data);
head=head.next;
}
while(head!=null)
{
System.out.println(head.data);
head=head.next;
}*/
Node head=new Node(1);
Node temp=head;//STORING REFERANCE OF HEAD
temp.next=new Node(2);
temp.next.next=new Node(3);
temp.next.next.next=new Node(4);

head=insertAtHead(head,5);//INSERTION AT START
temp=head;//UPDATION IN REFERANCE OF HEAD

insertAtEnd(head,6);//INSERTION AT END
while(temp!=null)
{
System.out.print(temp.data+" ");
temp=temp.next;
}
System.out.println();
System.out.println("==>"+ head.getCount());//count of Nodes Created

}
static Node insertAtHead(Node head,int data)
{
Node temp1=new Node(data);
temp1.next=head;
head=temp1;
return head;
}
static void insertAtEnd(Node head,int data)
{
Node temp=new Node(data);
Node last=head;
while(last.next!=null)
{
last=last.next;
}
last.next=temp;
}
}
class Node
{
int data;//DATA
Node next;//NEXT REFERANCE
static int count;
public Node(int data)
{
this.data=data;
this.next=null;
count++;
}
int getCount()
{return count;}

}
