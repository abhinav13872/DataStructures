package ARRAYS;
import java.util.Scanner;

public class OperationsOnArray
{
static int n;									//SIZE OF AN ARRAY
static int arr[];								//ARRAY's REFERANCE


private static int[] insertAtBegin(int arr[],int x)				//INSERTION AT BEGINNING
{
int ARR[]=new int[++n];

int i=0;
for(i=n-1;i>0;i--)
ARR[i]=arr[i-1];

ARR[i]=x;
return ARR;
}


private static int[] insertAt(int arr[],int index,int x)			//INSERTION AT GIVEN INDEX
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



private static int[] insertBefore(int arr[],int value,int x)			//INSERTION BEFORE A GIVEN VALUE
{
int ARR[]=new int[++n];

for(int i=0;i<n-1;i++)
ARR[i]=arr[i];

int j=0;
for(j=0;j<n;j++)
if(ARR[j] == value) break;

int k=0;
for(k=n-1;k>j;k--)
ARR[k]=ARR[k-1];

ARR[k]=x;
return ARR;
}



private static int[] insertAfter(int arr[],int value,int x)			//INSERTION AFTER A GIVEN VALUE
{
int ARR[]=new int[++n];

for(int i=0;i<n-1;i++)
ARR[i]=arr[i];

int j=0;
for(j=0;j<n;j++)
if(ARR[j] == value) break;

int k=0;
for(k=n-1;k>j+1;k--)
ARR[k]=ARR[k-1];

ARR[k]=x;
return ARR;
}



private static int[] deleteAt(int arr[],int index)				//DELETION AT GIVEN INDEX
{
for(int i=index;i<n-1;i++)
arr[i]=arr[i+1];
n--;

return arr;
}



private static int[] deleteValue(int arr[],int value)			//DELETION OF GIVEN ELEMENT
{
int i=0;
for(i=0;i<n;i++)
if(arr[i] == value) break;

for(int j=i;j<n-1;j++)
arr[j]=arr[j+1];
n--;

return arr;
}

private static void Print()
{
System.out.print("ARRAY: ");
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

System.out.print("SCAN AN ELEMENT TO BE INSERTED AT BEGINNING: ");
arr=insertAtBegin(arr,sc.nextInt());
Print();

System.out.print("SCAN INDEX AND ELEMENT TO BE INSERTED AT IT: ");
arr=insertAt(arr,sc.nextInt(),sc.nextInt());
Print();

System.out.print("SCAN VALUE AND AN ELEMENT TO BE INSERTED BEFORE IT: ");
arr=insertBefore(arr,sc.nextInt(),sc.nextInt());
Print();


System.out.print("SCAN VALUE AND AN ELEMENT IS TO BE INSERTED AFTER IT: ");
arr=insertAfter(arr,sc.nextInt(),sc.nextInt());
Print();


System.out.print("SCAN VALUE TO BE DELETED: ");
arr=deleteValue(arr,sc.nextInt());
Print();

System.out.print("SCAN AN INDEX AT WHICH ELEMENT IS TO BE DELETED: ");
arr=deleteAt(arr,sc.nextInt());
Print();
}
}
//OPERATIONS IN ARRAY
