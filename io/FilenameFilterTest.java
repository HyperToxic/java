/**
����API�ĵ� ������ϸʹ�÷�����
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
		System.out.println("��Ŀ¼�����еķ������ļ��ǣ� ");
		for(String names : fileList)
		{
			//System.out.println("��Ŀ¼�����еķ������ļ��ǣ� ");
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
		
		//return name.endsWitj(".java");  �г�javaԴ�ļ�
		
	}
}