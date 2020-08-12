package SINGLYLINKEDLIST;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;


class Node
{
int data;							//DATA
Node next;							//NEXT REFERANCE
public Node(int data)
{
this.data=data;
this.next=null;
}
}


public class IntersectionAndUnion
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

System.out.println("#UNION:-");
head3=unionOfLists(head1,head2);
Print(head3);
}
}


private static Node intersectionOfLists(Node head1,Node head2)
{
HashSet<Integer> set1=new HashSet<>();
HashSet<Integer> set2=new HashSet<>();

Node temp1=head1,temp2=head2;
int len1=0,len2=0;

while(temp1 != null)
{
len1++;
temp1=temp1.next;
}

while(temp2 != null)
{
len2++;
temp2=temp2.next;
}

if(len1 >= len2)
{
temp1=head1;
temp2=head2;
}
else
{
temp1=head2;
temp2=head1;
}

/*Now temp1 is pointing head
of longer list and temp2 is 
pointing to smaller one*/

while(temp1 != null)
{
set1.add(temp1.data);
temp1=temp1.next;
}

while(temp2 != null)
{
set2.add(temp2.data);
temp2=temp2.next;
}

Node head3=null;
//INTERSECTION:-
HashSet<Integer> set3=new HashSet<>(set1);
set3.retainAll(set2);

Iterator<Integer> itr=set3.iterator();
while(itr.hasNext()) head3=insertAtEnd(head3,itr.next());
return head3;
}


private static Node unionOfLists(Node head1,Node head2)
{
HashSet<Integer> set1=new HashSet<>();
HashSet<Integer> set2=new HashSet<>();

Node temp1=head1,temp2=head2;
int len1=0,len2=0;

while(temp1 != null)
{
len1++;
temp1=temp1.next;
}

while(temp2 != null)
{
len2++;
temp2=temp2.next;
}

if(len1 >= len2)
{
temp1=head1;
temp2=head2;
}
else
{
temp1=head2;
temp2=head1;
}

/*Now temp1 is pointing head
of longer list and temp2 is 
pointing to smaller one*/

while(temp1 != null)
{
set1.add(temp1.data);
temp1=temp1.next;
}

while(temp2 != null)
{
set2.add(temp2.data);
temp2=temp2.next;
}

Node head3=null;
//INTERSECTION:-
HashSet<Integer> set3=new HashSet<>(set1);
set3.addAll(set2);

Iterator<Integer> itr=set3.iterator();
while(itr.hasNext()) head3=insertAtEnd(head3,itr.next());
return head3;
}


private static Node insertAtEnd(Node head,int data)
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


private static void Print(Node head)
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
//INTERSECTION OF 2 LINKEDLISTS
