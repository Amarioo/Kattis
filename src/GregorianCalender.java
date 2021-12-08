import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class GregorianCalender {
    static int method(int year, int month, int day)
    {
        int[] darr = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (year > 0 && (month > 0 && month <= 12)) {


            if ((year % 4 == 0 || year % 400 == 0) &&
                    month == 2 && (day > 0 && day <= 29)) {

                Calendar calendar = new GregorianCalendar(year, month - 1, day);
                return calendar.get(Calendar.DAY_OF_WEEK);
            }
            else {

                if (day > 0 && day <= darr[month - 1]) {

                    Calendar calendar = new GregorianCalendar(year, month - 1, day);
                    return calendar.get(Calendar.DAY_OF_WEEK);
                }
                else
                    return 0;
            }
        }
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int mo=scanner.nextInt();
        int da=scanner.nextInt();
        String[] dayofweek = { "Invalid", "Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday" };
        int y = 2009,  m = da, d = mo;
        System.out.println(dayofweek[method(y, m, d)]);
    }

}