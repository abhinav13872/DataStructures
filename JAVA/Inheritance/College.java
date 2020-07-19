package INHERITANCE;
abstract class University
{
String DeptName;//instance variable
int DeptNo,NoOfStudents;//instance variables
abstract void get();//abstract method(only be declared defined somewhere else)
void put()//instance method
{
System.out.println("DeptName="+DeptName);
System.out.println("DeptNo="+DeptNo);
System.out.println("NoOfStudents="+NoOfStudents);
}
}
class CSOET extends University
{
void get()//abstract method definition(there definition changes according to class)
{
DeptName="Education";
DeptNo=181198;
NoOfStudents=3000;
}

}
class CUSIN extends University
{
void get()//abstract method definition
{
DeptName="Nursing";
DeptNo=181178;
NoOfStudents=1000;
}

}
class CUSBS extends University
{
void get()//abstract method definition
{
DeptName="Hospitality";
DeptNo=1811;
NoOfStudents=200;
}

}
class College
{
public static void main(String[] args)
{
University u;//referance variable
u=new CSOET();//storing referance of CSOET subclass
u.get();
u.put();
u=new CUSIN();//storing referance of CUSIN subclass(referance bdl di)
u.get();
u.put();
u=new CUSBS();//storing referance of CUSBS subclass(again referance bdl di)
u.get();
u.put();
}
}
/*
for abstract method there has to be abstract class but
agr class abstract h then ye jroori nhi ki saare method abstract ho!!
*/ 
