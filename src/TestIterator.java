import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Madhya Pradesh");
		list.add("Andhra Pradesh");
		list.add("Arunachal Pradesh");
		list.add("Himachal Pradesh");
		list.add("Uttar Pradesh");

		System.out.println("Array List Iterator");
		System.out.println("--X--X--X--X--X--X--X--");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("--X--X--X--X--X--X--X--");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Array List Iterator");
		System.out.println("--X--X--X--X--X--X--X--");

		for (String value : list) {
           System.out.println(value);
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");		
		System.out.println("Java 8 Method Reference ");
		list.forEach(System.out::println);
	}
}
