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
}
}



static  int partition(int arr[], int low, int high) 
{
// Taking starting element as pivot
int pivot = arr[low];
int start=low;
int end=high;

while(start < end)
{
while(start <= high && arr[start] <= pivot) start++;
while(end >= 0 && arr[end] > pivot) end--;

if(start < end)
{
int temp=arr[start];
arr[start]=arr[end];
arr[end]=temp;
}
}

// SWAP (pivot->"arr[low]" AND "arr[end]")
int temp=arr[low];
arr[low]=arr[end];
arr[end]=temp;

Print(arr);
return end;
}




static void sort(int arr[], int low, int high)
{ 
if (low < high)
{ 
int loc = partition(arr, low, high);
System.out.println("=========>loc: "+loc);

sort(arr, low, loc-1);
sort(arr, loc+1, high);
}
}



private static void Print(int arr[])						//PRINT-METHOD
{
System.out.print("ARRAY: ");
int n=arr.length;
for(int i=0;i<n;i++) System.out.print(arr[i] + ((i != n-1) ? " " : "\n\n"));
}
}
/*
#QUICK_SORT (PARTITION-SORT):-
=>In this algorithm we use DIVIDE AND CONQUER Technique.

=>Keep on Dividing an input Array into 2 Partitions such that
  all the elements in the Left_Partition are Less than pivot
  and greater ones in the Right_Partition.


#TIME-COMPLEXITY:-
 ->Best Case   : O(n*logn)
 ->Average Case: O(n*logn)
 ->Worst Case  : O(n^2)
*/
