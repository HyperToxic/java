package guohao;
import java.util.*;
class GenericTest
{
  public static void main(String [] args)
  {
    HashMap<String,Integer> m = new HashMap<>();
	m.put("guohao",99);
	m.put("guoziyi",9999);
	System.out.println(m);
	int i = m.get("guohao");
	System.out.println(i);
	//m.put("guohao","guohao");
  }
}


class Person<T>
{
  public T info;
  
  public Person( T info)
  {
    this.info = info;
  }
  
  public void setInfo(T info)
  {
    this.info = info;
  }
  
  public T getInfo()
  {
    return info;
  }
  
  public static void main(String[] args)
  {
    Person<String> p = new Person<>("guohao");
	System.out.println(p.getInfo());
	
	Person<Integer> p1 = new Person<>(99);
	System.out.println(p1.getInfo());
	
  }
  
  
  
}


class Student extends Person
{

  public Student(String info)
  {
    super(info);
  }
  public String getInfo()
  {
    return super.getInfo().toString();
	//return super.getInfo();
  }
  
  public static void main(String[] args)
  {
    Student s = new Student("guohao");
	System.out.println(s.getInfo());
	
  }
}



class Teacher extends Person<String>
{

  public Teacher(String info)
  {
    super(info);
  }

   /*public String getInfo()
  {
    return super.getInfo();
  }
  
  public void setInfo(String info)
  {
    this.info  = info;
  }
  */

  public static void main(String[] args)
  {
    Teacher p = new Teacher("guohaojava");
	Person p1 = new Teacher("guohaoziyi");
    System.out.println(p.getInfo());
	System.out.println(p1.getInfo());
  }
}






// son that extends father who has a constrctor should writ a constructor too!!!!!!!!!!!!!!!








