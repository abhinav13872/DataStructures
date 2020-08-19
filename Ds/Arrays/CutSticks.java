package ARRAYS; 
import java.util.Scanner;



class CutSticks
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("SCAN SIZE OF AN ARRAY: ");
int n=sc.nextInt();

int arr[]=new int[n];
if(n > 0) System.out.print("ARRAY: ");

//ARRAY OF LENGTHS[+ve] OF STICKS
for(int i=0;i<n;i++) arr[i]=sc.nextInt();

/*CUT THE STICKS TILL THEIR
LENGTH BECOMES 0*/
Result res=new Result();
arr=res.cutSticks(arr);

System.out.print("\nARRAY: ");
for(int i:arr) System.out.print(i+" ");
System.out.println();
}
}



class Result
{
static int[] cutSticks(int arr[])
{
while(true)
{
int count=0;
int min=getMin(arr);
if(min == 0) break;

for(int i=0;i<arr.length;i++)
if(arr[i] > 0)
{
arr[i]=arr[i]-min;
count++;
}

System.out.print(count+" ");
}
return arr;
}



static int getMin(int arr[])
{
int max=0;
for(int i=0;i<arr.length;i++) if(arr[i] > max) max=arr[i];

int freq[]=new int[max+1];
//EXCLUDING THE CASE FOR '0'
for(int i=0;i<arr.length;i++) freq[arr[i]]++;

int min=0;
for(int i=1;i<freq.length;i++)
{
if(freq[i] != 0)
{
min=i;
break;
}
}
return min;
}
}
