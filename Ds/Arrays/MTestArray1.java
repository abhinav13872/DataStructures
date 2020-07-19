package ARRAYS; 
class MTestArray1
{

public static void main(String[] args)
{
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
}
}

}
//FOR-EACH LOOP IMPLEMENTATION
