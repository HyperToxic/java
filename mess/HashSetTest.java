package guohao;
import java.util.*;
class HashSetTest
{
  public static void p(Object obj)
  {
    System.out.println(obj);
  }
  public static void main(String[] args)
  {
    Set s = new HashSet();
	s.add(new String ("guohao"));
	p(s.add(new String("guohao")));
	
	//Person p = new Person(66,"guohao")
	//s.add(new Person(66,"guohao"));
	//p(s.add(new Person(66,"guohao")));
	
	//p(s.add(new String("guohao")));
	
	Person p = new Person();
	p.SetName("guohao");
	s.add(p);
	Person p1 = new Person();
	p1.SetName("guohao");
	p(s.add(p1));
  }

}


class Person
{ 
  public int age;
  public String name;
  
  /*public Person(int age,String name)
  {
    this.age = age;
	this.name = name;
  }*/
  
  public String GetName()
  {
    return name;
  }
  public void SetName(String name)
  {
    if(name!=null && name.length()<16)
	{
	  this.name = name;
	}
	else
	{
	System.out.println("whats yr name?");
	}
  }
  
  public int GetAge()
  {
    return age;
  }
  
  public void SetAge(int age)
  {
    if(age>0 && age<100)
	{
	  this.age = age;
	}
	else
	{
      System.out.println("whats yr age?");
	}
  }
  
  
  public boolean equals(Object obj)
  {
    if(obj!=null && obj.getClass()==Person.class)
	{
	  Person p = (Person)obj;
	  return this.GetName().equals(p.GetName());
	  //return name.equals(obj.GetName());
	  //return true;
	}
	
	else
	{
	  return false;
	  //return true;
	}
	
	
  }

  public int hashCode()
	{
	  return name.hashCode();
	} 
   public static void main(String[] args){
   Person p3 = new Person();
   p3.SetAge(66);
   p3.SetName("KKKKKKKKKKKK");
   Person p2 = new Person(); 
   p2.SetName("guohao");
   System.out.println(p2.GetName());
 }   
}
































































































































































































































