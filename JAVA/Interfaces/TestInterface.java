package INTERFACE;
interface Bank
{
float rateOfInterest();
}
class SBI implements Bank
{
public float rateOfInterest()
{
return 9.16f;
}
}
class PNB implements Bank
{
public float rateOfInterest()
{
return 9.7f;
}
}
public class TestInterface
{
public static void main(String[] args)
{
Bank b=new SBI();
System.out.println("ROI: "+b.rateOfInterest());
}
}
/*
Remember:-
1)agr abstract method interface mein h then jo jo class usko implement krri h
unmein uss method ki definition deni pdegi aisa ni ki ek class mein di bakiyo mein nhi

2)instance of interface cant be created!!
*/

