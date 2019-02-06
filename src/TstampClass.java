import java.sql.Timestamp;

public class TstampClass {

	public static void main(String[] args) {
		long l1 = 1549443692151L;
		Timestamp tStamp = new Timestamp(l1);
		java.util.Date cDate = new java.util.Date();
		System.out.println(tStamp);
		System.out.println(System.currentTimeMillis());

	}

}
