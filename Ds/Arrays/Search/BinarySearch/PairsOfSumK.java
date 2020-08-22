package BINARYSEARCH;
import java.util.Scanner;


public class PairsOfSumK
{
int getPairsCount(int arr[],int n,int sum)
{
int l=0;						//LEFT-POINTER
int r=n-1;						//RIGHT-POINTER
int count=0;

while(l < r)
{
System.out.println("l=>"+l+"|r=>"+r);

if((arr[l]+arr[r]) == sum)
{
System.out.println("PAIRS: l=>"+l+"|r=>"+r);
count++;
l++;
}
else if((arr[l]+arr[r]) < sum) l++;
else r--;

//
if(l == r)
{
l=0;
r--;
}
}
return count;
}

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("TESTCASES: ");
int T=sc.nextInt();

while(T-->0)
{
PairsOfSumK p=new PairsOfSumK();

System.out.print("SIZE OF ARRAY AND KEY(SUM): ");
int n=sc.nextInt();
int key=sc.nextInt();
int arr[]=new int[n];					//CREATION OF ARRAY

System.out.print("ARRAY: ");
for(int i=0;i<n;i++) arr[i]=sc.nextInt();		//SCANNING OF ARRAY

System.out.println("PAIRS COUNT WITH SUM \'"+key+"\': "+p.getPairsCount(arr,arr.length,key));
}

}
}

/*
[PREREQUISITE => SORTED ARRAY]
#TESTCASES:-

3
10 11
1 2 3 4 5 6 7 8 9 10
=>5

5 10
2 4 6 8 10
=>2

6 27
12 15 20 22 34 36
=>1

4 2
1 1 1 1
=>6

13 11
-1 1 1 1 2 4 5 6 7 10 11 12 15
=>6
*/
