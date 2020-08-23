package BINARYSEARCH;
import java.util.Scanner;



public class RotationCount
{
public static int getCount(int arr[],int size)			//ROTATION_COUNT_METHOD
{
int l=0;								//LEFT_POINTER
int r=size-1;								//RIGHT_POINTER
int count=0;
  
while(l <= r)
{
if(arr[l] > arr[r]) count++;
l++;
}

if(count != 0) return count;
return -1;
}



public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("TESTCASES: ");
int T=sc.nextInt();

while(T-->0)
{
RotationCount p=new RotationCount();

System.out.print("SIZE OF AN ARRAY: ");
int n=sc.nextInt();
int arr[]=new int[n];							//CREATION_OF_ARRAY

System.out.print("ARRAY: ");
for(int i=0;i<n;i++) arr[i]=sc.nextInt();				//SCANNING_OF_ARRAY

System.out.println("NO. OF ROTATIONS REQUIRED: "+p.getCount(arr,arr.length)+"\n");
}

}
}

/*
#ROTATION COUNT PROBLEM:
->Given an array of integers, find the minimum number
  of rotations performed on some sorted array to
  create this given array.
->If nothing is to be rotated then return -1 else return
  the no. of rotations required..

#TESTCASES:-

6
15 18 3 4 6 12
=>2

6
1 2 3 4 5 6
=>-1

6
1 2 3 4 5 6
=>-1

4
3 4 5 2
=>3

4
2 1 1 1
=>1

6
15 18 2 3 6 12
=>2

7
4 5 8 2 2 2 3
=>3

6
1 1 1 1 1 1
=>-1

6
1 2 3 4 5 6
=>-1

4
3 4 5 2
=>3

4
2 1 1 1 2
=>1
*/
