package GENERICS;


class Rect<T>
{
private T len;
private T wid;
Rect(T l,T w)
{
len=l;
wid=w;
}

public T getlen()
{
return len;
}
public T getwid()
{
return wid;
}
}
class Gen1
{
public static void main(String[] args)
{
Rect<Integer> r=new Rect<Integer>(40,20);
System.out.println("Area=>"+r.getlen()*r.getwid());
Rect<Double> r1=new Rect<Double>(4.0,2.0);
System.out.println("Area=>"+r1.getlen()*r1.getwid());
}
}
