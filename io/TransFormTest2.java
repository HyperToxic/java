package toxic;
import java.io.*;
class TransFormTest2
{
  public static void main(String[] args)
  {
    try
	{
	  InputStreamReader isr = new InputStreamReader(System.in);
	  System.out.println("please input your words.....");
	  BufferedReader br = new BufferedReader(isr);
	  String s = null;
	  s = br.readLine();
	  while(s != null )
	  {
	    if(s.equalsIgnoreCase("exit"))
		{
		  break;
		}
		else
		{
		  System.out.println(s.toUpperCase());
		  s = br.readLine();
		}
	  }
	  br.close();
	}
	
	catch(IOException ioe)
	{
	  ioe.printStackTrace();
	}
  }
}