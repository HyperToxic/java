package toxic;
import java.io.*;
class DataStreamTest
{
	public static void main(String[] args)
	{
		//char ch;
		System.out.println("��ã�java��������һ���򵥵Ĳ��ԣ�");
		try
		{
		  DataInputStream dts = 
		  new DataInputStream(new FileInputStream("D:\\codes\\java\\mess\\HelloWorld.txt"));
		  System.out.println(dts.readDouble());
		  System.out.println(dts.readBoolean());
		  System.out.println(dts.readLong());
		  System.out.println(dts.readLine());//DAataStream�е�readLine()��һ���Ѿ���ʱ��API
		  
		  /*
		  �÷����޷����ֽ���ȷת��Ϊ�ַ����� JDK 1.1 ��ʼ��
		  ��ȡ�ı��е���ѡ������ʹ�� BufferedReader.readLine() ������
		  ʹ�� DataInputStream ���ȡ�ı��еĳ�����Ը�Ϊʹ�� BufferedReader �࣬
		  ֻҪ��������ʽ�Ĵ��룺 
      DataInputStream d = new DataInputStream(in);
      �滻Ϊ�� 
      BufferedReader d
          = new BufferedReader(new InputStreamReader(in));
      */
     
		  
		  /*String ch = null;
		  while((ch = dts.readLine()) != null){
		  ch = (String)dts.readLine();
		System.out.print(ch);}
		*/
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		
	}
}

//���������ǣ�������������������