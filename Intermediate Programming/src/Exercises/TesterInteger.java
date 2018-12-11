
public class TesterInteger {

 public static void main(String [] args)
 {
  int m = 345;
  System.out.println("int m = " + m);
  
//converts int to Integer
  
  Integer x = new Integer(m);
  System.out.println("Integer x = " + x); 
  

  //converts Integer to String
  
  String s =  x.toString();
  System.out.println("String s = " + s);
  
//converts String to Integer
  
  x = Integer.valueOf(m);
  System.out.println("int m = " + m);

//converts Integer to String
  
  s = x.toString();
  System.out.println("String s = " + s);
  
//converts String to Integer
  
  m = new Integer(x);
  System.out.println("Integer x = " + x);
  
//converts Short to int
  
  x = Integer.valueOf(m);
  System.out.println("int m = " + m);
  
  System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
  System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
  
 }
}
