import java.util.*;
class AP1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x=n*2+1;
int y=n*2+2;
char [][]a=new char[x][y];
for(int i=0;i<x;i++)
{
for(int j=0;j<y;j++)
{
a[i][j]='*';
}
}

//assigning CORNERS:-
a[0][0]=a[0][y-1]=a[x-1][0]=a[x-1][y-1]='+';

//assigning borders beside corners:-
for(int i=1;i<y-1;i++)
{
a[0][i]='-';
a[x-1][i]='-';
}
for(int i=1;i<x-1;i++)
{
a[i][0]='|';
a[i][y-1]='|';
}

for(int i=0;i<x;i++)
{
for(int j=0;j<y;j++)
{
if( i == (x-1)/2 )//for middle row
{
a[i][1]='<';
a[i][y-2]='>';
if(i%2!=0&&j>1&&j<y-2)
a[i][j]='=';
else
{
if(j>1&&j<y-2)
a[i][j]='-';
}
}
if(i<(x-1)/2&&i>0&&j<y/2&&j>0)//for upper half
{
int d=0;
for(int k=1;k<=(x-1)/2-i;k++)
{
a[i][k]='@';
a[i][y-1-k]='#';
d=k;
}
a[i][d+1]='/';
a[i][y-2-d]='\\';
}
if(i>(x-1)/2&&i<x-1&&i<x-1&&j<y/2&&j>0)//for lower half
{
int c=0;
for(int k=(x-1)/2+1;k<=i;k++)
{
a[i][i-k+1]='@';
a[i][y-k+3]='#';
c=k;
}
a[i][c-3]='\\';
a[i][y-c+2]='/';
}
}
}

for(int i=0;i<x;i++)
{
for(int j=0;j<y;j++)
System.out.print(a[i][j]);
System.out.println();
}
}
}
