package STACK;
import java.util.Scanner;
import java.lang.String;


public class RevString
{
public static void main(String[] args)
{
CQStack theStack = new CQStack(100); // make new stack
Scanner s=new Scanner(System.in);
int t, n, q1, q2;
String st;
System.out.print("TESTCASES: ");
t = Integer.parseInt(s.nextLine().trim());

while(t > 0)
{
theStack.top = -1;

System.out.print("NO. OF STRINGS TO BE REVERSED: ");
n= Integer.parseInt(s.nextLine().trim());

while(n > 0)
{
st = s.nextLine().trim();
st = reverse(theStack, st);
System.out.println(st);
n--;
}
System.out.print("\n");
t--;
}
}


private static String reverse(CQStack s,String st)				//REVERSE STRING
{
for(int i=0;i<st.length();i++)
{s.push((int)st.charAt(i));}

StringBuilder sb=new StringBuilder();
while(!s.isEmpty()) sb.append((char)s.pop());
return sb.toString();
}
}


class CQStack
{
public int maxSize; // size of stack array
public int[] stackArray;
public int top; // top of stack

public CQStack(int s) // constructor
{
maxSize = s; // set array size
stackArray = new int[maxSize]; // create array
top = -1; // no items yet
}


public void push(int j) // put item on top of stack
{
if(isFull())
{
return;
}
else
{
stackArray[++top] = j; // increment top, insert item
}
}


public int pop() // take item from top of stack
{
if (isEmpty())
{
return -1;
}
else
{
int temp=stackArray[top--];
return temp; // access item, decrement top
}
}


public boolean isEmpty() // true if stack is empty
{
return (top == -1);
}


public boolean isFull() // true if stack is full
{
return (top == maxSize-1);
}
}
//REVERSE STRING
