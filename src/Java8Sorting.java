import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Java8Sorting {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(0);
        numberList.add(15);
        numberList.add(5);
        numberList.add(20);
        System.out.println("Before Sorting: " + numberList);
        
        Collections.sort(numberList, (int1,int2) -> (int1 > int2)? -1: (int1 < int2)? 1: 0);
        System.out.println("After Sorting: " + numberList);
        
        TreeSet<Integer> tSet = new TreeSet<>((int1,int2) -> (int1 > int2)? -1: (int1 < int2)? 1: 0);
        tSet.add(10);
        tSet.add(0);
        tSet.add(15);
        tSet.add(25);
        tSet.add(5);
        tSet.add(20);
        System.out.println("TreeSet Sorting" + tSet);
        
	}

}
