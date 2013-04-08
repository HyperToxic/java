package toxic;
import java.io.*;
class TransFormTest1
{
  public static void main(String[] args)
  {
  try
  {
    OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:/IO/toxic.c"));
	osw.write("guohaoGUOHAO,COME");
	System.out.println(osw.getEncoding());
	osw.close();
	
    osw = new OutputStreamWriter(new FileOutputStream("D:/IO/toxic.c",true), "ISO8859-1");
	osw.write("you can do it ");
	System.out.println(osw.getEncoding());
	osw.close();
	// do not forget close()  or.....please try to fogt.
	
	
  }
  
  catch(IOException ioe)
  {
    ioe.printStackTrace();
  }
}
}

//测试