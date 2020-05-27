package SORTING;
import java.util.*;
public class BinaryS
{
private static int BinarySearch(int arr[],int x)
{
int l=0;//start index
int r=arr.length-1;//end index

while(l<=r)
{
int mid=(l+r)/2;//mid index

if(x>arr[mid]) l=mid+1;

else if(x==arr[mid]) return mid;//Match found!!

else r=mid-1;
}

return -1;//tells ki element exist hi ni kia
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("No. of Testcases: ");
int T=sc.nextInt();
while(T-->0)
{
System.out.print("Size of Array: ");
int n=sc.nextInt();
int a[]=new int[n];//creation of array

System.out.println("Scan Array: ");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();//scanning of array

System.out.println("Element to be searched: ");
int x=sc.nextInt();
System.out.println(BinarySearch(a,x));
}

}
}
