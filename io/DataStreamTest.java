package toxic;
import java.io.*;
class DataStreamTest
{
	public static void main(String[] args)
	{
		//char ch;
		System.out.println("你好，java程序，这是一个简单的测试！");
		try
		{
		  DataInputStream dts = 
		  new DataInputStream(new FileInputStream("D:\\codes\\java\\mess\\HelloWorld.txt"));
		  System.out.println(dts.readDouble());
		  System.out.println(dts.readBoolean());
		  System.out.println(dts.readLong());
		  System.out.println(dts.readLine());//DAataStream中的readLine()是一个已经过时的API
		  
		  /*
		  该方法无法将字节正确转换为字符。从 JDK 1.1 开始，
		  读取文本行的首选方法是使用 BufferedReader.readLine() 方法。
		  使用 DataInputStream 类读取文本行的程序可以改为使用 BufferedReader 类，
		  只要将以下形式的代码： 
      DataInputStream d = new DataInputStream(in);
      替换为： 
      BufferedReader d
          = new BufferedReader(new InputStreamReader(in));
      */
     
		  
		  /*String ch = null;
		  while((ch = dts.readLine()) != null){
		  ch = (String)dts.readLine();
		System.out.print(ch);}
		*/
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		
	}
}

//读出中文是？？？？？？？？？吗