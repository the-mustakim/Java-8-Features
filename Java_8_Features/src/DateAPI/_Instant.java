package DateAPI;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class _Instant {
    public static void main(String[] args) {
        // 1) Millis -> Instant
        long epochMillis = System.currentTimeMillis();
        Instant fromMillis = Instant.ofEpochMilli(epochMillis);
        System.out.println("epochMillis: " + epochMillis);
        System.out.println("fromMillis (Instant): " + fromMillis);

        // 2) Instant -> millis
        Instant now = Instant.now();
        long asMillis = now.toEpochMilli();
        System.out.println("now (Instant): " + now);
        System.out.println("now as millis: " + asMillis);

        // 3) Instant -> ZonedDateTime in system zone (useful for display)
        ZonedDateTime zdtSystem = now.atZone(ZoneId.systemDefault());
        System.out.println("ZonedDateTime (system): " + zdtSystem);

        // 4) Instant -> formatted string
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")
                .withZone(ZoneId.systemDefault());
        System.out.println("Formatted local time: " + fmt.format(now));

        // 5) Parse an ISO Instant string
        Instant parsed = Instant.parse("1998-04-25T10:15:30Z");
        System.out.println("parsed instant: " + parsed);
    }
}
