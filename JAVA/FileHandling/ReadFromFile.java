package FILEHANDLING;
import java.util.*;
import java.io.*;
public class ReadFromFile
{
public static void main(String[] args)
{
try
{
File obj=new File("/home/abhinav/p1/FileHandling/Filef123.txt");
Scanner sc=new Scanner(obj);
while(sc.hasNextLine())
{
String data=sc.nextLine();
System.out.println(data);
}
sc.close();
}
catch(FileNotFoundException e)
{
e.printStackTrace();
}
}
}
