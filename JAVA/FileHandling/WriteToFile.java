package FILEHANDLING;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class WriteToFile
{
public static void main(String[] args)
{
try
{
FileWriter w1=new FileWriter("/home/abhinav/p1/FileHandling/Filef123.txt");
w1.write("Java is the prominent programming language of the millenium\n");//Overrides the old content
w1.close();
System.out.println("Successfully written to the file");
}
catch(IOException e)
{
//System.out.println(e);
e.printStackTrace();
}
}
}
