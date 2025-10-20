package DateAPI;

import java.time.LocalDate;
import java.time.Period;

public class _Period {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();                 // e.g. 2025-09-14
        LocalDate then = LocalDate.of(1990, 2, 2);      // 1990-02-02

        Period period = Period.between(then, now);      // earlier, later
        System.out.println(period);                     // e.g. P35Y7M12D

        // Friendly output:
        System.out.printf("%d years, %d months, %d days%n",
                period.getYears(), period.getMonths(), period.getDays());
        // e.g. 35 years, 7 months, 12 days

    }
}
