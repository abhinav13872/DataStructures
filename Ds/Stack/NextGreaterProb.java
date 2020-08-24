package STACK;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;



public class NextGreaterProb
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("TESTCASES: ");
int t=sc.nextInt();

while(t-- > 0)
{
System.out.print("NO. OF ELEMENTS TO BE PUSHED: ");
int n=sc.nextInt();									//SIZE

Stack<Integer> s1=new Stack<>();							//STACK-1
Stack<Integer> s2=new Stack<>();							//STACK-2

System.out.print("SCAN ELEMENTS: ");
while(n-- != 0) s1.push(sc.nextInt());

s2=nextGreater(s1,s2);

while(!s2.isEmpty()) System.out.print(s2.pop()+" ");
System.out.println("\n");
}
}



static Stack<Integer> nextGreater(Stack<Integer> s1,Stack<Integer> s2)		//NEXT_GREATER
{
/*
STEP-1: SINCE LAST ELEMENT
	CAN'T BE COMPARED
	PLACE "-1" FOR IT**/
s2.push(-1);

/*
STEP-2: KEEP THE ELEMENTS
	POPPED IN ARRAY TO
	GET RIGHT GREATER
	ELEMENT..
**/
ArrayList<Integer> arrList=new ArrayList<>();

while(!s1.isEmpty())
{
int A=s1.pop();
arrList.add(A);

if(!s1.isEmpty())
{
int B=s1.peek();

if(A > B) s2.push(A);
else
{
boolean visited=false;
Object arr[]=arrList.toArray();
System.out.println("SIZE OF ARRAY: "+arr.length);

for(int i=arr.length-1;i>=0;i--)
{
System.out.println("arr["+i+"]: "+arr[i]+"|B: "+B);

if((int)arr[i] > B)
{
s2.push((int)arr[i]);
visited=true;
break;
}
}

//CASE: NO GREATER ELEMENT FOUND AT RIGHT SIDE
if(!visited) s2.push(-1);
}
}
}
return s2;
}
}
/*
#NEXT GREATER ELEMENT IN RIGHT

#TESTCASES:-
   4
   1 3 2 4
=> 3 4 4 -1

   4
   7 8 1 4
=> 8-1 4-1

   4
   1 2 3 4
=> 2 3 4 -1

   5
   1 2 3 4 5
=> 2 3 4 5 -1  

   5
   5 1 2 3 4
=>-1 2 3 4 -1

   5
   5 4 3 2 1
=>-1 -1 -1 -1 -1

   6
   1 2 5 6 3 4
=> 2 5 6 -1 4 -1
*/
