package ARRAYS;
import java.util.Scanner;

class SubarrayP1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("ENTER THE NO. OF TESTCASES: ");
int t=sc.nextInt();
while(t-->0)
{
System.out.print("SCAN SIZE OF AN ARRAY: ");
int n=sc.nextInt();							//SIZE OF AN ARRAY
int arr[]=new int[n];

System.out.print("SCAN ARRAY: ");
for(int i=0;i<n;i++)							//SCAN ARRAY
arr[i]=sc.nextInt();

System.out.print("SCAN SUBARRAY'S SIZE: ");
int k=sc.nextInt();

long starttime=System.currentTimeMillis();

int max=maxSum(arr,n,k);
System.out.println("MAXIMUM SUM OF A SUBARRAY: "+max);

int min=minSum(arr,n,k);
System.out.println("MINIMUM SUM OF A SUBARRAY: "+min);
long endtime=System.currentTimeMillis();
System.out.println("TIME TAKEN:"+ (endtime-starttime));
}
}


private static int maxSum(int arr[],int n,int k)			//MAXIMUM SUM OF Kth SUBARRAY
{
int sum=0;
for(int i=0;i<k;i++)
sum+=arr[i];

int MAX=sum;
for(int i=0;i<n-k;i++)
{
sum+=arr[i+k] - arr[i];

if(sum > MAX) MAX=sum;
}
return MAX;
}


private static int minSum(int arr[],int n,int k)			//MINIMUM SUM OF Kth SUBARRAY
{
int sum=0;
for(int i=0;i<k;i++)
sum+=arr[i];

int MIN=sum;
for(int i=0;i<n-k;i++)
{
sum+=arr[i+k] - arr[i];

if(sum < MIN) MIN=sum;
}
return MIN;
}
}
//MAX/MIN SUM OF SIZE K SUBARRAY
