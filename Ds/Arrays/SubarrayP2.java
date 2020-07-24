package ARRAYS;
import java.util.Scanner;

class SubarrayP2
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

long starttime=System.currentTimeMillis();

int MAX=maxSum(arr,n);
System.out.println("LARGEST SUM OF ALL SUBARRAYS: "+MAX);

int MIN=minSum(arr,n);
System.out.println("MINIMUM SUM OF ALL SUBARRAYS: "+MIN);

long endtime=System.currentTimeMillis();
System.out.println("TIME TAKEN:"+ (endtime-starttime));
}
}


private static int maxSum(int arr[],int n)				//MAXIMUM SUM OF ALL SUBARRAYS
{
int currMax=arr[0];
int Max=arr[0];

for(int i=1;i<n;i++)
{
currMax=java.lang.Math.max(arr[i],currMax + arr[i]);
Max=java.lang.Math.max(Max,currMax);
}
return Max;
}


private static int minSum(int arr[],int n)				//MINIMUM SUM OF ALL SUBARRAYS
{
int currMin=arr[0];
int Min=arr[0];

for(int i=1;i<n;i++)
{
currMin=java.lang.Math.min(arr[i],currMin + arr[i]);
Min=java.lang.Math.min(Min,currMin);
}
return Min;
}
}
//LARGEST SUM OF ALL SUBARRAY
