// 测试环境配置，中英文，系统变量的正确性

/**
 文档注释，测试系统环境。。。。@author guohao
*/

/*
 多行注释，测试。。。。
*/

package toxic;
//测试import
public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("Hello,World!");
		p("im a man");
		p("Hello,Buddy");//测试win7系统变量，以及中文字符显示设置
		p("测试中文cmd");
	}
	
	public static void p(Object o)
	{
		System.out.println(o);
	}
	
	
}