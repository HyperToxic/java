package toxic;
import java.io.*;
class DateStreamTest
{
	public static void main(String[] args)
	{
		char ch = null;
		try
		{
		  DataInputStream dts = 
		  new DateInputStream(new FileReader("D:\codes\java\mess\HelloWorld.java"));
		  
		  ch = (char)dts.readChar();
		  System.out.print(ch);
		}
		
		
	}
}