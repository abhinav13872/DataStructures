package SINGLYLINKEDLIST;
import java.util.Scanner;


public class RevAltGroups
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("SIZE OF LINKEDLIST: ");
int n=sc.nextInt();

if(n > 0) System.out.print("SCAN LINKEDLIST: ");
Node head=null;
while(n-- > 0) head=insertAtEnd(head,sc.nextInt());
Print(head);

Node head1=null;
System.out.print("ENTER THE SIZE OF GROUP: ");
head1=reverseAlternateGroups(head,sc.nextInt());
Print(head1);
}



private static Node reverseAlternateGroups(Node head,int k)				//REVERSE_ALT_K-NODES
{
if(head != null)
{
//CASE OF INVALID K:-
if(k <= 1) return head;


//CASE OF VALID K:-

/*
STEP-1: CREATE A EMPTY LINKEDLIST[HEAD]
STEP-2: TAKE "4 ptr's"
STEP-3: USE THEM APPROPRIATELY
	TO MARK THE GROUPS OF K-NODES
STEP-4: CREATE ONE LINKEDLIST AND
	INSERT THE ELEMENTS TO BE
	REVERSED...
STEP-5: ADD THIS LIST's ELEMENTS TO
	THE END OF LINKEDLIST[HEAD]
STEP-6: ADD THE REMAING LIST's ELEMENT
	TO THE END OF LINKEDLIST[HEAD]
*/

Node HEAD=null;									//RESULTANT LINKEDLIST's HEAD
Node ptr1=head;

while(ptr1 != null)
{
Node ptr2=ptr1;
int key=k;

while(key-- > 1 && ptr2.next != null) ptr2=ptr2.next;
//System.out.println("ptr1: "+ptr1.data);
//System.out.println("ptr2: "+ptr2.data);

Node temp=ptr1;
Node ptr3=ptr2.next;
if(ptr3 != null)
{
//System.out.println("ptr3: "+ptr3.data);
Node ptr4=ptr3;
key=k;
while(key-- > 1 && ptr4.next != null) ptr4=ptr4.next;
ptr1=ptr4.next;
//System.out.println("ptr4: "+ptr4.data);
}


Node head1=null;
while(temp != ptr3)
{
//System.out.println("------------------");
head1=insertAtBegin(head1,temp.data);
//System.out.println("temp: "+temp.data);
temp=temp.next;
}
//Print(head1);

temp=head1;
while(temp != null)
{
HEAD=insertAtEnd(HEAD,temp.data);
temp=temp.next;
}

if(ptr3 != null)
{
while(ptr3 != ptr1)
{
HEAD=insertAtEnd(HEAD,ptr3.data);
ptr3=ptr3.next;
}
}
else return HEAD;
}
return HEAD;
}
return head;
}



private static Node insertAtBegin(Node head,int data)				//INSERTION AT BEGINNING
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



private static Node insertAtEnd(Node head,int data)					//INSERTION AT END
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



private static void Print(Node head)							//PRINT METHOD
{
System.out.print("LINKEDLIST: ");
while(head != null)
{
System.out.print(head.data+" ");
head=head.next;
}
System.out.println("\n");
}
}




class Node
{
Node next;
int data;

public Node(int data)
{
this.data=data;
}
}
