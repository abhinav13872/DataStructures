package SORTING;
import java.util.*;
public class T2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("No. of Testcases: ");
int t=sc.nextInt();//no. of testcases
while(t!=0)
{
System.out.print("Size of Array: ");
int n=sc.nextInt();//size of array
int a[]=new int[n];//creation of array

System.out.println("Scan Array: ");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();//scanning of array

//BUBBLE SORT:-
for(int i=0;i<n;i++)
for(int j=0;j<n-i-1;j++)
{
if(a[j]>a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}

//PRINTING OF ARRAY
for(int i=0;i<n;i++)
{
if(i!=n-1)
System.out.print(a[i]+" ");
else
System.out.print(a[i]+"\n");
}
t--;
}
}
}

