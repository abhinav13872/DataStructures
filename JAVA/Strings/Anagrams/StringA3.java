package ANAGRAMS;
import java.util.*;
import java.lang.*;
import java.io.*;
public class StringA3
{
public static boolean TestAnagram(String s1,String s2)
{
int flag=0;
if(s1.length()!=s2.length()) flag=1;
else
{
int f[]=new int[256];
for(int i=0;i<s1.length();i++)
{
f[s1.charAt(i)]++;
f[s2.charAt(i)]--;
}
for(int i=0;i<256;i++)
{
if(f[i]!=0)
{
flag=1;
break;
}
}
}
if(flag==0) return true;
return false;
}

public static void main (String[] args) {
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
while(T-->0)
{
int N=sc.nextInt();//SCAN NO. OF TESTCASES
String str[]=new String[N];

for(int i=0;i<N;i++)//SCAN STRING'S ARRAY
str[i]=sc.next();

java.util.Arrays.sort(str);//SORT ARRAY

String s="";//EMPTY STRING
for(int i=0;i<N-1;i++)
{
if(s.contains(str[i]));
else
{
s+=str[i]+" ";
for(int j=i+1;j<N;j++)
{
if(TestAnagram(str[i],str[j])) s+=str[j]+" ";
}
}
}
String str1[]=s.split("\\s");
String str2[][]=new String[N][N];
int l=0;//COUNT OF ROWS OF 2D ARRAY
for(int i=0;i<str1.length-1;i++)
{
if(TestAnagram(str1[i],str1[i+1]))
{
str2[l][i]=str1[i];
str2[l][i+1]=str1[i+1];
}
else
{
str2[l][i]=str1[i];
l++;
}
}
String s1="";//EMPTY STRING
for(int i=0;i<l+1;i++)
{
for(int j=0;j<N;j++)
if(str2[i][j]!=null) s1+=str2[i][j]+" ";

String str3[]=s1.split("\\s");
String s2=String.join(", ",str3);//JOIN THE STRING WITH ARG PASSED!!
System.out.println("["+s2+"]");
s1=s2="";
}
}
}
}
//GROUPING OF ANAGRAMS
