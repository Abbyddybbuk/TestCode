import java.util.ArrayList;
import java.util.List;

public class Lamda1 {

	public static void main(String[] args) {
		MathOps addition = (int a, int b) -> {return a + b; };
		MathOps subtraction = (a, b) -> a - b;
		MathOps multiplication = (a, b) -> a * b;

		System.out.println("The addition of two numbers is: " + addition.operation(10, 30));
		System.out.println("The subtraction of two numbers is: " + subtraction.operation(30, 10));
		System.out.println("The multiplication of two numbers is: " + multiplication.operation(10, 30));

		List<String> nameList = new ArrayList();
		nameList.add("Abhijeet");
		nameList.add("Ankur");
		nameList.add("Kanu");
		
		StringOps calLength = list -> list.size();
		System.out.println("The size of the list is: " + calLength.StringLength(nameList));
	}
	
	@FunctionalInterface
	interface MathOps {
		public int operation(int a, int b);
	}

	@FunctionalInterface
	interface StringOps {
		public int StringLength(List<String> dataList);
	}
}
