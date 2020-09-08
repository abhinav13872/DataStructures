package SORTING;
import java.util.Scanner;



public class RadixSort
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
arr=sort(arr);
//Print(arr);
}
}



private static int[] sort(int arr[])
{
//STEP-1: GET  MAX NO. IN AN ARRAY
int Max=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++) if(arr[i] > Max) Max=arr[i];


//STEP-2: GET LENGTH OF MAX [FOR HOW MANY TIMES THE LOOP WILL RUN]
int count=0;
while(Max != 0)
{
count++;
Max /= 10;
}


//STEP-3:- OVERRIDE THE ARRAY ACCORDINGLY...
int x=1;
while(count-- != 0)
{
int b[][]=new int[arr.length][10];


for(int i=0; i<arr.length; i++)
{
//Calculating position
int j= arr[i]/x % 10;

/*Inserting elements acc. to the position "j"
  (Ones,Tens,Hundreds,..) in a 2-D Array**/
b[i][j]=arr[i];
}

Print(b);


/*Updating Array
=>Empty the buckets one by one and update
  the Array "arr".
**/
int l=0;
for(int j=0; j<10; j++) for(int i=0; i<arr.length; i++) if(b[i][j] != 0) arr[l++]=b[i][j];
Print(arr);

x *= 10;
}

return arr;
}



private static void Print(int arr[])
{
System.out.print("ARRAY: ");
int n=arr.length;
for(int i=0; i<n; i++) System.out.print(arr[i] + ((i != n-1) ? " " : "\n\n"));
}



private static void Print(int b[][])
{
System.out.println("2D-ARRAY:- ");
for(int i=0; i<b.length; i++)
{
for(int j=0; j<10; j++) System.out.print(b[i][j]+"	");
System.out.println();
}
System.out.println("\n");
}

}
/*
#RADIX_SORT:-
=>Radix Sort algorithm is a kind of count Sort in which we
  count the no. of digits and sort..


#TESTCASE:-
 12 345 123 98 104 32 78 56 87 49 57 63


#TIME-COMPLEXITY:-
 ->Best Case   : O(n*k)
 ->Average Case: O(n*k)
 ->Worst Case  : O(n*k)
*/
