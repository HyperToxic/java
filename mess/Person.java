package guohao;
import java.util.*;
public enum Person
{
  Male("boy"),Female("girl");
  private String name;
  private Person(String name)
  {
    this.name = name;
  }
  public static void main(String[] args)
  {
    Person p = Enum.valueOf(Person.class,"Male");
	System.out.println(p);
	
  }
}


interface Information
{
  void info();
}

enum Gender implements Information
{

  
  
  
  MALE("boy")
  {
    public void info()
	{
	  System.out.println("mboy");
	}
  },
  
  FEMALE("girl")
  {
    public void info()
	{
	  System.out.println("MGIRL");
	}
  };
  
  private String name;
  private Gender(String name)
  {
    this.name = name;
  }
   private String getName()
   {
     return this.name;
   }
  
  public static void main(String[] args)
  {
    Gender g = Enum.valueOf(Gender.class,"MALE");
	System.out.println(g);
	g.name="guoziyi";
	g.info();
	System.out.println(g.getName());
	
  }
  
  
}













