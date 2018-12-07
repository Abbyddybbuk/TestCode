import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DecipherTimestamp {
	public static void main(String[] args) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		String tStamp = "/Date(1527798147588)/";

		String tmp1 = tStamp.replace("/Date(", "");
		String tmp2 = tmp1.replace(")/", "");
		tmp2.trim();
//		System.out.println(tmp2);
         
		Date d = new Date(Long.valueOf(tmp2));
//		dateFormat.format(d);
//		System.out.println(dateFormat.format(d));
		Timestamp validFromTimestamp = new java.sql.Timestamp(Long.valueOf(tmp2));
//		try {
//			Date validFromDate = dateFormat.parse(d);
//			System.out.println(validFromDate);
//		} catch (Exception error) {
//            System.out.println("Error");
//		}		
		
		System.out.println(validFromTimestamp);
	}
}
