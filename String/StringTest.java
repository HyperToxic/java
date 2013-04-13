package toxic;
public class StringTest
{
	public static void main(String[] args)
	{
	    char[] num = {'1','2','3','4','5','6','7','8','9','0'};
		//int l = num.length();
		String s = new String(num,1,9);
		System.out.println(s);
	}
}