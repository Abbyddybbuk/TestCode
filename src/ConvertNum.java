import java.util.Scanner;

public class ConvertNum {
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			in.close();
			if (n < -100 || n > 100) {
			  throw new Exception();	
			}
			 String s = Integer.toString(n);
			 System.out.println("Good job");
		} catch (Exception e) {
			System.out.println("Number is not in range");
		}
	}
}
