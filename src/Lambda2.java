
public class Lambda2 {

	public static void main(String[] args) {
       
        MathOps addition = (int a, int b) -> { return a + b; };
        
        System.out.println("Total is: " + addition.Operation(10, 20));
	}
	
	@FunctionalInterface
	interface MathOps {
		public int Operation(int a, int b);
	}

}
