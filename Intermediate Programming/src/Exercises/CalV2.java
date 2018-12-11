
public class CalV2 {

	public static void main(String[] args) {
		
			int num1, num2;
			
		if(args.length != 3) {
			System.out.println("Usage: java CalculatorL7 operand1 operator operand2");
			System.exit(1);
		}
		try {
			num1 = Integer.parseInt(args[0]);
		}
		catch(NumberFormatException ex) {
			System.out.println("Wrong input :" + args[0]);
			return;
		}
		try {
			num2 = Integer.parseInt(args[2]);
		}
		catch(NumberFormatException ex) {
			System.out.println("Wrong input :" + args[2]);
			return;
		}
		
		int result = 0;
		switch(args[1].charAt(0)) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '.': result = num1 * num2; break;
		case '/': result = num1 / num2; break;
		
		}
		
System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
	}

}
	
