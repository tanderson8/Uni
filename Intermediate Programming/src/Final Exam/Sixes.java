public class Sixes
{
 public static void main(String[] args)
 {
  System.out.println("66776 has " + getSixes(66776) + " sixes.");
  System.out.println("123456 has " + getSixes(123456) + " sixes.");
  System.out.println("111223 has " + getSixes(111223) + " sixes.");
  System.out.println("666666 has " + getSixes(666666) + " sixes.");
  System.out.println("868686838 has " + getSixes(868686838) + " sixes.");
  System.out.println("6241 has " + getSixes(6241) + " sixes.");
  System.out.println("776 has " + getSixes(776) + " sixes.");
 }
 
 public static int getSixes(int num)
 {
 int count = 0;
String s = String.valueOf(num);
for(int i = 0; i < s.length(); i++)
{
 char ch = s.charAt(i);
 if(ch == '6')
    count ++;
}
return count;
    }
}
 
 

