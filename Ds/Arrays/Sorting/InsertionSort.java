package SORTING;
import java.util.Scanner;



public class InsertionSort
{
static Scanner sc=new Scanner(System.in);

public static void main(String [] args)
{
System.out.print("TESTCASES: ");
int T=sc.nextInt();

while(T-- > 0)
{
System.out.print("SIZE OF AN ARRAY: ");
int n=sc.nextInt();
int arr[]=new int[n];

arr=insert(arr,n);
}
}



private static int[] insert(int arr[],int n)					//INSERTION_SORT-METHOD
{
int i=0;
System.out.print("NO. OF ELEMENTS IN AN ARRAY: ");
int N=sc.nextInt();

while(N-- > 0)
{
System.out.print("ENTER AN ELEMENT TO BE INSERTED: ");
int x=sc.nextInt();

for(i=arr.length-2;i>=0;i--)
{
if(arr[i] < x || arr[i] != 0) break;
arr[i+1]=arr[i];
}
arr[i+1]=x;
Print(arr,n);
}
return arr;
}



private static void Print(int arr[],int n)					//PRINT-METHOD
{
System.out.print("ARRAY: ");
for(int i=0;i<n;i++) System.out.print(arr[i] + ((i != n-1) ? " " : "\n\n"));
}
}
