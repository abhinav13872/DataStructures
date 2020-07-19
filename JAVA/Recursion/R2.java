package RECURSION;
import java.util.Scanner;
public class R2
{
private static void RecursionF(int N)
{
if(N>=1)
{
RecursionF(N-1);
System.out.print(N+" ");
}
else return;
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
//System.out.println(RecursionF(n));
RecursionF(n);
}
}
}
