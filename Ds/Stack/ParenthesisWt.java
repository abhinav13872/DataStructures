package STACK;
import java.util.Scanner;
import java.util.*;


public class ParenthesisWt
{
//HashMap to store the ending 
//index of every opening bracket 
static HashMap<Integer,Integer> endIndex=new HashMap<Integer,Integer>(); 

/*
Function to calculate and store
the closing index of each opening 
bracket in the parenthesis
*/

public static void getClosingIndex(String s) 
{
int n = s.length(); 

Stack<Integer> st = new Stack<Integer>(); 

for (int i = 0; i < n; i++)
{
if (s.charAt(i) == ')')
{ 
/*If it's a closing bracket, 
pop index of it's corresponding 
opening bracket*/ 

int startIndex = st.pop(); 

/*
Insert the index of opening 
bracket and closing bracket 
as key-value pair in the 
hashmap
*/ 
endIndex.put(startIndex, i); 
} 
else
{
/*If it's an opening bracket, 
push it's index into the stack*/
st.push(i); 
}
}
}

/*Function to return the weight of 
parenthesis*/
public static int calcWeight(String s,int low,int high) 
{
//Base case 
if(low + 1 == high) return 1; 
else
{
/*Mid refers to ending index of 
opening bracket at index low*/
int mid = endIndex.get(low); 
if (mid == high) return 2*calcWeight(s,low + 1,high-1);  
else return calcWeight(s, low, mid)+calcWeight(s,mid+1,high); 
}
}


public static void main(String[] args) 
{ 
Scanner sc=new Scanner(System.in);
System.out.print("EXPRESSION: ");
String input = sc.nextLine().trim(); 
int n = input.length(); 

//Update the closing Index
getClosingIndex(input); 
System.out.println("WEIGHT OF EXPRESSION: "+calcWeight(input,0,n-1)); 
} 
} 

