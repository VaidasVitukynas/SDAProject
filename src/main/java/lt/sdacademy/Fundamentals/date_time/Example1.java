package lt.sdacademy.Fundamentals.date_time;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Example1 {
    public static void main(String [] args) {

        Date now = new Date();

        long millis = System.currentTimeMillis();
        now = new Date(millis);
        System.out.println(now);

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        System.out.println(date);

        cal.setTime(now);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));

        String dateInText = "2019-02-18";
        LocalDate localDate = LocalDate.parse(dateInText);
        System.out.println(localDate);


    }
}
