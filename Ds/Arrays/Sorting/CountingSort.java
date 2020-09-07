package SORTING;
import java.util.Scanner;



public class CountingSort
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

Print(arr);
}
}



private static int[] sort(int arr[],int n)					//SORT-METHOD
{
//STEP-1: Fill the Frequency array
int max=Integer.MIN_VALUE;
for(int i=0; i<n; i++) if(arr[i] > max) max=arr[i];

int freq[]=new int[max+1];
for(int i=0; i<n; i++) freq[arr[i]]++;


/*STEP-2: Update Frequency array acc.
	  to the Positions**/
for(int i=1; i<=max; i++) freq[i]= freq[i] + freq[i-1];


/*STEP-3: Store in a new array in a
	  sorted form**/ 
int brr[]=new int[n];
for(int i=n-1; i>=0; i--) brr[--freq[arr[i]]]=arr[i];

return brr;
}



private static void Print(int arr[])						//PRINT-METHOD
{
System.out.print("ARRAY: ");
int n=arr.length;
for(int i=0;i<n;i++) System.out.print(arr[i] + ((i != n-1) ? " " : "\n\n"));
}
}
/*
#COUNTING_SORT:-
=>In this algorithm we don't compare any data.
  Here we count the k different elements.


#DRAWBACK:-
=>Not workable for -ve data.

=>k(max) value should be feasible mtlb k has to
  be O(n) or O(2n) or O(5n) but it mustn't be O(n^2).


#TIME_COMPLEXITY:-
 ->BEST CASE   : O(n + k)
 ->AVERAGE CASE: O(n + k)
 ->WORST CASE  : O(n + k)
**/
