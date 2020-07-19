class Student1
{
int x;
int y;

Student1()//default constructor
{}
Student1(int x,int y)
{
System.out.println(x+"\n"+y);
}
Student1(float x ,float y)
{
System.out.println(x+"\n"+y);
}

}
class Test1
{
public static void main(String[] args)
{
//Student1 s=new Student1(12,10);
Student1 s=new Student1(12.11f,11.11f);
}
}
//OVERLOADING in constructor


/*
Remember:-
1)jb bhi parameterized constructor bnana h then
pehle default constructor bnayein!!

2)float values ko pass krte hue we have to tell ki ye float values h using suffix 'f'
else vo double treat hoti h!!
*/
