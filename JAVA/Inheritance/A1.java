package INHERITANCE;
class A
{
static int y=4;//static variable of A
}
class B extends A
{
static int y=4;//static variable of B
static
{
y=5;
}
}
class A1
{
public static void main(String[] args)
{
System.out.println(B.y);
}
}
//INHERITANCE
/*
Remember:-
#Static member in Inheritance:-
agr static member jo parent class mein h agr same static member child class mein ho then parent
class vla HIDE hojaega child class vle se!!

#Instance member in Inheritance:-
same name + same return type hua method ka parent and child class mein then parent vla method OVERRIDE
hojata h child class ke method se
*/
