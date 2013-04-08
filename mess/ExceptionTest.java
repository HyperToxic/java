package guohao;
class DivTest
{
  public static void main(String[] args)
  {
    try{
	  int a = 	Integer.parseInt(args[0]);
	  int b = Integer.parseInt(args[1]);
	  int c = a/b;
	  System.out.println("the answer is "+ c);
	}
	
	catch (Exception e){
	  System.out.println("wrong input ");
	  System.out.println(e.getMessage());
	  e.printStackTrace();
	}
  }
}

class DivTest2
{
  public static void main(String[] args)
  {
    //try{
	  int a = 	Integer.parseInt(args[0]);
	  int b = Integer.parseInt(args[1]);
	  int c = a/b;
	  System.out.println("the answer is "+ c);
//	}
	
	/*catch (Exception e){
	  System.out.println("wrong input ");
	  System.out.println(e.getMessage());
	  e.printStackTrace();
	}*/
  }
}