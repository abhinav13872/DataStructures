package STACK;
import java.util.Scanner;
import java.util.Stack;
import java.util.HashMap;


public class ParenthesisWt
{
/*HashMap to store the ending 
index of every opening bracket*/
static HashMap<Integer,Integer> map=new HashMap<Integer,Integer>(); 

public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.print("EXPRESSION: ");
String str = sc.nextLine().trim();

//Update the closing Index
getClosingIndex(str);
System.out.println("WEIGHT OF EXPRESSION: "+calcWeight(str,0,str.length()-1));
}


/*
Function to calculate and store
the closing index of each opening 
bracket in the parenthesis
*/
public static void getClosingIndex(String str) 
{
Stack<Integer> s = new Stack<Integer>(); 

for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);

if(c == '(') s.push(i);

if(c == ')')
{
/*If it's a closing bracket, 
pop index of it's corresponding 
opening bracket*/ 

int startIndex=s.pop(); 

/*
Insert the index of opening 
bracket and closing bracket 
as key-value pair in the 
hashmap
*/ 
map.put(startIndex,i); 
}
}
}


/*Function to return the weight of 
parenthesis*/
public static int calcWeight(String s,int low,int high)
{
//Base case 
if(low+1 == high) return 1; 

/*Mid refers to ending index of 
opening bracket at index low*/
int mid=map.get(low);

if (mid == high) return (2*calcWeight(s,low + 1,high-1));
return (calcWeight(s,low,mid) + calcWeight(s,mid+1,high));
}
}
