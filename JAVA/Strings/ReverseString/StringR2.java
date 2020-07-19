package REVERSESTRING;
import java.util.*;
public class StringR2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int T=Integer.parseInt(sc.nextLine());
while(T-->0)
{
String s1=sc.nextLine();
char arr[]=s1.toCharArray();
int flag=0;//flag
int l=0;//LEFT POINTER
int r=s1.length()-1;//RIGHT POINTER
while(l<r)
{
if(arr[l]!=arr[r])
{
flag=1;
break;
}
l++;
r--;
}
if(flag!=0) System.out.println("NOT A PALLINDROME");
else System.out.println("PALLINDROME");
}
}
}
//PALLINDROME TEST
