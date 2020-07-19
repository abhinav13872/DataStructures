package FILEHANDLING;
import java.util.*;
import java.io.File;//imports the file class
import java.io.IOException;//imports the IOException class to handle errors
import java.io.FileWriter;
public class CreateFile
{
public static void main(String[] args)
{
try
{
//File obj=new File("file1");
File obj=new File("/home/abhinav/p1/FileHandling/Filef123.txt");
//Path differs in case of different OS
if(obj.createNewFile())
{
System.out.println("File created:"+ obj.getName());
}
else if(obj.exists())
{
System.out.println("File already exists!!");
System.out.println("File name: "+ obj.getName());//prints the nae of file
System.out.println("Absolute path: "+ obj.getAbsolutePath());//prints file's Absolute path
System.out.println("Writeable: "+ obj.canWrite());//tells file is writeable or not
System.out.println("Readable: "+ obj.canRead());//tells file is readable or not
System.out.println("File size in Bytes: "+ obj.length());
}
}
catch(Exception e)
{
//System.out.println(e);
e.printStackTrace();
}
}
}
