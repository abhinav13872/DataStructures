package INSERTION;
import java.util.Scanner;

public class InsertionInArray
{
static int n;//SIZE OF AN ARRAY
static int arr[];

private static int[] insertAtBegin(int arr[],int x)
{
int ARR[]=new int[++n];

int i=0;
for(i=n-1;i>0;i--)
ARR[i]=arr[i-1];

ARR[i]=x;
return ARR;
}


private static int[] insert(int arr[],int index,int x)
{
int ARR[]=new int[++n];

for(int i=0;i<n-1;i++)
ARR[i]=arr[i];

int j=0;
for(j=n-1;j>index;j--)
ARR[j]=ARR[j-1];

ARR[j]=x;
return ARR;
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

System.out.print("SCAN AN ELEMENT TO BE INSERTED: ");
int x=sc.nextInt();
//arr=insertAtBegin(arr,sc.nextInt());

System.out.print("SCAN INDEX AN ELEMENT IS TO BE INSERTED AT: ");
int y=sc.nextInt();
arr=insert(arr,y,x);

Print();
}
}
