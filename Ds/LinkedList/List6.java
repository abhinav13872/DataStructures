package LINKEDLIST;
import java.util.*;


class Node
{
int data;//DATA
Node next;//NEXT REFERANCE
public Node(int data)
{
this.data=data;
this.next=null;
}
}
public class List6
{
Node head=null;
Node tail=null;

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("ENTER THE NO. OF TESTCASES: ");
int T=sc.nextInt();
while(T-->0)
{
System.out.print("ENTER THE SIZE. OF LINKEDLIST1: ");
int n1=sc.nextInt();//SIZE
System.out.print("ENTER THE SIZE. OF LINKEDLIST2: ");
int n2=sc.nextInt();
System.out.print("ENTER THE SIZE. OF LINKEDLIST3: ");
int n3=sc.nextInt();
List6 l1=new List6();
List6 l2=new List6();
List6 l3=new List6();

System.out.print("SCAN LINKEDLIST1: ");
Node head1=new Node(sc.nextInt());
Node tail1=head1;
for(int i=1;i<n1;i++)
{
tail1.next=(new Node(sc.nextInt()));
tail1=tail1.next;//STORING END'S REFERANCE
}

System.out.print("SCAN LINKEDLIST2: ");
Node head2=new Node(sc.nextInt());
Node tail2=head2;
for(int i=1;i<n2;i++)
{
tail2.next=(new Node(sc.nextInt()));
tail2=tail2.next;//STORING END'S REFERANCE
}

System.out.print("SCAN LINKEDLIST3: ");
Node head3=new Node(sc.nextInt());
tail1.next=head3;//LINKING LINKEDLIST1 WITH LINKEDLIST3
tail2.next=head3;//LINKING LINKEDLIST2 WITH LINKEDLIST3
Node tail3=head3;
for(int i=1;i<n3;i++)
{
tail3.next=(new Node(sc.nextInt()));
tail3=tail3.next;
}

System.out.print("LINKEDLIST1: ");
Print(head1);
System.out.print("LINKEDLIST2: ");
Print(head2);
Intersect obj=new Intersect();
System.out.println("ELEMENT AT INTERSECTION: "+obj.intersectPoint(head1,head2));
}
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
class Intersect
{
int intersectPoint(Node headA, Node headB)
{
Node tempA=headA;
Node tempB=headB;
int lenA=0;
int lenB=0;
while(tempA!=null)
{
lenA++;
tempA=tempA.next;
}
while(tempB!=null)
{
lenB++;
tempB=tempB.next;
}
int diff=Math.abs(lenA-lenB);
if(lenA>=lenB)
{
tempA=headA;
tempB=headB;
}
else
{
tempA=headB;
tempB=headA;
}
for(int i=0;i<diff;i++)
tempA=tempA.next;
while(tempA!=null&&tempB!=null)
{
if(tempA==tempB)
{return tempA.data;}
tempB=tempB.next;
tempA=tempA.next;
}
return -1;
}
}
//INTERSECTION POINT IN Y SHAPED LINKED-LIST
/*
INPUT:-
2
2 3 2
10 20
30 40 50
5 10
2 3 2
10 20
30 40 50
10 20
OUTPUT:-
5
10
*/
