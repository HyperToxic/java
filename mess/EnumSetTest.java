package guohao;
import java.util.*;
enum Season
{
  SPRING ,SUMMER,FALL,WINTER;
}

public class EnumSetTest
{

  public void Test()
  {
    EnumSet e = EnumSet.allOf(Season.class);
    p(e);
    EnumSet e1 = EnumSet.noneOf(Season.class);
    p(e1);
    e1.add(Season.WINTER);
    e1.add(Season.SUMMER);
	p(e1);
    EnumSet e2 = EnumSet.of(Season.FALL,Season.WINTER);
    p(e2);
    EnumSet e3 = EnumSet.range(Season.FALL,Season.WINTER);
    p(e3);
    EnumSet e4 = EnumSet.complementOf(e3);
    p(e4);
	
	
	HashSet c = new HashSet();
	c.clear();
	c.add(Season.FALL);
	c.add(Season.SUMMER);
	p(c);
	EnumSet e5 = EnumSet.copyOf(c);
	p(e5);
	e5.add(Season.SPRING);
	p(e5);
	//e5.add("guohao");  //cause exception
	
	
	
	
 }

  public void p(Object obj)
  {
    System.out.println(obj);
  }

  public static void main(String[] args)
  {
    new EnumSetTest().Test();
  }
}






