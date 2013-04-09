package toxic;
import java.io.*;
class PrintStreamTest1
{
	public static void main(String[] args)
	{
		String filename = args[0];//获取输入的第一个字符串作为filename
		if(filename != null)
		{
			ListFile(filename,System.out);
		}
		
		
	}
	
	public static void ListFile(String fn,PrintStream ps)//System.out作为List方法的形参
		{
			try
			{
				BufferedReader bf = 
				new BufferedReader(new FileReader(fn));
				String s = null;
				while((s=bf.readLine())!= null)
				{
					ps.println(s);//相当于System.out****
					
				}
				bf.close();
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
				System.out.println("读取失败");
			}
			
		}
}