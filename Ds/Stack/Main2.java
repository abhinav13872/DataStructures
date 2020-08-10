package STACK;
import java.util.Scanner;
import java.util.Stack;


public class Main2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("TESTCASES: ");
int t=Integer.parseInt(sc.nextLine());

while(t-- > 0)
{
System.out.print("EXPRESSION: ");
String str=sc.nextLine();
System.out.println("REVERSALS REQUIRED: "+reversals(str));
}
}


public static int reversals(String str)
{
Stack<Character> s=new Stack<>();				//STACK

//CASE OF ODD LENGTH EXPRESSION:-
if(str.length()%2 != 0) return -1;

//CASE OF EVEN LENGTH EXPRESSION:-
for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);

if(c == '[') s.push(c);
if(!s.isEmpty() && c == ']' && s.peek() == '[') s.pop();
if(c == ']') s.push(c);
}

float O=0,C=0;
while(!s.isEmpty())
{
char item=s.pop();
if(item == '[') O++;
if(item == ']') C++;
}
System.out.println("O: "+O);
System.out.println("C: "+C);


System.out.println((int)Math.ceil(O/2));
System.out.println((int)Math.ceil(C/2));


return ((int)Math.ceil(O/2) + (int)Math.ceil(C/2));
}
}
//MIN REVERSALS REQUIRED TO BALANCE THE GIVEN EXPRESSION
