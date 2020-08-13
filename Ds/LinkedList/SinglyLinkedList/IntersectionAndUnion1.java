package SINGLYLINKEDLIST;
import java.util.Scanner;


class Node
{
int data;									//DATA
Node next;									//NEXT REFERANCE
public Node(int data)
{
this.data=data;
this.next=null;
}
}


public class IntersectionAndUnion1
{
Node head=null;
Node tail=null;

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("ENTER THE NO. OF TESTCASES: ");
int T=sc.nextInt();

while(T-- > 0)
{
Node head1=null;
Node head2=null;

System.out.print("SIZE OF LINKEDLIST-1: ");
int n1=sc.nextInt();
if(n1 > 0) System.out.print("SCAN LINKEDLIST-1: ");
while(n1-- > 0) head1=insertAtEnd(head1,sc.nextInt());
Print(head1);


System.out.print("SIZE OF LINKEDLIST-2: ");
int n2=sc.nextInt();
if(n2 > 0) System.out.print("SCAN LINKEDLIST-2: ");
while(n2-- > 0) head2=insertAtEnd(head2,sc.nextInt());
Print(head2);

Node head3=null;
System.out.println("#INTERSECTION:-");
head3=intersectionOfLists(head1,head2);
Print(head3);

Node head4=null;
System.out.println("#UNION:-");
head4=unionOfLists(head1,head2);
Print(head4);
}
}


private static Node intersectionOfLists(Node head1,Node head2)		//INTERSECTION
{
Node temp1=head1,temp2=head2;
Node head3=null;

while(temp1 != null)
{
temp2=head2;
while(temp2 != null)
{
if(temp1.data == temp2.data) head3=insertAtEnd(head3,temp1.data);
temp2=temp2.next;
}
temp1=temp1.next;
}

head3=sortList(head3);
return head3;
}


private static Node unionOfLists(Node head1,Node head2)			//UNION
{
Node temp1=head1,temp2=head2;
Node head3=null;

while(temp1 != null)
{
head3=insertAtEnd(head3,temp1.data);
temp1=temp1.next;
}

while(temp2 != null)
{
temp1=head3;
int flag=0;

while(temp1 != null)
{
if(temp1.data == temp2.data) flag=1;
temp1=temp1.next;
}

if(flag != 1) head3=insertAtEnd(head3,temp2.data);
temp2=temp2.next;
}

head3=sortList(head3);
return head3;
}


private static Node insertAtEnd(Node head,int data)				//INSERTION AT END
{
if(head != null)
{
Node tail=head;
while(tail.next != null) tail=tail.next;

tail.next=new Node(data);
return head;
}
head=new Node(data);
return head;
}


private static Node sortList(Node head)					//SORTS LINKEDLIST
{
if(head != null)
{
Node HEAD=null;								//HEAD OF SORTED LINKEDLIST
Node ptr1=head;								//POINTER IN UN-SORTED LINKEDLIST
Node ptr2=null;								//POINTER IN SORTED LINKEDLIST

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

if(ptr1.data <= ptr2.data)
{
if(ptr1.data < HEAD.data)
{
//INSERTION AT HEAD:
temp.next=ptr2;
HEAD=temp;
}
else
{
temp.next=ptr2;
preptr2.next=temp;
}
}

else
{
temp.next=null;
ptr2.next=temp;
}

}
else
{
//INITIALIZING HEAD:
temp.next=HEAD;
HEAD=temp;
}
ptr1=ptr1.next;
}
return HEAD;
}
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
//Sorted Intersection And Union Of 2 LinkedLists
//[O(m*n)]
