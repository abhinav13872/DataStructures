package ANAGRAMS;
import java.util.*;
public class StringA1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("No. of Testcase: ");
int T=Integer.parseInt(sc.nextLine());

while(T-->0)
{
System.out.print("String-1: ");
String s1=sc.nextLine();
System.out.print("String-2: ");
String s2=sc.nextLine();
int flag=0;
if(s1.length()!=s2.length())
{flag=1;}
else
{
char f[]=new char[256];
for(int i=0;i<s1.length();i++)
{
/*
int index=s1.charAt(i);
f[index]++;
*/
f[s1.charAt(i)]++;
/*
since we r writing CHARACTER 's1.charAt(i)' in place of INDEX Java compiler
iss CHARACTER ka UNICODE value rkhega INDEX ki place pe
Java compiler janta h ki CHARACTER can't be INTEGER so ye uski INTEGER value(UNICODE) rkhega
*/
f[s2.charAt(i)]--;
}
for(int i=0;i<256;i++)
if(f[i]!=0)
{
flag=1;
break;
}
}
if(flag!=0) System.out.println("Not an ANAGRAM");
else System.out.println("ANAGRAM");
}

}
}
/*
  ANAGRAMS:-
=>Two Strings are said to be Anagrams iff String2 is formed by rearranging the
  characters of String1!! 
*/
