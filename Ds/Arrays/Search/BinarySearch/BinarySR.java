package BINARYSEARCH;
import java.util.Scanner;


public class BinarySR
{

private static int BinarySRearch(int arr[],int l,int r,int x)
{
while(l<=r)
{
int mid=(l+r)/2;					//mid index

if(x>arr[mid]) return BinarySRearch(arr,mid+1,r,x);

if(x==arr[mid]) return mid;				//Match found!!

if(x<arr[mid]) return BinarySRearch(arr,l,mid-1,x);
}
return -1;						//Element doesn't exists!!
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("TESTCASES: ");
int T=sc.nextInt();

while(T-->0)
{
System.out.print("SIZE OF ARRAY: ");
int n=sc.nextInt();
int a[]=new int[n];					//creation of array

System.out.print("ARRAY: ");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();					//scanning of array

System.out.print("ELEMENT TO BE SEARCHED: ");
int x=sc.nextInt();
System.out.println("INDEX OF ELEMENT: "+BinarySRearch(a,0,a.length-1,x));
}
}
}
//BINARY-SEARCH USING RECURSSION
