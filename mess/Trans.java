package guohao;
import java.util.*;
import java.io.*;
class TransLater
{
  public static void main(String[] args){
   HashMap<String,String> m = new HashMap<>();
   m.put("hello","a way to hi somebody");
   m.put("guohao","its my name");
  // System.out.println(m.get(args.toString()));
  // System.out.println(m.get("guohao"));
   
   Scanner sc = new Scanner(System.in);
   String out = null;
   String cho = null;
   while(sc.hasNextLine())
   {
     if(((out=m.get(sc.nextLine()))) != null)
	 {
       //System.out.println(m.get(sc.nextLine()));
	   System.out.println((String)out);
	 }
	 /*else if((cho = sc.nextLine()) == "exit")
	 {
	    System.exit(-1);
	 /*  if(sc.nextLine() == "exit")
	   {
	     System.exit(-1);
	   }
	   
	 }
	 */
	 
	 
	 else
	 {
	   System.out.println("can find anything about yr input,type 'ctrl+c' to quit");
	 }
   }
   }
}