package guohao;
import java.util.*;
class ArgsWords
{
  private static final Integer ONE = new Integer(1);
  public static void main(String[] args)
  {
    Map m = new HashMap();
	for(int i= 0;i<args.length;i++)
	{
	  Integer freq = (Integer)m.get(args[i]);
	  m.put(args[i],(freq == null? ONE: new Integer(freq.intValue() + 1)));
	}
	
	System.out.println(m.size() + " distinct words found:");
	System.out.println(m);
  }
}

class ArgsWordsGeneric
{
  private static final Integer ONE = new Integer(1);
  public static void main(String[] args)
  {
    Map<String,Integer> m = new HashMap<>();
	for(int i= 0;i<args.length;i++)
	{
	  Integer freq = m.get(args[i]);
	  m.put(args[i],(freq == null? ONE: new Integer(freq.intValue() + 1)));
	}
	
	System.out.println(m.size() + " distinct words found:");
	System.out.println(m);
  }
}


class ArgsWordsAutoBox
{
  private static final int ONE = 1;
 //Wrong: int test = null;
  public static int freq = 0;
  public static void main(String[] args)
  {
    Map m = new HashMap();
	System.out.println(m);
	System.out.println(m.get("aaa"));
	for(int i= 0;i<args.length;i++)
	{
	  int freq = (Integer)m.get(args[i]) == null ? 0 : (Integer)m.get(args[i]);  // notice that if null or not,or you will get NULLPOINT EXCEPTION  
	  m.put(args[i],(freq == 0? ONE: (freq+ 1)));
	}
	
	System.out.println(m.size() + " distinct words found:");
	System.out.println(m);
  }
}