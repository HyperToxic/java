package toxic;
import java.io.*;
class PushbackReaderTest
{
	public static void main(String[] args){
	try{
	PushbackReader pbr = 
	new PushbackReader(new FileReader("PushbackReaderTest.java"),64);
	char s = (char)pbr.read();
	System.out.print(s);
	//pbr.unread();
	System.out.print(pbr.read());
	
  }
  catch(IOException ioe)
  {
  	ioe.printStackTrace();
  }
  
}
  
  
	
}