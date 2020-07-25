package SINGLYLINKEDLIST;
import java.util.Scanner;

class Result {
static boolean checkPalindrome(Node head)
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
}


class Node {
int data;
Node next;
Node()
{}
Node(int d) {
data=d;
}
}


public class P2
{
static Node insertEnd(Node head, int data)
{
Node newLink = new Node(data);
Node last = head;
newLink.next = null;   					// link new node to NULL as it is last node
if (head == null)  					// if list is empty add in beginning.
{
head = newLink;
return head;
}
while (last.next != null)  				// Find the last node
last = last.next;
last.next = newLink;  					// Add the node after the last node of list
return head;
}


static void forwardPrint(Node head)
{
Node current = head; 					// start at beginning of list
while(current != null) 					// until end of list,
{
System.out.print(current.data + " "); 			// print data
current = current.next; 				// move to next link
}
}


public static void main(String[] args)
{
int t,n,m,x;
Scanner s = new Scanner(System.in);
System.out.print("ENTER THE NO. OF TESTCASES: ");
t=Integer.parseInt(s.nextLine());
while(t>0)
{
Node head = null;
System.out.print("ENTER THE NO. OF OF ELEMENTS FOR LINKEDLIST: ");
n = s.nextInt();
if(n > 0) 
{
System.out.print("SCAN LINKEDLIST: ");
while(n>0)
{
m = s.nextInt();
head = insertEnd(head, m);
n--;
}
boolean ans= Result.checkPalindrome(head);
System.out.println("PALLINDROME: "+ans);
}
else System.out.println("#EMPTY LINKEDLIST");      
t--;
}
}
}
//CHECK LINKEDLIST IS PALLINDROME
