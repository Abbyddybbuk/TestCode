import java.sql.Timestamp;
import java.util.Calendar;

public class TstampClass {

	public static void main(String[] args) {
		long l1 = 1561401000000L;
		Timestamp tStamp = new Timestamp(l1);
		java.util.Date cDate = new java.util.Date();
		Calendar c = Calendar.getInstance();
		c.setTime(cDate);
		c.add(Calendar.DATE, 69);
		cDate=c.getTime();
		System.out.println("Leave Date is: " + cDate);
		System.out.println("Leave Timestamp is: " + cDate.getTime());
		System.out.println(tStamp);
		System.out.println(System.currentTimeMillis());

	}

}
