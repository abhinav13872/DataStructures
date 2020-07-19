package ARRAYS;
import java.util.Scanner;

class MthMax
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
System.out.print("ENTER THE VALUE OF K: ");
int k=sc.nextInt();						//K FOR Kth MAX
int arr[]=new int[n];

System.out.print("SCAN ARRAY: ");
for(int i=0;i<n;i++)						//SCAN ARRAY
arr[i]=sc.nextInt();

long starttime=System.currentTimeMillis();
int element=kthMax(arr,k);
System.out.println(element);
long endtime=System.currentTimeMillis();
System.out.println("TIME TAKEN:"+ (endtime-starttime));
}
}


private static int kthMax(int arr[],int k)
{
int n=arr.length;						//SIZE OF AN ARRAY
int min=Integer.MAX_VALUE;					//MINIMUM VALUE
int max=Integer.MIN_VALUE;					//MAXIMUM VALUE
for(int i=0;i<n;i++) 
{
if(arr[i] > max) max=arr[i];
if(arr[i] < min) min=arr[i];
}       
System.out.println("min: "+min);
System.out.println("max: "+max);

int freqMin[]=new int[Math.abs(min)+1];
int freqMax[]=new int[Math.abs(max)+1];

for(int i=0;i<n;i++)
{
if(arr[i] < 0) freqMin[Math.abs(arr[i])]++;
if(arr[i] > 0) freqMax[arr[i]]++;
}

if(min < 0 && max > 0)						//min < 0 && max > 0
{
int count=0;
for(int i=max;i>=0;i--)
{
if(freqMax[i] != 0) ++count;
if(count == k) return i;
}

int counter=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i] == 0)
{
counter++;
}
}
if(counter > 0) ++count;
if(count == k) return 0;					//IF KTH MAX-ELEMENT IS 0

for(int i=0;i<Math.abs(min)+1;i++)
{
if(freqMin[i] != 0) ++count;
if(count == k) return -i;
}

}

if(max < 0)							//i.e min < 0
{
int count=0;
for(int i=0;i<Math.abs(min)+1;i++)
{
if(freqMin[i] != 0) ++count;
if(count == k) return -i;
}
}

if(min > 0)							//i.e max > 0
{
int count=0;
for(int i=max;i>=0;i--)
{
if(freqMax[i] != 0) ++count;
if(count == k) return i;
}
}

if(max == 0)							//max == 0
{
int count=0;
count++;

if(min < 0)
{
for(int i=0;i<Math.abs(min)+1;i++)
{
if(freqMin[i] != 0) ++count;
if(count == k) return -i;
}
}
return 0;
}

if(min == 0)							//min == 0
{
int count=0;
for(int i=max;i>=0;i--)
{
if(freqMax[i] != 0) ++count;
if(count == k) return i;
}
}   
return Integer.MIN_VALUE;					//ALL ARE SAME ELEMENTS OR Kth MAX NOT POSSIBLE
}
}
//Kth MAX IN AN ARRAY
