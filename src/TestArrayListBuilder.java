import java.util.ArrayList;
import java.util.List;

public class TestArrayListBuilder {
	public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      list.add("Madhya Pradesh");
      list.add("Andhra Pradesh");
      list.add("Karnataka");
      list.add("Maharashtra");
      
      System.out.println(list);
      
      list.remove(1);
      System.out.println(list);
      
      String state = list.get(1);
      System.out.println("The second state in the list is: " + state );
      
      System.out.println(list.indexOf("Maharashtra"));
      
	}
}
