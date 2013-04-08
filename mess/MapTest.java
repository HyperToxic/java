package guohao;
import java.util.*;
class MapTest
{

  public static void main(String[] args){
  HashMap m1 = new HashMap();
  HashMap m2 = new HashMap();
  HashMap m4 = new HashMap();
  
  m4.put(1,1000);
  m4.put(2,10000);
  m4.put(3,1000000);
  p(m4);
  p((Integer)m4.get(3));
  
  
  m1.put("a",new Integer(1));
  
  m1.put("b",new Integer(2));
  m1.put(1,new String("haha"));
  p(m1);
  m2.put("1",new String("guohao"));
  m2.put("2",new String("guoziyi"));
  p(m2);
  
  p(((Integer)m1.get("a")).intValue());
  
  HashMap m3 = new HashMap(m1);
  m3.putAll(m2);
  p(m3);
  
  
    }
	
	public static void p(Object o)
	{
	  System.out.println(o);
	}
}

// do a print test!!!!!!!!!!!!!!!!!!!!!!!!!!!!! rember !!!!!!!!   :)
