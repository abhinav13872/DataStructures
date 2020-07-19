package ARRAYS; 
import java.util.*;
class MTestArrayR
{
public static void rotate(int a[][],int r1,int c1)			//Rotation Method
{
int b[][]=new int[r1][c1];
for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
{
b[i][j]=a[r1-1-j][i];
//System.out.println("i:  " + i + "  j:  " +j +"==>"+ b[i][j]);
}
}

System.out.println("#ARRAY AFTER ROTATION BY 90:- ");
for(int i=0;i<r1;i++)
{
for(int j=0;j<c1;j++)
{
System.out.print(b[i][j]);
if(j!=c1-1)
System.out.print("  ");
}
System.out.println();
}
}


public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("ENTER THE NO. OF TESTCASES: ");
int t=Integer.parseInt(sc.nextLine().trim());
while(t!=0)
{
System.out.print("ENTER NO. OF ROWS: ");
int r=sc.nextInt();
System.out.print("ENTER NO. OF COLUMNS: ");
int c=sc.nextInt();
int [][]arr=new int[r][c];//arr

System.out.println("SCAN ARRAY:-");
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
arr[i][j]=sc.nextInt();

System.out.println("#ARRAY BEFORE ROTATION BY 90:- ");
for(int i=0;i<r;i++)							//array before rotation
{
for(int j=0;j<c;j++)
{
System.out.print(arr[i][j]);
if(j!=c-1)
System.out.print("  ");
}
System.out.println();
}
rotate(arr,c,r);							//array after rotation
t--;
}
}
}
