package SINGLYLINKEDLIST;
import java.util.Scanner;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
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


public class IntersectionAndUnion2
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
HashSet<Integer> set1=new LinkedHashSet<>();
HashSet<Integer> set2=new LinkedHashSet<>();

Node temp1=head1,temp2=head2;
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
HashSet<Integer> set3=new LinkedHashSet<>(set1);
set3.retainAll(set2);

/*Since set is a unordered collection
so we first convert into list
then convert back into set*/

/*LinkedHashSet preserves the order*/

List<Integer> list=new ArrayList<>(set3);
java.util.Collections.sort(list);

set3=new LinkedHashSet<>(list);

Iterator<Integer> itr=set3.iterator();
while(itr.hasNext()) head3=insertAtEnd(head3,itr.next());
return head3;
}


private static Node unionOfLists(Node head1,Node head2)
{
HashSet<Integer> set1=new LinkedHashSet<>();
HashSet<Integer> set2=new LinkedHashSet<>();

Node temp1=head1,temp2=head2;
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
//UNION:-
HashSet<Integer> set3=new LinkedHashSet<>(set2);
set3.addAll(set2);

/*Since set is a unordered collection
so we first convert into list
then convert back into set*/

/*LinkedHashSet preserves the order*/

List<Integer> list=new ArrayList<>(set3);
java.util.Collections.sort(list);

set3=new LinkedHashSet<>(list);

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
//Sorted Intersection And Union Of 2 LinkedLists
//[(O(m+n))]
