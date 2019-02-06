public class DemoClass implements DemoInterf {
	@Override
	public int calculateValue(int i) {
		return i + DemoInterf.test;
	}

	public static void main(String[] args) {
      DemoClass dClass = new DemoClass();
      System.out.println("Calculated Value is: " + dClass.calculateValue(20));
      
      System.out.println(" ");
      System.out.println("Message From Abhijeet: " + DemoInterf.messageShow(" Abhijeet"));
	}
}
