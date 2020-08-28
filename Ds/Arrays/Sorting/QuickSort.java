package SORTING;
import java.util.Scanner;



public class QuickSort
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

System.out.print("ARRAY: ");
for(int i=0;i<n;i++) arr[i]=sc.nextInt();

arr=sort(arr,n);
}
}



private static int[] sort(int arr[],int n)					//QUICK_SORT-METHOD
{
return arr;
}



private static void Print(int arr[],int n)					//PRINT-METHOD
{
System.out.print("ARRAY: ");
for(int i=0;i<n;i++) System.out.print(arr[i] + ((i != n-1) ? " " : "\n\n"));
}
}
