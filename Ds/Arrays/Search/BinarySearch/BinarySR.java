package BINARYSEARCH;
import java.util.Scanner;


public class BinarySR
{

private static int BinarySRearch(int arr[],int l,int r,int x)
{
if(l > r) return -1;

int mid=(l+r)/2;					//mid index
if(x == arr[mid]) return mid;				//Match found!!

if(x > arr[mid]) return BinarySRearch(arr,mid+1,r,x);
return BinarySRearch(arr,l,mid-1,x);
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("TESTCASES: ");
int T=sc.nextInt();

while(T-- > 0)
{
System.out.print("SIZE OF ARRAY AND ELEMENT TO BE SEARCHED: ");
int n=sc.nextInt();
int x=sc.nextInt();
int arr[]=new int[n];					//creation of array

System.out.print("ARRAY: ");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();					//scanning of array

System.out.println("INDEX OF ELEMENT: "+BinarySRearch(arr,0,arr.length-1,x));
}
}
}
//BINARY-SEARCH USING RECURSSION
