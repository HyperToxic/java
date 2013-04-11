//package toxic;
import java.io.*;
import java.util.*;
class FileTest
{
	public static void main(String[] args) throws IOException
	{
		File file = new File(".");//在内存中创建file，名字hello,相对路径，寻找父路径会输出null
		p(file.getName());
		p(file.getParent());
		p(file.getAbsoluteFile());
		p(file.getAbsolutePath());
		
		/*
		File file2 = new File("D:/codes/java/practice/io/mess/hello2");
		p(file2.getName());
		p(file2.getParent());//创建绝对路径下的file2，名字hello2；可以寻找父类路径
		p(file2.getAbsoluteFile());
		p(file2.getAbsolutePath());
		*/
		
		File tmpFile = File.createTempFile("guohaoNoNeedToEdit",".txt",file);
		//tmpFile.deleteOnExit();
		File newFile = new File("D:/codes/java/practice/mess/InputLog.txt");
		p("对象是否存在"+newFile.exists());
		p(newFile.createNewFile());
	   //已经创建了newfile，因此无法再去创建目录；
		//p(newFile.mkdir());
		p("对象存在吗~~"+ newFile.exists());
		new FileTest().write();
	}
	
	public static void p(Object o)
	{
		System.out.println(o);
	}
	
	public static void write()
	{
		String s = null;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			FileWriter fw = new FileWriter("D:/codes/java/practice/mess/InputLog.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			while((s=bf.readLine()) != null)
			{
				if(s.equalsIgnoreCase("exit"))  break;
				else
				System.out.println(s.toUpperCase());
				pw.println(s);
				pw.println("-----");
				pw.flush();
				
			}
			
			pw.println(new Date() + "autoGenreated by guohao's PrintWriterApp; do not edit!!!");
			pw.close();
		}
		catch(IOException ioe)
		{
			System.out.println("ERROR");
		}
			
		
	}
}