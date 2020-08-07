package REVERSESTRING;
import java.util.*;


public class StringR2
{

public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);

System.out.print("TESTCASES: ");
int T=Integer.parseInt(sc.nextLine());

while(T-->0)
{
System.out.print("STRING: ");
String str=sc.nextLine();

boolean flag=checkPallindrome(str);				//FLAG
if(flag) System.out.println("PALLINDROME");
else System.out.println("NOT A PALLINDROME");
}
}


private static boolean checkPallindrome(String str)		//CHECK PALLINDROME
{
char arr[]=str.toCharArray();
int l=0;							//LEFT POINTER
int r=str.length()-1;						//RIGHT POINTER

while(l < r)
{
if(arr[l] != arr[r]) return false;
l++;
r--;
}
return true;
}
}
//PALLINDROME TEST
