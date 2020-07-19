package DELETION;
import java.util.Scanner;

public class DeletionInArray
{
static int n;//SIZE
static int arr[];

private static int[] deleteAt(int arr[],int index)
{
for(int i=index;i<n-1;i++)
arr[i]=arr[i+1];
n--;

return arr;
}

private static void Print()
{
for(int i=0;i<n;i++)
System.out.print(arr[i]+" ");
System.out.println();
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("ENTER THE SIZE OF AN ARRAY: ");
n=sc.nextInt();
arr=new int[n];

System.out.print("SCAN ARRAY: ");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

System.out.print("SCAN AN INDEX AT WHICH ELEMENT IS TO BE DELETED: ");
int x=sc.nextInt();
arr=deleteAt(arr,x);

Print();
}
}
