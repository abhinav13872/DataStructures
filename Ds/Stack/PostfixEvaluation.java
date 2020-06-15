package STACK;
import java.util.Scanner;
import java.util.Stack;
public class PostfixEvaluation
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int T=Integer.parseInt(sc.nextLine());
while(T-->0)
{
String str=sc.nextLine();

System.out.println(PostfixEvaluate(str));
}
}


public static int PostfixEvaluate(String str)
{
Stack<Integer> st=new Stack<>();

for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);

if(Character.isDigit(c)) st.push(c-'0');
else
{
int val2=st.pop();//OPERAND-1
System.out.println("val2:"+val2);
int val1=st.pop();//OPERAND-2
System.out.println("val1:"+val1);
int result=solve(c,val1,val2);l
st.push(result);
}
}
return st.pop();
}


public static int solve(char c,int val1,int val2)
{
if(c=='*') return val1*val2;
if(c=='+') return val1+val2;
if(c=='-') return val1-val2;
if(c=='/') return val1/val2;
return 0;
}
}
