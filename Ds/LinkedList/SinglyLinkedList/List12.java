package SINGLYLINKEDLIST;
import java.util.*;


public class List12
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

Node tail=head;
while(tail.next != null) tail=tail.next;

System.out.println("LINKEDLIST IS PALLINDROME: "+isPallindrome(head));
}


private static boolean isPallindrome(Node head)				//PALLINDROME
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

/*
//METHOD-1:RECURSION
private static boolean checkPallindrome(Node ptr1,Node ptr2)			//CHECKS PALLINDROME
{
if(ptr2 == null) return true;

boolean result=checkPallindrome(ptr1,ptr2.next);
System.out.println("result: "+result);
if(!result) return false;
//IF "result" COMES FALSE THEN NO NEED TO CHECK FURTHER!

System.out.println("\nINITIALLY:-");
System.out.println("ptr1: "+ptr1.data);
System.out.println("ptr2: "+ptr2.data);

ptr1=HEAD;
HEAD=HEAD.next;

System.out.println("AFTER UPDATING \"ptr1\":-");
System.out.println("ptr1==> "+ptr1.data);
System.out.println("ptr2==> "+ptr2.data);

if(ptr1.data != ptr2.data) return false;
return true;
}*/


//METHOD-2:COMPARISION IN HALVES:
private static boolean checkPallindrome(Node ptr1,Node ptr2)			//CHECKS PALLINDROME
{

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
//PALLINDROME TEST
