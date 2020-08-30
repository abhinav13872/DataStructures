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

sort(arr,0,arr.length-1);
Print(arr);
}
}




static  int partition(int arr[], int low, int high) 
{ 
int pivot = arr[high];  
int start=low;
int end=high;

while(start < end)
{

while(arr[start] <= pivot) start++;
while(arr[end] > pivot) end--;

if(start < end)
{
//swap
int temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
}
}
//swap
int temp=arr[low];
arr[low]=arr[end];
arr[end]=temp;
return end;
}



static void sort(int arr[], int low, int high)
{
if(low < high)
{
int pi = partition(arr, low, high);

System.out.println("=================>pi: "+pi);
sort(arr, low, pi-1);
sort(arr, pi+1, high);
}
}



private static void Print(int arr[])						//PRINT-METHOD
{
System.out.print("ARRAY: ");
int n=arr.length;
for(int i=0;i<n;i++) System.out.print(arr[i] + ((i != n-1) ? " " : "\n\n"));
}
}
