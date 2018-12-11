import java.math.BigDecimal;
import java.math.RoundingMode;
public class BigDecimalTester {


	public BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode) {
		return null;
	}
		public static void main(String [] args) {
			
			BigDecimal a = new BigDecimal("6576576255");
			BigDecimal b = new BigDecimal("345.5");
			BigDecimal c = a.divide(b, 5, RoundingMode.UP);
			System.out.print(c);
		}
	}


