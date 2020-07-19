package ARRAYS;
import java.util.Scanner;

class SortArrayOnFrequency
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

sortArray(arr,n);
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


private static void sortArray(int arr[],int n)
{
int maxA=Integer.MIN_VALUE;					        //MAXIMUM VALUE IN ARRAY
for(int i=0;i<n;i++)
if(arr[i] > maxA) maxA=arr[i];    

int freqMax[]=new int[Math.abs(maxA)+1];

for(int i=0;i<n;i++)
if(arr[i] > 0) freqMax[arr[i]]++;

//MAXIMUM FREQUENCY FOR "+VE" CASE:
int maxfreqMax=Integer.MIN_VALUE;                   			//MAXIMUM FREQUENCY
for(int i=0;i<maxA+1;i++)
if(freqMax[i] > maxfreqMax) maxfreqMax=freqMax[i];

int freqMaxF[]=new int[Math.abs(maxfreqMax)+1];			//FREQUENCY ARRAY OF FREQUENCIES

for(int i=0;i<maxA+1;i++)				            	//SINCE FREQUENCIES ARE +VE
freqMaxF[freqMax[i]]++;

int l=0;							        //LEFT-POINTER OF AN ARRAY
int r=arr.length;						        //RIGHT-POINTER OF AN ARRAY
int counter=0;								//COUNTER OF 0's FREQUENCY
boolean visited=false;							//MARK FOR

for(int i=0;i<arr.length;i++)
if(arr[i] == 0) ++counter;

for(int i=maxfreqMax;i>0;i--)					    	//FOR "+VE" VALUES
if(freqMaxF[i] != 0)
for(int j=1;j<maxA+1;j++)
{
if(counter >= i && visited != true)
{
visited=true;
while(counter-- != 0) arr[l++]=0;
}

int count=0;
if(freqMax[j] != 0 && freqMax[j] == i) count=freqMax[j]; 
while(count-- != 0) arr[l++]=j;
}
}
}
//SORTING ARRAY ON THE BASIS OF FREQUENCIES
