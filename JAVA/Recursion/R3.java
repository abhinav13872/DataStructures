package RECURSION;
import java.util.*;
public class R3
{
private static int Fib(int N)
{
/*if(N==0) return 0;
if(N==1) return 1;*/
if(N<=1) return N;//a combo of above 2 statements jse hi n=1 hua ya 1 se chota hua vo return krdega n!!
if(N>1) return Fib(N-1)+Fib(N-2);
return -1;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("No. of Testcases: ");
int T=sc.nextInt();
while(T-->0)
{
System.out.print("Enter the Number: ");
int n=sc.nextInt();
System.out.println(Fib(n));
}
}
}
