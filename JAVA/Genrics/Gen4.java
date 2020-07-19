package GENERICS;
class Gen4
{
public <E> E[] setArray(E []e)
{
java.util.Arrays.sort(e);
return e;
}
public static void main(String[] args)
{
Gen4 g=new Gen4();
Character [] a={'z','a','q','y','x'};
/*
char []c=a;
Incompatible types error at compile time Character array can't be converted to char array
*/
Character [] b=g.setArray(a);//sorted array
for(int i=0;i<b.length;i++)
{
System.out.println(b[i]);
}

//Java provides boxed types for primitives, along with autoboxing and unboxing to unwrap them:
Integer o=1256;
int d=o;
System.out.println(d);
}
}
