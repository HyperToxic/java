package hale;
import java.util.*;
class compareToTest
{

  public static void p(Object oo)
  {
    System.out.println(oo);
  }

  public static void main(String[] args){
  LinkedList l = new LinkedList();
  l.add(new Name("guo","hao"));
  l.add(new Name("haha","ahah"));
  l.add(new Name("lll","hhhh"));
  Collections.sort(l);
  p(l);}
  
  
}



class Name implements Comparable
{

  public String FirstName;
  public String LastName;
  
  public Name(String FirstName,String LastName)
  {
    this.FirstName = FirstName;
	this.LastName = LastName;
  }
  
  
  
  public String toString()
  {
    return 
	FirstName + " " + LastName;
  }
  
  
  public String getFirstName(String FirstName)
  {
    return FirstName;
  }
  
  
  
  public String getLastName(String LastName)
  {
    return LastName;
  }
  
  
  
  public boolean equals(Object o)
  {
    if(o instanceof Name)
	{
	Name name = (Name)o;
	return (FirstName.equals(name.FirstName)) && (LastName.equals(name.LastName));
	}
	
	else
	{
	  return super.equals(o);
	}
  }
  
  
  
  public int hashCode()
  {
    return FirstName.hashCode();
  }
  
  
  
  
  public int compareTo(Object obj)
  {
    
	
	  Name n = (Name)obj;
	  int i = LastName.compareTo(n.LastName);
	
	  
	  return 
	  (i!=0 ? i:FirstName.compareTo(n.FirstName));
	}
  
  
  
}


































