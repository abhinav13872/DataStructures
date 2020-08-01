package SINGLYLINKEDLIST;
import java.util.*;


public class List13
{
static Node head=null;								//HEAD OF LINKEDLIST
static Node HEAD=null;								//REF. OF HEAD

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Scan LINKEDLIST size: ");
int n=sc.nextInt();

System.out.print("Scan LINKEDLIST: ");
while(n-- > 0) head=insertAtEnd(head,sc.nextInt());
HEAD=head;

System.out.println("LINKEDLIST IS PALLINDROME: "+isPallindrome(head));
}


static boolean isPallindrome(Node head)
{
Node HEAD=head;
if(head != null)
{
String str="";
while(HEAD != null)
{
str+=HEAD.data;
HEAD=HEAD.next;
}

StringBuilder sb=new StringBuilder(str);
System.out.println("str=>"+ str);

if( str.equals(String.valueOf(sb.reverse())) ) return true;
}
return false;
}


private static Node insertAtEnd(Node head,int data)				//INSERTION AT END
{
if(head != null)
{
Node tail=head;
while(tail != null && tail.next != null) tail=tail.next;

Node temp=new Node(data);
tail.next=temp;
return head;
}
head=new Node(data);
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
System.out.println();
}
}



class Node									//NODE
{
int data;
Node next;
public Node(int data)
{
this.data=data;
this.next=null;
}
}
/*
PALLINDROME TEST
USING STRINGS..
*/
