import java.util.HashMap;
import java.util.Map;

public class TestHashMapBuilder {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("MP07", "Gwalior");
		map.put("MP04", "Bhopal");
		map.put("KA51", "Bangalore");
		map.put("RJ14", "Jaipur");

		System.out.println(map);

		String num = map.get("KA51");
		System.out.println("This number belongs to: " + num);

		map.remove("KA51");
		System.out.println(map);
	}

}
