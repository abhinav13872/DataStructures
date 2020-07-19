package ARRAYS; 
import java.util.*;
class MatrixProduct
{
public MatrixProduct(int r,int c,int [][]a,int r1,int c1,int [][]b)
{
int [][]M=new int[r][c1];

for(int i=0;i<r;i++)//M array
{
int s=0;
for(int j=0;j<c1;j++)
{
for(int k=0;k<r1;k++)
{
s+=a[i][k]*b[k][j];
}
M[i][j]=s;
s=0;
}
}

for(int i=0;i<r;i++)//printing of M array
{
for(int j=0;j<c1;j++)
{
System.out.print(M[i][j]);
if(j!=c1-1)
System.out.print(" ");
}
System.out.println();
}

}

}
class MTestArrayM
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("ENTER THE NO. OF TESTCASES: ");
int t=Integer.parseInt(sc.nextLine().trim());
while(t!=0)
{
System.out.println("FOR ARRAY-1:-");
System.out.print("ENTER NO. OF ROWS: ");
int r=sc.nextInt();
System.out.print("ENTER NO. OF COLUMNS: ");
int c=sc.nextInt();
int [][]arr=new int[r][c];//arr

System.out.println("SCAN ARRAY:-");
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
arr[i][j]=sc.nextInt();

System.out.println("FOR ARRAY-2:-");
System.out.print("ENTER NO. OF ROWS: ");
int r1=sc.nextInt();
System.out.print("ENTER NO. OF COLUMNS: ");
int c1=sc.nextInt();
int [][]brr=new int [r1][c1];//brr

System.out.println("SCAN ARRAY:-");
for(int i=0;i<r1;i++)
for(int j=0;j<c1;j++)
brr[i][j]=sc.nextInt();

MatrixProduct m=new MatrixProduct(r,c,arr,r1,c1,brr);
t--;
}

}
}
//MATRIX MULTIPLICATION3 3
