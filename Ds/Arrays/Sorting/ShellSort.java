package SORTING;
import java.util.Scanner;



public class ShellSort
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
}
}



private static int[] sort(int arr[],int n)					//SORT-METHOD
{
/*
STEP-1: Create a Gap sequence.
STEP-2: Do Insertion Sort for
	each gap size.**/


for(int gap=n/2; gap > 0; gap /= 2)
{
System.out.println("------------------------------------------------");

for(int i=gap; i< n; i++)
{
int key=arr[i];
int j=i;

/*Shift earlier gap-sorted elements up
  until the correct location for the key
  is found.**/
while(j >= gap && arr[j - gap] > key)
{
arr[j]=arr[j - gap];
j -= gap;
}

// Placing key at its suitable position..
arr[j]=key;
Print(arr);
}
}

return arr;
}



private static void Print(int arr[])						//PRINT-METHOD
{
System.out.print("ARRAY: ");
int n=arr.length;
for(int i=0;i<n;i++) System.out.print(arr[i] + ((i != n-1) ? " " : "\n\n"));
}
}
/*
#SHELL_SORT:-
=>Shell sort is based on the Insertion sorting algorithm, and it belongs to the group
  of very efficient algorithms. In general, the algorithm breaks an original set into
  smaller subsets and then each of those is sorted using Insertion sort.

  But, how it makes the subsets is not straightforward. It doesn’t choose neighboring
  elements to form a subset as we might expect. Rather, shell sort uses the so-called
  interval or gap for subset creation. For example, if we have the gap I, it means that
  one subset will contain the elements that are I positions apart.

  Firstly, the algorithm sorts the elements that are far away from each other.Then, the
  gap becomes smaller and closer elements are compared.This way, some elements that aren’t
  in a correct position can be positioned faster than if we made the subsets out of the
  neighboring elements.


#TIME_COMPLEXITY:-
 ->BEST CASE   : O(n*logn)
 ->AVERAGE CASE: O(n*logn)
 ->WORST CASE  : O(n^2)    [Depends on the gap sequence]
**/
