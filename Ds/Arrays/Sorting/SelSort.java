package SORTING;
import java.util.*;



public class SelSort
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("No. of Testcases: ");
int t=sc.nextInt();					//no. of testcases
while(t!=0)
{
System.out.print("Size of Array: ");
int n=sc.nextInt();					//size of array
int a[]=new int[n];					//creation of array

System.out.println("Scan Array: ");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();					//scanning of array



//SELECTION SORT:-
for(int i=0;i<n-1;i++)
{
int m=i;						//lowest value's index
for(int j=i+1;j<n;j++)
{
if(a[j]<a[m])
m=j;
}
System.out.println("=>"+a[m]);

//SWAP
int temp=a[m];
a[m]=a[i];
a[i]=temp;
}



//PRINTING OF ARRAY:-
for(int i=0;i<n;i++) System.out.print(a[i] + ((i != n-1) ? " " : "\n"));

t--;
}
}
}

