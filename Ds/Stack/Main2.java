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
System.out.println("REVERSALS NEEDED: "+reversals(str));
}
}


public static int reversals(String str)
{
Stack<Character> s1=new Stack<>();				//STACK-1
Stack<Character> s2=new Stack<>();				//STACK-2

for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);

//OPENING BRACE:
if(c == '(' || c == '{' || c == '[') s1.push(c);

//CLOSING BRACE:
if(c == ')' || c == '}' || c == ']') s2.push(c);
}

int count=0;							//COUNT OF REVERSALS REQUIRED
if(s1.size() != s2.size())
{

}
return count;
}
}
