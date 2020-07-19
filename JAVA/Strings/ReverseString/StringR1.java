package REVERSESTRING;
import java.util.*;
public class StringR1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int T=Integer.parseInt(sc.nextLine());
while(T-->0)
{
String str=sc.nextLine();
/*METHOD-1(reverse printing of characters)
for(int i=str.length()-1;i>=0;i--)
System.out.print(str.charAt(i));
System.out.println();
*/
/*METHOD-2(array mei store kradi revers order mein string)
char arr[]=str.toCharArray();
char arr1[]=new int[arr.length];//local variable has to be initialized
for(int i=0;i<str.length();i++)
arr1[i]=str.charAt(str.length()-i-1);

for(int i=0;i<arr1.length;i++)
System.out.print(arr1[i]);
System.out.println();
*/
char arr[]=str.toCharArray();
int l=0;//LEFT POINTER
int r=str.length()-1;//RIGHT POINTER
while(l<r)
{
char SWAP=arr[l];
arr[l]=arr[r];
arr[r]=SWAP;
l++;
r--;
}
for(int i=0;i<arr.length;i++)
System.out.print(arr[i]);
System.out.println();
}
}
}
