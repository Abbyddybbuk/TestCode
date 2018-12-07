import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SubString123 {

	public static String getSmallestAndLargest(String s, int k) {

		String smallest = "";
		String largest = "";
        
		List<String> list = new ArrayList<>();
        
		int lp = s.length();
		int idx = s.length();
		
		String myStr = s;
		String myTmp;
		
        int cnt = k - 1;
    	
        for (int i=0; i <=lp; i++ ) {
    	   cnt = cnt + 1;
    	   if (cnt > myStr.length()){
    		 break;  
    	   }
    	    	   	
    	   myTmp = myStr.substring(i, cnt);
    	   list.add(myTmp);   	   
    	   
    	}
        Collections.sort(list);
        smallest = list.get(0);
        largest  = list.get(list.size() - 1);
        
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}

}
