public class DemoClass implements DemoInterf {

	@Override
	public int calculateValue(int i) {
		// TODO Auto-generated method stub
		return i + DemoInterf.test;
	}

	public static void main(String[] args) {
      DemoClass dClass = new DemoClass();
      System.out.println("Calculated Value is: " + dClass.calculateValue(20));
	}
}
