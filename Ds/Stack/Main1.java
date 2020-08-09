package STACK;
import java.util.Scanner;
import java.util.Stack;


public class Main1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("TESTCASES: ");
int t=sc.nextInt();
while(t-- > 0)
{
System.out.print("NO. OF ELEMENTS TO BE PUSHED: ");
int n=sc.nextInt();						//SIZE
Stack<Integer> s=new Stack<>();				//STACK-1
Stack<Integer> s1=new Stack<>();				//STACK-2

System.out.print("SCAN ELEMENTS: ");
while(n-- != 0) s.push(sc.nextInt());

s1.push(-1);
while(!s.isEmpty())
{
int A=s.pop();
if(!s.isEmpty())
{
int B=s.peek();
if(A >= B) s1.push(A);
else s1.push(-1);
}
}

while(!s1.isEmpty()) System.out.print(s1.pop()+" ");
System.out.println();
}
}
}
//NEXT GREATER TO RIGHT SIDE

/*
1 4
1 2 3 4

1 5
1 2 3 4 5

1 5
5 1 2 3 4

1 5
5 4 3 2 1

1 6
1 2 5 6 3 4
*/
