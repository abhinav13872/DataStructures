package SINGLYLINKEDLIST;
import java.util.*;


public class List14
{
static Node head=null;								//HEAD OF LINKEDLIST
static Node HEAD=null;								//REF. OF HEAD

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Scan LINKEDLIST size: ");
int n=sc.nextInt();

if(n > 0)
{
System.out.print("Scan LINKEDLIST: ");
while(n-- > 0) head=insertAtEnd(head,sc.nextInt());
HEAD=head;
}

System.out.println("LINKEDLIST IS PALLINDROME: "+isPallindrome(head));

System.out.println("MIDDLE ELEMENT IS: "+ midElement(head));

System.out.print("ENTER THE VALUE OF N: ");
Node temp=NthNode(head,sc.nextInt());
System.out.println("Nth NODE FROM END: "+temp.data);

/*
//TO CREATE LOOP:-
Node tail=head;
while(tail.next != null) tail=tail.next;
tail.next=head;
*/

System.out.println("LOOP PRESENT IN A LINKEDLIST: "+detectLoop(head));
}


private static boolean isPallindrome(Node head)				//PALLINDROME
{
if(head != null)
{
Node fptr=head;
Node sptr=head;

while(fptr != null && fptr.next != null)
{
fptr=fptr.next.next;
sptr=sptr.next;
}
//NOW "sptr" WILL BE AT MID(CEIL)..

return checkPallindrome(head,sptr);
}
return false;
}


private static boolean checkPallindrome(Node head,Node mid)			//CHECKS PALLINDROME USING LINKEDLIST
{
Node head1=null;
Node head2=null;
Node premid=null;

int count=0;

while(head != mid)
{
head1=insertAtEnd(head1,head.data);
head=head.next;
premid=head;
count++;
}

System.out.println("COUNT: "+count);
Print(head1);

if(count%2 != 0) head2=mid;
else head2=mid.next;

head2=reverse(head2);
Print(head2);

while(head1 != null && head2 != null)
{
if(head1.data != head2.data) return false;
head1=head1.next;
head2=head2.next;
}
return true;
}


private static Node reverse(Node head)					//REVERSE LINKEDLIST
{
if(head != null)
{
Node temp=null;
while(head != null)
{
temp=insertAtBegin(temp,head.data);
head=head.next;
}
return temp;
}
return head;
}


private static int midElement(Node head)					//MIDDLE ELEMENT
{
Node sptr=head;
Node fptr=head;

while(fptr != null && fptr.next != null)
{
fptr=fptr.next.next;
sptr=sptr.next;
}
return sptr.data;
}


private static Node NthNode(Node head,int n)					//Nth NODE FROM END
{
if(head != null)
{
Node fptr=head;
Node sptr=head;

while(n-- > 1) fptr=fptr.next;

while(fptr.next != null)
{
fptr=fptr.next;
sptr=sptr.next;
}
return sptr;
}
return head;
} 


private static boolean detectLoop(Node head)					//DETECT LOOP
{
if(head != null)
{
Node fptr=head;
Node sptr=head;

while(fptr != null && fptr.next != null)
{
fptr=fptr.next.next;
sptr=sptr.next;
if(fptr == sptr) return true;
}

}
return false;
}


private static Node insertAtBegin(Node head,int data)			//INSERTION AT BEGINNING
{
if(head != null)
{
Node temp=new Node(data);
temp.next=head;
return temp;
}
head=new Node(data);
return head;
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
->PALLINDROME
->REVERSE LINKEDLIST
->MID ELEMENT
->Nth NODE FROM END
->DETECT LOOP
*/
