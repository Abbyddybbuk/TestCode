import java.util.*;
public class Java7Sort {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(0);
        numberList.add(15);
        numberList.add(5);
        numberList.add(20);
        
        System.out.println("Before Sorting: " + numberList);
        
        Collections.sort(numberList, new myComparatorInteger());
        System.out.println("After Sorting: " + numberList);
        
        
        
	}

}
