package QUEUE;
import java.util.Scanner;


class StackA
{
int size;
int arr[];
int top;

public StackA(int size)					//PARAMETERIZED CONSTRUCTOR
{
this.size=size;
arr=new int[size];
top=-1;
}


void push(int data)						//PUSH METHOD
{
if(!this.isFull())
{
arr[++top]=data;
return;
}
System.out.println("#STACK OVERFLOW: ELEMENT -> "+data+" CAN'T BE PUSHED TO STACK");
}


int pop()							//POP METHOD
{
if(!this.isEmpty()) return arr[top--];

System.out.println("#STACK UNDERFLOW");
return -1;
}


int peek()							//PEEK METHOD
{
if(!this.isEmpty()) return arr[top];
System.out.println("#STACK UNDERFLOW");
return -1;
}


boolean isEmpty()						//ISEMPTY METHOD
{
if(top != -1) return false;
return true;
}


boolean isFull()						//ISFULL METHOD
{
if(top != size-1) return false;
return true;
}


void Print(StackA s)						//PRINT METHOD
{
if(s.top == -1) return;


StackA s2=new StackA(size);

/*To Print we will use a ptr
to top i.e "TOP"
We will not pop the elements
for printing of Stack*/

int TOP=s.top;
while(TOP != -1) s2.push(arr[TOP--]);

while(s2.top != -1) System.out.print(s2.pop()+" ");
System.out.println();
}
}


public class QUStacks
{
void enqueue(StackA st1,StackA st2,int item)			//ENQUEUE
{
st1.push(item);
}


int dequeue(StackA st1,StackA st2)				//DEQUEUE
{
if(st1.isEmpty()) return -1;

/*
STEP-1: POP ALL THE ELEMENTS
	FROM STACK-1 AND PUSH TO
	STACK-2
STEP-2: NOW ELEMENT AT TOP OF
	STACK-1 IS THE ELEMENT
	TO BE DELETED
STEP-3: POP ALL THE ELEMENTS
	FROM STACK-2 AND PUSH
	TO STACK-1
	[TO MAINTAIN THE INSERTION]
*/	
while(st1.top != 0) st2.push(st1.pop());

int x=st1.pop();

while(!st2.isEmpty()) st1.push(st2.pop());
return x;
}



public static void main(String[] args)
{
Scanner s=new Scanner(System.in);

int t, n, q1, q2, k;
System.out.print("TESTCASES: ");
t = Integer.parseInt(s.nextLine());

QUStacks q = new QUStacks();
StackA st1=new StackA(100);
StackA st2=new StackA(100);

while(t-- > 0)
{
System.out.print("ENTER \'1\' TO ENQUEUE ELSE TO DEQUEUE: ");
q1 = s.nextInt();
if(q1 == 1)
{
System.out.print("ENTER AN ELEMENT TO BE ENQUEUED: ");
q.enqueue(st1, st2, s.nextInt());
}

else System.out.print("ITEM DEQUEUED: "+q.dequeue(st1, st2) + " ");

System.out.print("\nSTACK1: ");
st1.Print(st1);
System.out.print("\nSTACK2: ");
st2.Print(st2);
System.out.println("\n");
}
}
}
//Queue USING TWO Stacks
