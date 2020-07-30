package STACK;
import java.util.Scanner;

public class StackP
{
int size;
int arr[];
int top;

public StackP(int size)						//PARAMETERIZED CONSTRUCTOR
{
this.size=size;
arr=new int[size];
top=-1;
}


private void push(int data)						//PUSH METHOD
{
if(!this.isFull())
{
arr[++top]=data;
return;
}
System.out.println("#STACK OVERFLOW: ELEMENT -> "+data+" CAN'T BE PUSHED TO STACK");
}


private int pop()							//POP METHOD
{
if(!this.isEmpty()) return arr[top--];

System.out.println("#STACK UNDERFLOW");
return -1;
}


private int peek()							//PEEK METHOD
{
if(!this.isEmpty()) return arr[top];
System.out.println("#STACK UNDERFLOW");
return -1;
}


private boolean isEmpty()						//ISEMPTY METHOD
{
if(top != -1) return false;
return true;
}


private boolean isFull()						//ISFULL METHOD
{
if(top != size-1) return false;
return true;
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("ENTER THE SIZE OF STACK: ");
int size=sc.nextInt();

StackP s1=new StackP(size);
StackP s2=new StackP(size);

System.out.print("SCAN NO. OF ELEMENT TO BE PUSHED: ");
int n=sc.nextInt();

System.out.print("SCAN ELEMENTS: ");
while(n-- > 0) s1.push(sc.nextInt());


System.out.println("top: "+s1.top);
while(s1.top != -1)
{
s2.push(s1.pop());
//System.out.println("top: "+s1.top);
//System.out.println("ELEMENT PUSHED: "+s2.peek());
}

System.out.print("ELEMENT IN STACK: ");
while(s2.top != -1) System.out.print(s2.pop()+" ");
System.out.println();
}
}
//PRINT ELEMENTS IN THE SAME OREDER AS INSERTED IN STACK
