package INTERFACE;
import java.util.Scanner;
interface library
{
void fineDetail();//abstract+public
}
interface Accounts
{
void feeDetail();//abstract+public
}
class Student9 implements library,Accounts
{
private int fine,fee,id,Due;//instance variables of concrete class Student9
private String name;//instance variable of concrete class Student9
Scanner s=new Scanner(System.in);

public void fineDetail()
{
fine=s.nextInt();//scan fine
}
public void feeDetail()
{
fee=s.nextInt();//scan fees
}

void getDetails()
{
name=s.nextLine();//scan name
id=s.nextInt();//scan id
fineDetail();
feeDetail();
CalculateDues();
}
void display()
{
System.out.println("NAME: "+name);
System.out.println("ID: "+id);
System.out.println("FINE: "+fine);
System.out.println("FEE: "+fee);
System.out.println("TotalDue: "+Due);
}
void CalculateDues()
{
Due=fine+fee;//Total Due
}
}
public class M9
{
public static void main(String[] args)
{
Student9 s=new Student9();
s.getDetails();
s.display();
}
}
