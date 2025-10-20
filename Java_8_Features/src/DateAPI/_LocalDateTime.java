package DateAPI;

import java.time.LocalDateTime;


public class _LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDateTime myDate = LocalDateTime.parse("2023-01-15T10:14:05");
        System.out.println("MyDateTime: " + myDate);

    }
}
