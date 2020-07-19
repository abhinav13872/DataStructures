import java.util.*;
class AP2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();//size
int x=n*2+1;//rows
int y=n*2+2;//columns
for(int i=0;i<x;i++)
{

//for BORDERS
for(int j=0;j<y;j++)
{
if(i==0&&j==0||i==0&&j==y-1)
System.out.print("+");
else if(i==0&&j>0&&j<y-1)
System.out.print("-");
else if(j==0&&i>0&&i<x-1)
System.out.print("|");
}


if(i>0&&i<(x-1)/2)//UPPER part
{
//for LEFT UPPER pattern
for(int k=(x-1)/2-i-1;k>=0;k--)
System.out.print(" ");
System.out.print("/");
//for UPPER INNER patterns
for(int j=i-1;j>0;j--)
{
if(i%2==0)
System.out.print("-");
else
System.out.print("=");
}
for(int j=1;j<i;j++)
{
if(i%2==0)
System.out.print("-");
else
System.out.print("=");
}
System.out.print("\\");
//for RIGHT UPPER pattern
for(int j=(x-1)/2-i;j>0;j--)
System.out.print(" ");
}


else if(i==(x-1)/2)//MIDDLE part
{
System.out.print("<");
for(int k=2;k<y-2;k++)
{
if(i%2==0)
System.out.print("-");
else
System.out.print("=");
}
System.out.print(">");
}


else if(i>(x-1)/2&&i<x-1)//LOWER part
{
//for LEFT LOWER pattern
for(int k=(x-1)/2+1;k<=i;k++)
System.out.print(" ");
System.out.print("\\");
//for LOWER inner patterns
for(int j=x-3-i;j>=0;j--)
{
if(i%2==0)
System.out.print("-");
else
System.out.print("=");
}
for(int j=x-3-i;j>=0;j--)
{
if(i%2==0)
System.out.print("-");
else
System.out.print("=");
}
System.out.print("/");
//for RIGHT LOWER pattern
for(int j=(x-1)/2+1;j<=i;j++)
System.out.print(" ");
}


//for BORDERS
for(int j=0;j<y;j++)
{
if(i==x-1&&j==0||i==x-1&&j==y-1)
System.out.print("+");
else if(i==x-1&&j>0&&j<y-1  )
System.out.print("-");
else if(j==y-1&&i>0&&i<x-1)
System.out.print("|");
}
System.out.println();
}
}
}
