package INHERITANCE;
class Sup
{
int x;
Sup(int x)//SUPERCLASS constructor
{
this.x=x;
}
void display()
{
System.out.println("Sup class ka x "+x);
}
}
class Sub extends Sup
{
int y;
Sub(int x,int y)//subclass constructor
{
super(x);//constructor call must be the first line
this.y=y;
}
void display()
{
System.out.println("Sup class ka x "+x);
System.out.println("Sub class ka y "+y);
}
}
class M2
{
public static void main(String[] args)
{
Sub s1=new Sub(100,200);//call to parameterized constructor of "Sub" class
s1.display();
}
}
/*
REMEMBER:-
1)OVERRIDING can only be done in SUBCLASS/DERIVERCLASS/CHILDCLASS
2)ARGUEMENT LIST has to be same to OVERRIDE
3) return type of Method OVERRIDDING has to be the subtype of return type
   of the Method to be OVERRIDDEN!!
*/ 
