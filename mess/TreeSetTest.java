package guohao;
import java.util.*;
class TreeSetTest
{
  public static void main(String[] args)
  {
   // Set s = new TreeSet(); //not Set its TreeSet0
    TreeSet s = new TreeSet();
	s.add(9);
	//s.add("guohao");   cant be added due to different types,but A can bcause A offer a comp method
	s.add(8);
	s.add(10);
	s.add(777);
	System.out.println(s);
	System.out.println(s.first());
	System.out.println(s.last());
	System.out.println(s.subSet(8,777));//>=
	System.out.println(s.subSet(8,12));
	System.out.println(s.headSet(10));
	System.out.println(s.tailSet(10));// >=
	s.add(new A(66));
	//s.add(new A(66));
	System.out.println(s);
	
  }
}


//class A implements Comparable
class A
{
  int age;
  public A(int age)
  {
    this.age = age;
  }
  // if remove this compareTo() method A cant be added after intNumbers
 /* public int compareTo(Object obj)
  {
    return 1;
  }*/
  
 /* public boolean equals(Object obj)
  {
    return false;// not necessary,TreeSet() use compareTo() to charge if 0 or not
  }*/
}
























