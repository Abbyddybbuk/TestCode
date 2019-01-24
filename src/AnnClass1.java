
public class AnnClass1 {

	public static void main(String[] args) {
        //Anonymous Inner Class
		MathOps addition = new MathOps() {
			public int operation(int a, int b) {
				return a + b;
			}
		};
		
		System.out.println("The Total is: " + addition.operation(10, 19));
		
		//Lambda Expression
		MathOps subtraction = (int a, int b) -> { return a - b; };		
		System.out.println("The difference is: " + subtraction.operation(19, 10));

	}

	@FunctionalInterface
	interface MathOps {
		public int operation(int a, int b);
	}

}
