

/**Class: Customer
* @author Ta'im Anderson
* @version 1.0
* Course : ITEC 2150 Spring 2018
* 
*
*
* This class describes a Customer
*
* Purpose: This class describes a Customer
*/
public class Customer 
{
	import java.util.*;

	public class NameAndMoney implements Comparable<NameAndMoney> {
		
		String name;
		double money;
		
		
		NameAndMoney(String name, double money) {
			this.name = name;
			this.money = money;
		}
		public int compareTo(NameAndMoney other) {
	       return name.compareTo(other.name);
		}
		public String toString() {
			return String.format("%10s %5f", name, money);
		}
		
		public static void main(String[] args) {
			ArrayList<NameAndMoney> al = new ArrayList<NameAndMoney>();
			al.add(new NameAndMoney("kkk", 123.4));
			al.add(new NameAndMoney("zzzzz", 456.7));
			al.add(new NameAndMoney("a", 9.0));
			NameAndMoney[] array = new NameAndMoney[al.size()];
			Arrays.sort(al.toArray(array));
			for(NameAndMoney x : array)
				System.out.println(x);
		}
	}

 }
    
 
