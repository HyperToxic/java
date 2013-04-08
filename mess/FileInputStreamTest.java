package guohao;
import java.io.*;
class FileInputStreamTest
{
  public static void main(String[] args)
  {
    int b = 0;
	FileInputStream in = null;
	try
	{
	  in = new FileInputStream("C:/Users/guohao/Documents/GitHub/javaTest/FileInputStreamTest.java");
	  
	}
	catch(FileNotFoundException e)
	{
	  System.out.println("file not exit");
	  System.exit(-1);
	}
	
	
	try
	{
	  long num = 0;
	  while((b = in.read() )!= -1)
	  {
	    System.out.print((char)b);// NOT PRINTLN!!!!!!!!!
		num++;
	  }
	  
	  in.close();
	  System.out.println();
	  System.out.println("the number of char have read is:" + num);
	}
	
	catch(IOException e)
	{
	  System.out.println("system error");
	  System.exit(-1);
	}
	
  }
}




















