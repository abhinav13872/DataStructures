import java.util.*;
class Student6
{
Student6(int N)
{
System.out.println("Prime no's till "+N+" are:- ");
for(int i=1;i<N;i++)
{
boolean isPrime=true;
for(int j=2;j<i;j++)
{

if(i%j==0)
{
isPrime=false;
}

}
if(isPrime)
{
System.out.println(i+" is Prime");
}
}

}

}
class Test6
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Student6 s=new Student6(n);
}
}
//Prime no. till n no.
