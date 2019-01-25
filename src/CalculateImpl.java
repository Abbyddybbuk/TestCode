public class CalculateImpl implements DemoMathOps {
	@Override
	public int calculate(int a, int b) {
       return a + b;
	}

	public static void main(String[] args) {
		CalculateImpl calc = new CalculateImpl();
        System.out.println("Total is: " + calc.calculate(10, 29));
	}
}
