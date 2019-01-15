import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalCheck {

	public static void main(String[] args) {
		BigDecimal tax = new BigDecimal(12.4554);
        
		tax = tax.setScale(2, RoundingMode.HALF_UP);
		
		System.out.println(tax);
		
	}

}
