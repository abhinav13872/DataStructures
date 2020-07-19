package INHERITANCE;
import java.util.*;
abstract class Account
{
int balance;
Account(int balance)
{this.balance=balance;}
void showBalance()
{
System.out.println(this.balance);
}
abstract void calculate();
}
class SavingsAccount extends Account
{
SavingsAccount(int balance)
{super(balance);}
double rate=5;
void calculate()
{
System.out.println(balance*(rate/100));
}
}
class CurrentAccount extends Account
{
CurrentAccount(int balance)
{super(balance);}
double rate=0;
void calculate()
{
System.out.println();
}
}
public class Banks
{
public static void main(String[] args)
{
SavingsAccount sa=new SavingsAccount(5000);
sa.calculate();
sa.showBalance();
CurrentAccount ca=new CurrentAccount(5000);
ca.calculate();
ca.showBalance();
}
}
/*
abstract class gives blueprint
hr Account ko vo method implement krna hi pdega jo calculate krega
*/
