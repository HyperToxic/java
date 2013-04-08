package guohao;
import java.util.*;
class LinkedHashSetTest
{
  public static void main(String[] args)
  {
    //Set s = new LinkedHashSet();
	//both are right...
	LinkedHashSet s = new LinkedHashSet();
	s.add("guohao");
	s.add("mumu");
	s.add("guoziyi");
	System.out.println(s);
	
	s.remove("guohao");
	s.add("guohao");
	System.out.println(s);
  }
  
}