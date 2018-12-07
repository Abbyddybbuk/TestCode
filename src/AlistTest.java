import java.util.ArrayList;
import java.util.List;

public class AlistTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("Gwalior");
        list.add("Bhopal");
        list.add("Jabalpur");
        list.add("Indore");
        
        System.out.println(list);
        
        int pos = list.indexOf("Nagpur");
        System.out.println("The index is " + pos);
	}

}
