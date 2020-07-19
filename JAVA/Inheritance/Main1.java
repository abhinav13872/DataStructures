package INHERITANCE;
class Vehicle
{
int max_speed=120;
}
class car extends Vehicle
{
int max_speed=180;
void display()
{
System.out.println(super.max_speed);//telling ki BASE class ki max_speed
}
}
class Main1
{
public static void main(String[] args)
{
car small=new car();
small.display();
}
}
/*
super keyword is used to refer BASE class
*/
