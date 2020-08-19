package ARRAYS; 
class MTestArray2
{
public static void main(String[] args)
{
/*
int a[][];
a=new int[2][2];
a[0][0]=1;
a[0][1]=2;

for(int i[]:a)
{
for(int j:i)
{
System.out.print(j+" ");
}
System.out.println();
}**/

int a[][]={{1,2,3},{4,5,6},{7,8,9}};
int b[][]={{1,2,3},{4,5,6},{7,8,9}};
int c[][]={{1,2,3},{4,5,6},{7,8,9}};
int s=0;

for(int i=0;i<3;i++)
{
s=0;
for(int j=0;j<3;j++)
{
s+=a[i][j]+b[i][j]+c[i][j];
}
System.out.println(s);
}

}
}
/*
->FOR-EACH LOOP
->INITIALIZER-LIST*/
