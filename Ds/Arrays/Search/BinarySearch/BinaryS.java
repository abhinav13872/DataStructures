package BINARYSEARCH;
import java.util.Scanner;


public class BinaryS
{
private static int BinarySearch(int arr[],int x)
{
int l=0;						//LEFT POINTER
int r=arr.length-1;					//RIGHT POINTER

while(l <= r)
{
int mid=(l+r)/2;					//mid index

if(x > arr[mid]) l=mid+1;

else if(x == arr[mid]) return mid;			//Match found!!

else r=mid-1;
}
return -1;						//tells ki element exist hi ni kia
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
System.out.println("INDEX OF ELEMENT: "+BinarySearch(a,x));
}

}
}
/*
BINARY-SEARCH
In Binary Search we break
our search space in two
halves accordingly..
*/
