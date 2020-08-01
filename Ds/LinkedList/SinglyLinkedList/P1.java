package SINGLYLINKEDLIST;
import java.util.Scanner;

class Node {
int data;
Node next;
Node(){}
Node(int d) 
{
data=d;
}
}

class P1
{
static Node insertEnd(Node head, int data)
{
Node newLink = new Node(data);
Node last = head;
newLink.next = null;   					// link new node to NULL as it is last node
if (head == null)  						// if list is empty add in beginning.
{
head = newLink;
return head;
}
while (last.next != null)					// Find the last node
last = last.next;
last.next = newLink;  						// Add the node after the last node of list
return head;
}

static void forwardPrint(Node head)
{
Node current = head; 						// start at beginning of list
while(current != null) 					// until end of list,
{
System.out.print(current.data + " "); 			// print data
current = current.next; 					// move to next link
}
}

public static void main(String[] args)
{
int t,n,m,x;
Scanner s = new Scanner(System.in);
t=Integer.parseInt(s.nextLine().trim());
while(t>0)
{
Node head = null, head2=null, t1;
n = s.nextInt();
while(n>0)
{
m = s.nextInt();
head = insertEnd(head, m);
n--;
}
n = s.nextInt();
while(n>0)
{
m = s.nextInt();
head2 = insertEnd(head2, m);
n--;
}
t1 = Result.addListNumbers(head, head2);
forwardPrint(t1);
System.out.println();
t--;
}
}
}


class Result
{
static Node addListNumbers(Node head1, Node head2)
{
String str1="",str2="";
Node head3=null;
int sum=0;

StringBuilder sb1=new StringBuilder();
while(head1 != null)
{
str1+=head1.data;
head1=head1.next;
}

if(str1.length() > 0)
{
sb1.append(str1);
str1=String.valueOf(sb1.reverse());
}
else str1="0";
//System.out.println("str1=> "+"\'"+str1+"\'");

StringBuilder sb2=new StringBuilder();
while(head2 != null)
{
str2+=head2.data;
head2=head2.next;
}

if(str2.length() > 0)
{
sb2.append(str2);
str2=String.valueOf(sb2.reverse());
}
else str2="0";
//System.out.println("str2=> "+"\'"+str2+"\'");

int x=Integer.parseInt(str1);
System.out.println("x=> "+"\'"+x+"\'");

int y=Integer.parseInt(str2);
System.out.println("y=> "+"\'"+y+"\'");

if(str1.length() > 0 && str2.length() > 0) sum=x+y;
else if(str1.length() > 0) sum=x;
else sum=y;

//System.out.println("sum=> "+"\'"+sum+"\'");

while(sum != 0)
{
head3=P1.insertEnd(head3,sum%10);
sum=sum/10;
}
return head3;
}
}
