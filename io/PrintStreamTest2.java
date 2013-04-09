package toxic;
import java.io.*;
import java.util.*;
class PrintStreamTest2
{
	public static void main(String[] args)
	{
		String s = null;
		BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
		
		try{
			FileWriter fw = new FileWriter("D:/codes/java/mess/writeLog.txt");
			PrintWriter pw = new PrintWriter(fw);
			while((s=bw.readLine()) != null)
			{
				if(s.equalsIgnoreCase("exit"))
				{
					break;
				}
				else
				{
					System.out.println(s.toUpperCase());
					pw.println("-----");
					pw.println(s);
					pw.flush();
				}
				
			}
			
			pw.println("====="+new Date()+"=====");
			pw.println("auto generate by PrintWriterApp");
			pw.flush();
			pw.close();
		}
		
		catch(IOException ioe)
		{
			System.out.println("ÏµÍ³³ö´íÀ²£¡£¡£¡ :(");
		}
		
	}
}