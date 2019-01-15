import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormat {

	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
        String today = formatter.format(date);
        System.out.println("Today : " + today);
	}

}
