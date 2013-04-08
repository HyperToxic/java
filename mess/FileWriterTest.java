package guohao;
import java.io.*;
class FileWriterTest
{
  public static void main(String[] args)
  {
    int b = 0;
	FileReader fr = null;
	FileWriter fw = null;
	
	try
	{
	  fr = new FileReader("D:/IO/guohao.java");
	  fw = new FileWriter("D:/IO/guohaoCopy2.java");
	  while((b=fr.read()) != -1)
	  {
	    fw.write(b);
	  }
	  
	  fr.close();
	  fw.close();
	}
	
	catch(FileNotFoundException e)
	{
	  System.out.println("file not exist");
	  System.exit(-1);
	}
	catch (IOException ioe)
	{
	  System.out.println("error");
	  System.exit(-1);
	}
  }
}