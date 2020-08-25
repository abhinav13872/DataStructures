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



private static int[] sort(int arr[],int n)
{
for(int i=0;i<n-1;i++)
{
int m=i;						//lowest value's index
for(int j=i+1;j<n;j++) if(arr[j] < arr[m]) m=j;

//SWAP
int temp=arr[m];
arr[m]=arr[i];
arr[i]=temp;
}
return arr;
}



private static void Print(int arr[],int n)					//PRINT-METHOD
{
System.out.print("ARRAY: ");
for(int i=0;i<n;i++) System.out.print(arr[i] + ((i != n-1) ? " " : "\n\n"));
}
}

