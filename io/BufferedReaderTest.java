package toxic;
import java.io.*;
class BufferedReaderTest
{
  public static void main(String[] args)
  {
    String s = null;
	String s2 = null;
    try
	{
	  //filereader's pipe
      BufferedReader br = new BufferedReader(new FileReader("D:\\codes\\java\\mess\\HelloWorld.txt"));
	  BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\codes\\java\\mess\\HelloWorld.txt"));
	  //writer
	  for(int i =0;i<100;i++)
	  {
	    s2=String.valueOf(Math.random());
		bw.write(s2);
		bw.newLine();
	  }
	  bw.flush();
	  System.out.println();
	  
	  
	  
	  
	  //reader
	  while((s=br.readLine()) != null)
	  {
	    System.out.print(s);
		System.out.println();
	  }
	  System.out.println();
    }
	
	catch(IOException ioe)
	{
	  ioe.printStackTrace();
	}
  }
}
