package guohao;
import java.io.*;
class FileOutputStreamTest
{
  public static void main(String[] args)
  {
    int b =0;
	FileInputStream in = null;
	FileOutputStream out = null;
	
	try
	{
	  in = new FileInputStream("D:/IO/guohao.java");
	  out = new FileOutputStream("D:/IO/guohaoCopy.java");
	  while((b= in.read()) != -1)
	
	  {
	    out.write(b);
	  }
	}
	
	catch(FileNotFoundException e)
    {
	  System.out.println("file not exit");
	  System.exit(-1);
    }	
	
	catch(IOException ioe)
	{
	  System.out.println("error");
	  System.exit(-1);
	}
  }
}