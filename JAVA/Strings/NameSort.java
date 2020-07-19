package STRING;
import java.util.*;
class NameSort
{
static String StringNameSort(String str)
{
String s[]=str.split(" ");// or we can use regex \\s
for(int i=0;i<s.length;i=i+1)
{
for(int j=0;j<s.length;j=j+1)
{
String x=s[i];
String y=s[j];
int d=y.compareTo(x);
if(d>0)
{
//System.out.println(s[i]+" "+s[j]);
String temp=s[i];
s[i]=s[j];
s[j]=temp;
//System.out.println(s[i]+" "+s[j]);
}
}
}
String z=String.join(" ",s);//sorted String
return z;
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=Integer.parseInt(sc.nextLine().trim());
while(t!=0)
{
String a=sc.nextLine();
String b=StringNameSort(a);
System.out.println(b);
t--;
}

}
}
/*
=> \s is for whitespace
*/
