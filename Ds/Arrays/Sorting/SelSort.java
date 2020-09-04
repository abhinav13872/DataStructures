package SORTING;
import java.util.Scanner;



public class SelSort
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("TESTCASES: ");
int T=sc.nextInt();

while(T-- > 0)
{
System.out.print("SIZE OF AN ARRAY: ");
int n=sc.nextInt();
int arr[]=new int[n];

System.out.print("ARRAY: ");
for(int i=0;i<n;i++) arr[i]=sc.nextInt();

System.out.println("\n#SORTING:-");
arr=sort(arr,n);
Print(arr,n);
}
}



private static int[] sort(int arr[],int n)					//SORT-METHOD
{
for(int i=0;i<n-1;i++)
{
int min=i;									//MIN VALUE's INDEX
for(int j=i+1;j<n;j++) if(arr[j] < arr[min]) min=j;

if(min != i)
{
//SWAP (arr[min] and arr[i])
int temp=arr[i];
arr[i]=arr[min];
arr[min]=temp;
}

}
return arr;
}



private static void Print(int arr[],int n)					//PRINT-METHOD
{
System.out.print("ARRAY: ");
for(int i=0;i<n;i++) System.out.print(arr[i] + ((i != n-1) ? " " : "\n\n"));
}
}
/*
#SELECTION_SORT:-
 ->In Selection sort we divide the list into
   two halves:
   1]Sorted Sublist   (EMPTY INITIALLY)
   2]Unsorted Sublist (arr[0] to arr[n-1])

 ->Now find the MIN value in Unsorted Sublist
   and swap it with the Beginning element in
   Unsoted Sublist..
   
#TIME_COMPLEXITY
 ->Best Case   : O(n^2)
 ->Average Case: O(n^2)
 ->Worst Case  : O(n^2)
**/
