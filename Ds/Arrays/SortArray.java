package ARRAYS;
import java.util.Scanner;

class SortArray
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("ENTER THE NO. OF TESTCASES: ");
int t=sc.nextInt();
while(t-->0)
{
System.out.print("SCAN SIZE OF AN ARRAY: ");
int n=sc.nextInt();						//SIZE OF AN ARRAY
int arr[]=new int[n];

System.out.print("SCAN ARRAY: ");
for(int i=0;i<n;i++)						//SCAN ARRAY
arr[i]=sc.nextInt();

long starttime=System.currentTimeMillis();

arr=sortArray(arr,n);
Print(arr);

long endtime=System.currentTimeMillis();
System.out.println("TIME TAKEN:"+ (endtime-starttime));
}
}


private static void Print(int arr[])
{
System.out.print("ARRAY: ");
for(int i=0;i<arr.length;i++)
System.out.print(arr[i]+" ");
System.out.println();
}


private static int[] sortArray(int arr[],int n)
{
int min=Integer.MAX_VALUE;					//MINIMUM VALUE
int max=Integer.MIN_VALUE;					//MAXIMUM VALUE
for(int i=0;i<n;i++) 
{
if(arr[i] > max) max=arr[i];
if(arr[i] < min) min=arr[i];
}

int freqMin[]=new int[Math.abs(min)+1];
int freqMax[]=new int[Math.abs(max)+1];

for(int i=0;i<n;i++)
{
if(arr[i] < 0) freqMin[Math.abs(arr[i])]++;
if(arr[i] > 0) freqMax[arr[i]]++;
}

int l=0;						        //LEFT-POINTER
int r=arr.length;					    	//RIGHT-POINTER

for(int i=Math.abs(min);i>=0;i--)     			//FOR -VE VALUES
{
int count=0;
if(freqMin[i] != 0) count=freqMin[i]; 
while(count-- != 0) arr[l++]= -i;
}

int counter=0;
for(int i=0;i<arr.length;i++)
if(arr[i] == 0) ++counter;
while(counter-- != 0) arr[l++]=0;


for(int i=0;i< max+1;i++)					//FOR +VE VALUES
{
int count=0;
if(freqMax[i] != 0) count=freqMax[i]; 
while(count-- != 0) arr[l++]=i;
}

return arr;
}
}
//SORTING USING FREQUENCY ARRAYS
