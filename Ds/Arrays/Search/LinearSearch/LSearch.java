package LINEARSEARCH;
import java.util.Scanner;


public class LSearch
{
private static int search(int arr[],int val)
{
int l=0;
int r=arr.length-1;

while(l <= r)
{
if(arr[l] == val) return l;
l++;
}
return -1;
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("TESTCASES: ");
int T=sc.nextInt();

while(T-->0)
{
System.out.print("SIZE OF ARRAY: ");
int n=sc.nextInt();					//size of array
int arr[]=new int[n];					//creation of array

System.out.print("ARRAY: ");
for(int i=0;i<n;i++) arr[i]=sc.nextInt();		//scanning of array

System.out.print("ELEMENT TO BE SEARCHED: ");
System.out.println("INDEX OF ELEMENT: "+search(arr,sc.nextInt()));
}
}
}
/*In LINEAR SEARCH comparision
will be done till last item
in an array
[O(n)]
**/
