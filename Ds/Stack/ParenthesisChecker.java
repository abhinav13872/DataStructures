package STACK;
import java.util.Scanner;
import java.util.Stack;


public class ParenthesisChecker
{

public static boolean ParenthesisCheck(String str)			//PARENTHESIS CHECK
{

Stack<Character> s=new Stack<>();					//STACK

for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);							//CURRENT POSN's CHARACTER

if(c=='(' || c=='{' || c=='[') s.push(c);				//CASE OF OPENING BRACE's CHARACTER

else if(c==')' || c=='}' || c==']')					//CASE OF CLOSING BRACE's CHARACTER
{
if(!s.isEmpty()) 
{
char item=s.pop();							//ELEMENT AT TOP OF STACK

if(!matchingPair(c,item)) return false;
}
else return false;							//CASE OF UNBALANCED CLOSING BRACES
}
}

if(!s.isEmpty()) return false;					//CASE OF UNBALANCED OPENING BRACES
return true;
}


public static boolean matchingPair(char c,char ch)			//MATCHES PAIR
{
if(c==')' && ch=='(') return true;
if(c=='}' && ch=='{') return true;
if(c==']' && ch=='[') return true;
return false;
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("NO. OF TESTCASE: ");
int T=Integer.parseInt(sc.nextLine());

while(T-->0)
{
System.out.print("SCAN EXPRESSION: ");
String str=sc.nextLine();

System.out.println("PARENTHESIS ARE BALANCED: "+ParenthesisCheck(str));
}
}
}
