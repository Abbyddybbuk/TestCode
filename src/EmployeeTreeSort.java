import java.util.TreeMap;

public class EmployeeTreeSort {
  public static void main(String[] args) {
	  TreeMap<Integer, String> tEmployee = new TreeMap<>();
	  tEmployee.put(100, "Abhijeet");
	  tEmployee.put(300, "Ashok");
	  tEmployee.put(900, "Mahesh");
	  tEmployee.put(800, "Jyoti");
	  tEmployee.put(200, "Shweta");
	  tEmployee.put(500, "Ramu");
	  tEmployee.put(600, "Shamu");
	  tEmployee.put(700, "Urvashi");
	  tEmployee.put(400, "Jay");
	  tEmployee.put(1000, "Vijay");	
	  
	  System.out.println(tEmployee);
	  System.out.println(" ");
	  System.out.println("After Sorting");
	  
	  TreeMap<Integer, String> temp = new TreeMap<>((t1, t2) -> (t1>t2)? -1: (t1<t2)? 1: 0);
	  temp.put(100, "Abhijeet");
	  temp.put(300, "Ashok");
	  temp.put(900, "Mahesh");
	  temp.put(800, "Jyoti");
	  temp.put(200, "Shweta");
	  temp.put(500, "Ramu");
	  temp.put(600, "Shamu");
	  temp.put(700, "Urvashi");
	  temp.put(400, "Jay");
	  temp.put(1000, "Vijay");		  
	  System.out.println(temp);
	  
  }
}
