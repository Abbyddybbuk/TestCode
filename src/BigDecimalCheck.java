import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalCheck {

	public static void main(String[] args) {
		Double value1 = new Double(12.5641111);
		BigDecimal tax = new BigDecimal(12.4554);
		tax = tax.setScale(2, RoundingMode.HALF_UP);
		System.out.println(tax);

		double dvalue1 = value1.doubleValue();
		BigDecimal dvalueTest = new BigDecimal(dvalue1);
		System.out.println(dvalueTest);

		System.out.println(dvalueTest.setScale(2, BigDecimal.ROUND_HALF_UP));		

	}

}
