package STACK;
import java.util.Scanner;
import java.util.Stack;
public class ParenthesisChecker
{

public static boolean ParenthesisCheck(String str)
{
if(str.length()%2!=0) return false;

Stack<Character> s=new Stack<>();

for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);
if(c=='(' || c=='{' || c=='[') s.push(c);

else if(c==')' || c=='}' || c==']')
{

if(s.isEmpty()) return false;

char ch=s.pop();

if(!matchingPair(c,ch)) return false;
}
}
if(s.isEmpty()) return true;
return false;
}


public static boolean matchingPair(char c,char ch)
{
if(c==')' && ch=='(') return true;
if(c=='}' && ch=='{') return true;
if(c==']' && ch=='[') return true;
return false;
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

int T=Integer.parseInt(sc.nextLine());
while(T-->0)
{
String str=sc.nextLine();

System.out.println("Parenthesis are correct: "+ParenthesisCheck(str));
}
}
}
