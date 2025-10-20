package DateAPI;

import java.time.Month;
import java.time.LocalDate;

public class _LocalDate {
    public static void main(String[] args) {

        LocalDate now = java.time.LocalDate.now();
        System.out.println( "Today's date: " + now);

        LocalDate of = java.time.LocalDate.of(2000, 12, 11);
        System.out.println("Mustakim DOB:" + of);

        int dayOfMonth = of.getDayOfMonth();
        Month monthName = of.getMonth();
        int month = of.getMonthValue();
        int year = of.getYear();

        System.out.println("Mustakim DOB:" + dayOfMonth + "/" + monthName + "{"+month+"}" + "/" + year);

        LocalDate today = java.time.LocalDate.now();
        System.out.println("Aj ki date: " + today);

        LocalDate yesterday = today.minusDays(1);
        System.out.println("Kal jo guzra uski date:" + yesterday);

        today.minusMonths(100);
        System.out.println("100 mahine purani date:" + today);

        if(today.isAfter(yesterday)){
            System.out.println("haa bhai");
        }

    }
}
