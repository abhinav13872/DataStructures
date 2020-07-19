import java.util.*;
class Student5
{
Student5(int N)//N is an instance variable of class Student5
{

boolean isPrime=true;//boolean variable stores only true/false
for(int i=2;i<N;i++)
{
if(N%i==0)
{
isPrime=false;
break;
}
} 
if(isPrime)
{
System.out.println(N+" is Prime No.");
}
else
{
System.out.println(N+" is non Prime No.");
}

}

}
class Test5
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Student5 s=new Student5(n);
}
}
//Prime No.
