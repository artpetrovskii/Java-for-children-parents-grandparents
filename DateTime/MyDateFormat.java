import java.util.Date;
import java.text.SimpleDateFormat;

public class MyDateFormat {
   public static void main(String[] args) {
	   Date today = new Date();
	   System.out.println("Date: " + today);
	   SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yy");
	   String formattedDate = sdf.format(today);
	   System.out.println("Date(mm-dd-yy)" + formattedDate);
	   sdf = new SimpleDateFormat("mm-dd-yy");
	   formattedDate = sdf.format(today);
	   System.out.println("mm-dd-yy");
	   sdf = new SimpleDateFormat("EEE, MMM d, ''yy");
	   formattedDate = sdf.format(today);
	   System.out.println("Date (week day, month day. 'year) " + formattedDate);
	   sdf = new SimpleDateFormat("hh:mm:ss a");
	   formattedDate = sdf.format(today);
	   System.out.println("Time (hh:mm:ss) " + formattedDate);
   }
}
