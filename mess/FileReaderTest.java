package guohao;
import java.io.*;
class FileReaderTest
{
  public static void main(String[] args)
  {
    int b = 0;
	FileReader fr = null;
	try
	{
	  fr = new FileReader("D:/IO/guohao.java");
	  
	}
	
	catch(FileNotFoundException e)
	{
	  System.out.println("file not exit");
	  System.out.println();
	  System.exit(-1);
	}
	
	try
	{
	  while((b=fr.read())  != -1)
	  {
	    System.out.print((char)b);
		//System.out.print();
	  }
	}
	
	catch(IOException ioe)
	{
	  System.out.println("error");
	  System.exit(-1);
	}
  }
}