package DateAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _DateTimeFormatter {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        // Use yyyy for year and MM for month
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = localDate.format(myFormatter);
        System.out.println(format); // e.g. 14/09/2025 (depends on current date)

        String date = "25/04/1998";
        // Use uppercase M for month
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate2 = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(localDate2); // prints 1998-04-25 (ISO format)
    }
}
