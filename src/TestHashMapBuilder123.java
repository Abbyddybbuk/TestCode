import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMapBuilder123 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("MP07", "Gwalior");
		map.put("MP04", "Bhopal");
		map.put("KA51", "Bangalore");
		map.put("RJ14", "Jaipur");
		
		System.out.println("HashMap Iterator");
		Set<String> keys = map.keySet();
        
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
		  String key = itr.next();
		  System.out.println("The number " + key + " belongs to " + map.get(key));
		}
	}

}
