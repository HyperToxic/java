package toxic;
import java.io.*;
class BufferedInputStreamTest
{
  public static void main(String[] args)
  {
    int b = 0;
	try
	{
	  FileInputStream in = new FileInputStream("D:/IO/guohao.java");
	  BufferedInputStream bis = new BufferedInputStream(in);
	  System.out.print(bis.read());
	  System.out.println();
	  bis.mark(5);
	  while((b=bis.read()) !=-1)
	  {
	    System.out.print((char)b);
		//System.out.println();
	  }
	  System.out.println();
	  
	  bis.reset();
	  while((b=bis.read()) != -1)
	  {
	    System.out.print((char)b);
		//System.out.println();
	  }
	  System.out.println();
	  
	}
	
	catch(IOException ioe)
	{
	  System.out.println("sth error");
	}
  }
}