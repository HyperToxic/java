package toxic;
import java.io.*;
class PrintStreamTest1
{
	public static void main(String[] args)
	{
		String filename = args[0];//��ȡ����ĵ�һ���ַ�����Ϊfilename
		if(filename != null)
		{
			ListFile(filename,System.out);
		}
		
		
	}
	
	public static void ListFile(String fn,PrintStream ps)//System.out��ΪList�������β�
		{
			try
			{
				BufferedReader bf = 
				new BufferedReader(new FileReader(fn));
				String s = null;
				while((s=bf.readLine())!= null)
				{
					ps.println(s);//�൱��System.out****
					
				}
				bf.close();
			}
			catch(IOException ioe)
			{
				ioe.printStackTrace();
				System.out.println("��ȡʧ��");
			}
			
		}
}