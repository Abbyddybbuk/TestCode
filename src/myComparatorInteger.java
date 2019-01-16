import java.util.Comparator;

public class myComparatorInteger implements Comparator<Integer> {
	public int compare(Integer int1, Integer int2) {

//		if (int1 > int2) {
//			return -1;
//		} else if (int1 < int2) {
//			return 1;
//		} else {
//			return 0;
//		}
		
		return (int1 > int2)? -1: (int1 < int2)? 1: 0;
	}
}
