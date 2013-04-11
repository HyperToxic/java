/**
查阅API文档 看看详细使用方法！
*/





package toxic;
import java.io.*;
public class FilenameFilterTest
{
	public static void main(String[] args) throws IOException
	{
		//File file = new File(".");
		File file = new File("D:/codes/java/practice/mess/FilterTest");
		//file.createNewFile();
		file.mkdir();
		System.out.println(file.exists());
		String[] fileList = file.list(new MyFilenameFilter());
		System.out.println("本目录下所有的非隐藏文件是： ");
		for(String names : fileList)
		{
			//System.out.println("本目录下所有的非隐藏文件是： ");
			System.out.println(names);
			System.out.println("------------");
		}
		
	}
}

class MyFilenameFilter implements FilenameFilter
{
	public boolean accept(File dir,String name)
	{
		
		return name.endsWith("");
		
		//return name.endsWitj(".java");  列出java源文件
		
	}
}