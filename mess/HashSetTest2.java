package guohao;
import java.util.*;
class HashSetTest2
{
  public static void main(String[] args)
  { 
    Set s = new HashSet();
	s.add(new A());
	s.add(new A());
	s.add(new B());
	s.add(new B());
	s.add(new C());
	s.add(new C());
	System.out.println(s);
	
  }
}

class A
{
  public boolean equals(Object obj)
  {
    return true;
  }
  
  public int hashCode()
  {
    return 2;
  }
}


class B
{
  public boolean equals(Object obj)
  {
    return false;
  }
}

class C 
{
  public int hashCode()
  {
    return 2;
  }
}



/* when equals() and hashCode() both return true then HashSet think they are the same object.*/






























