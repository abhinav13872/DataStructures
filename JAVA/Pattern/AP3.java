package PATTERN;
import java.util.*;
public class AP3
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<2*n+1;i++)
{
if(i==0||i==2*n)//first line and last line
{
System.out.print("+");
for(int j=0;j<2*n;j++)
System.out.print("-");
System.out.println("+");
}
else if(i>0&&i<2*n)
{
System.out.print("|");

//SPACING/\SPACING:-
if(i<n)
{
for(int j=n-i;j>0;j--)
System.out.print(" ");
System.out.print("/");

for(int j=0;j<2*i-2;j++)
{
if(i%2==0) System.out.print("-");
else System.out.print("=");
}
System.out.print("\\");
}
for(int j=n-i;j>0;j--)
System.out.print(" ");

//MIDDLE PART:-
if(i==n)
{
System.out.print("<");
for(int j=0;j<2*i-2;j++)
{
if(i%2==0) System.out.print("-");
else System.out.print("=");
}
System.out.print(">");
}

//SPACING\/SPACING:-
if(i>n)
{
for(int j=i-n;j>0;j--)
System.out.print(" ");
System.out.print("\\");

for(int j=0;j<2*(2*n-i)-2;j++)
{
if(i%2==0) System.out.print("-");
else System.out.print("=");
}
System.out.print("/");
}
for(int j=i-n;j>0;j--)
System.out.print(" ");

System.out.println("|");
}
}
}
}
//APPLICATION OF LOOPS!!(ARTISTIC PATTERN)
