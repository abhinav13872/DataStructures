package FILEHANDLING;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputOutputDemo
{
public void readFromFile(File f)
{
//f is file to read

try
{
Scanner input=new Scanner(f);

while(input.hasNext())
System.out.println(input.nextLine());
}

catch(FileNotFoundException e)
{
System.out.println("GIVEN FILE NOT FOUND: " + f);
throw new RuntimeException(e);//UNCHECKED EXCEPTION 
}
}


public void writeToFile(File f)
{
//f is file to be written

PrintWriter writer=null;
try
{
writer=new PrintWriter(f);

writer.println("ABHINAV MAHAJAN");
writer.println("1811981009");
System.out.println("HENCE WRITTEN IN THE FILE: "+f);
}

catch(FileNotFoundException e)
{
System.out.println("GIVEN FILE NOT FOUND: " + f);
throw new RuntimeException(e);//UNCHECKED EXCEPTION 
}

finally
{
writer.flush();//used to FLUSH the stream
writer.close();//used to close the stream
}
}


public static void main(String[] args)
{
InputOutputDemo demo=new InputOutputDemo();

File FILE1=new File("/home/abhinav/p1/JAVA/FileHandling/f1.txt");//CREATING NEW FILE/OVERRIDING OLD FILE
demo.writeToFile(FILE1);

demo.readFromFile(FILE1);
}

}
