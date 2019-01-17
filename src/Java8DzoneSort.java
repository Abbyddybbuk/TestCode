import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Java8DzoneSort {

	public static void main(String[] args) {
		List<Movie> movies = Arrays.asList(
		        new Movie("Lord of the rings", 8.8, true),
		        new Movie("Back to the future", 8.5, false),
		        new Movie("Carlito's way", 7.9, true),
		        new Movie("Pulp fiction", 8.9, false));
		movies.sort(Comparator.comparing(Movie::getStarred)
		                      .reversed()
		                      .thenComparing(Comparator.comparing(Movie::getRating)
		                      .reversed())
		);
		movies.forEach(System.out::println);

	}

}
