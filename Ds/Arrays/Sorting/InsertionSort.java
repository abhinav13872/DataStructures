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

System.out.print("ARRAY: ");
for(int i=0;i<n;i++) arr[i]=sc.nextInt();

arr=sort(arr,n);
}
}



private static int[] sort(int arr[],int n)					//INSERTION_SORT-METHOD
{
for(int i=0;i<n;i++)
{
int key=arr[i];
int j=i-1;

while(j >= 0 && arr[j] > key)
{
arr[j+1]=arr[j];
j=j-1;
}
arr[j+1]=key;
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
