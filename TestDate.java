import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.*;

class TestDate {

    public static void main(String[] args) {

        int day,month,year;
        if (true) { // Normal usage of the software
            Scanner sc = new Scanner(System.in);
            System.out.println("Please fill a day (1-31) :");
            day = sc.nextInt();
            System.out.println("Please fill a month (1-12) :");
            month = sc.nextInt();
            System.out.println("Please fill a year :");
            year = sc.nextInt();
            sc.close();
        }
        else {  // Used to test  with the actual date
            day=20; month=7; year=2019;
        }
        // TODO : your code after this line
        String strDate=null;
        Calendar calThisDay= new GregorianCalendar(year,month-1,day);   // The month start from 0 !
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        try {
            strDate= sdf.format(calThisDay.getTime());
        }
        catch ( Exception e ) {
            System.out.println(e.getMessage());
        }
        // Note: DAY_OF_WEEK return 1 for sunday to 7 for saturday the 0 index isn't used
        String[] tbDays={"no day","sunday","monday","tuesday","wednesday","friday","thursday","saturday"};

        int dayOfWeek= calThisDay.get(Calendar.DAY_OF_WEEK);
        System.out.printf("The date is %s.\n",strDate);
        System.out.printf("The day of week is %d (%s)\n",dayOfWeek, tbDays[dayOfWeek]);
    }
}