package STRING;
import java.util.*;
class StringB7
{
static String StringTest(String str)
{
StringBuilder sb=new StringBuilder();
Scanner sc1=new Scanner(System.in);
sb.append(sc1.nextLine().trim());

if(str.equalsIgnoreCase(sb.toString()))
return "=>Yes";
else
return "=>No";
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int t=Integer.parseInt(sc.nextLine().trim());
while(t!=0)
{
String a=sc.nextLine().trim();
String b=StringTest(a);
System.out.println(b);
t--;
}

}
}
