package guohao;
import java.util.*;
class LinkedListTest
{
  public static void main(String[] args)
  {
    LinkedList l = new LinkedList();
	for(int i =0;i<10;i++)
	{
	  l.add("a"+i);
	}
	p(l);
	Collections.shuffle(l);
	p(l);
	Collections.reverse(l);
	p(l);
	Collections.sort(l);
	p(l);
	p(Collections.binarySearch(l,"a5"));
	
	new LinkedListTest().Test();
	
  }
	
	public static void p(Object o)
	{
	  System.out.println(o);
	}
	
	public void Test()
	{
	  LinkedList l1 = new LinkedList();
	  for(int i=0;i<10;i++)
	  {
	    l1.add("aaa"+i);
	  }
	  //l1.add("guohao");
	  //l1.add("guoziyi");
	  p(l1);
	  LinkedList l2 = new LinkedList();
	  
	  for(int i =0;i<10;i++)
	    {
	      l2.add("a"+i);
	    }
	  p(l2);
	  Collections.copy(l1,l2);
	  p(l1+"this is l1 after copy method");
	  l1.set(3,"holdOn");
	  p(l1);
	  l1.get(3);
	  l1.remove(1);
	  p(l1);
	}
	
	
  
}
