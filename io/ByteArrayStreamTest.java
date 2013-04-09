package toxic;
import java.io.*;
class ByteArrayStreamTest
{
	public static void main(String[] args){
		try{
	    ByteArrayOutputStream bos = new ByteArrayOutputStream();
	    DataOutputStream dos = new DataOutputStream(bos);
	    String name = "guohao";
    	int age = 99;
	    Double weight = 130.0;
	
	    dos.writeUTF(name);
	    dos.writeInt(age);
	    dos.writeDouble(weight);
	
	    byte[] buff = bos.toByteArray();// byte[]����,��Ҫע���ǰ�BOSд��������
	    ByteArrayInputStream bis = new ByteArrayInputStream(buff);
	    DataInputStream dis = new DataInputStream(bis);
	
	    String NewName = dis.readUTF();
	    int NewAge = dis.readInt();
    	Double NewWeight = dis.readDouble();
	
	    System.out.println(NewName +" "+NewAge+" " + NewWeight);
	  }
	  
	  catch(IOException ioe)
	  {
	    ioe.printStackTrace();
	  }
	  
  }
}