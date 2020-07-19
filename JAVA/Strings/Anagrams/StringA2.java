package ANAGRAMS;
import java.util.*;
public class StringA2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();
while(T-->0)
{
String s=sc.next();
String s1=sc.next();
GfG g=new GfG();
System.out.println(g.remAnagrams(s,s1));
}
}
}
class GfG
{
public int remAnagrams(String s,String s1)
{
int count=0;
int fr[]=new int[26];
for(int i=0;i<s1.length();i++)
fr[s1.charAt(i)-'a']++;
for(int i=0;i<s.length();i++)
fr[s.charAt(i)-'a']--;    
for(int i=0;i<26;i++)
{
if(fr[i]<0)
{
for(int j=fr[i];j<0;j++)
count++;
}
else if(fr[i]>0)
{
for(int j=0;j<fr[i];j++)
count++;
}
}   
return count;
}
}
//COUNT OF CHARACTERS TO BE REMOVED TO MAKE A STRING ANAGRAM
