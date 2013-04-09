package toxic;
import java.io.*;
class PrintStreamTest
{
	public static void main(String[] args)
	{
		PrintStream pos = null;
		try{
			FileOutputStream fos = 
			new FileOutputStream("D:/codes/mess/PrintStream.txt");
			pos = new PrintStream(fos);
		}
		catch(IOException ioe)
		{
			System.out.println("ÏµÍ³´íÎó");
		}
		
		
		if(pos != null){
		System.setOut(pos);
	  }
	  int ln = 0;
	  for(char ch = 0; ch<65535;ch++)
	  {
	  	System.out.print(ch + " ");
	  	if(ln>100)
	  	{
	  		System.out.println();
	  		ln=0;
	  	}
	  }
	}
}