package STACK;
import java.util.*;
public class Stack1
{
/*
final int size=10;
int arr[]=new int[size];
int top=-1;//TELLING STACK IS EMPTY


int peek()//WITH THIS HM TOP PE DATA DEKHRE H!!
{
if(this.isEmpty())
{
System.out.println("CAN'T SEE TOP->STACK IS EMPTY!!");
return -1;
}
return arr[top];
}


boolean isEmpty()
{
if(top==-1) return true;
return false;
}


void push(int data)
{
if(top==size-1)
{
System.out.println("CAN'T PUSH ELEMENT:"+ data +" ->STACK IS FULL!!");
return;
}
arr[++top]=data;
}


int pop()
{
if(this.isEmpty())
{
System.out.println("CAN'T POP ANY ELEMENT->STACK IS EMPTY!!");
return -1;
}
return arr[top--];
}
*/

public static void main(String[] args)
{
//Stack1 s=new Stack1();
Stack<Integer> s=new Stack<>();
System.out.println("EMPTY STACK: "+s.isEmpty());
s.push(1);//0
s.push(2);//1
s.push(3);//2
s.push(4);//3
s.push(5);//4
s.push(6);//5
s.push(7);//6
s.push(8);//7
s.push(9);//8
s.push(10);//9
s.push(11);//10
s.push(9);//11
System.out.println("ELEMENT POPED: "+s.pop());
System.out.println("ELEMENT AT PEEK: "+s.peek());
}
}
