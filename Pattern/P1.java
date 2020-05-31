import java.util.Scanner;
class P1
{
static int n;
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

//1.
System.out.println("Enter the value of n:-");
n=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<=i;j++)
System.out.print("*");

System.out.println();
}
System.out.println("\n");
//2.
System.out.println("Enter the value of n:-");
n=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=n-i-1;j>=0;j--)
System.out.print("*");

System.out.println();
}
System.out.println("\n");
//3.
System.out.println("Enter the value of n:-");
n=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<=i;j++)
System.out.print("*");
System.out.println();
}

for(int i=0;i<n-1;i++)
{
for(int j=n-i-2;j>=0;j--)
System.out.print("*");

System.out.println();
}
System.out.println("\n");
//4
System.out.println("Enter the value of n:-");
n=sc.nextInt();
for(int i=0;i<n;i++)
{

if(i<n-1)
{
for(int k=n-i-1;k>0;k--)
System.out.print(" ");
}

for(int j=0;j<=i;j++)
System.out.print("*");

System.out.println();
}
System.out.println("\n");
//5
System.out.println("Enter the value of n:-");
n=sc.nextInt();
for(int i=0;i<n;i++)
{

if(i<n-1)
{
for(int k=n-i-1;k>0;k--)
System.out.print(" ");
}

for(int j=0;j<=i;j++)
System.out.print("* ");

System.out.println();
}
System.out.println("\n");
//6
System.out.println("Enter the value of n:-");
n=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<=i;j++)
System.out.print(j+1+" ");
System.out.println();
}
System.out.println("\n");
//7
System.out.println("Enter the value of n:-");
n=sc.nextInt();
int k=1;
for(int i=0;i<n;i++)
{
for(int j=0;j<=i;j++)
{
System.out.print(k+" ");
k++;
}
System.out.println();
}
}
}
