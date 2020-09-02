package SORTING;
import java.util.Scanner;



public class BubbleSort
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
int flag=0;

for(int j=0;j<n-1-i;j++)
if(arr[j] > arr[j+1])
{
//SWAP:-
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;

//Update flag
flag=1;
}

if(flag != 1) break;
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
#BUBBLE_SORT:-

=>In this technique we compare adjacent two elements and compare..
  ->If elements are in correct order then don't Swap and move ahead.
  ->If elements aren't in correct order then Swap them.

=>OBSERVATION
  After Pass-1 we get one largest element is bubbledup
  After Pass-2 second largest element is bubbledup
  After Pass-3 third largest element is bubbledup
  [bubbledup means they're at their correct position now]
  so if the no. of elements are 4 then no. of passes required
  will be "3" to sort the array...
  
=>OPTIMISATION
  Here we observed that sometimes the array gets sorted before the
  required no. of passes then to avoid unneccessary computations
  we've used a "flag" to break the loop of PASSES.
  ->when no swaping is done in any pass then break the loop since the 
    array is sorted.
    
=>COMPLEXITY
  BEST CASE   : O(n)
  AVERAGE CASE: O(n^2)
  WORST CASE  : O(n^2)
**/
