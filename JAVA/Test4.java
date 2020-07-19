import java.util.* ;
class Student4
{
int N;//instance variable
Student4()//default constructor
{}

void A(int m,int n)//instance method
{
int x=0;
for(int i=m;i<=n;i++)
{
N=i;
x=i;
int c=0;
while(x!=0)
{
x/=10;
c++;
}
x=i;
int R=0,r=0;
while(x!=0)
{
r=x%10;
R+=Math.pow(r,c);
x=x/10;
/*
use this to debug this code:-
System.out.println("R=>"+R);
System.out.println("r=>"+r);
System.out.println("x=>"+x);
System.out.println("i"+i);
*/
}

if(R==N)
{
System.out.println(N+" is an Armstrong number");
}
}

}
}
class Test4
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
Student4 s=new Student4();
s.A(m,n);
}
}
//Armstrong no.
