import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringToTimestamp {
	public static void main(String[] args) { 
		String yourString = "27-FEB-19 00.00.00";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy hh.mm.ss");
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		SimpleDateFormat edmDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = new Date();
		try {
			parsedDate = dateFormat.parse(yourString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Error while parsing date");
		}
		

		String formattedDate = edmDateFormat.format(parsedDate) + 'T' + timeFormat.format(parsedDate);
//		formattedDate = formattedDate.substring(0, 10);
		System.out.println(formattedDate);
	}
}
