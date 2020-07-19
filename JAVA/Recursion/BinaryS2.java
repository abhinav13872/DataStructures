package RECURSION;
import java.util.*;
public class BinaryS2
{

private static int BinarySearch(int arr[],int l,int r,int x)
{
while(l<=r)
{
int mid=(l+r)/2;					//mid index

if(x>arr[mid]) return BinarySearch(arr,mid+1,r,x);

if(x==arr[mid]) return mid;				//Match found!!

if(x<arr[mid]) return BinarySearch(arr,l,mid-1,x);
}
return -1;						//Element doesn't exists!!
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Size of Array: ");
int n=sc.nextInt();
int a[]=new int[n];					//creation of array

System.out.println("Scan Array: ");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();					//scanning of array

java.util.Arrays.sort(a);				//sorts array

System.out.println("No. of Testcases: ");
int T=sc.nextInt();

while(T-->0)
{
System.out.println("Element to be searched: ");
int x=sc.nextInt();
int l=0;						//start index
int r=a.length;					//end index
System.out.println(BinarySearch(a,l,r,x));
}
}
}
