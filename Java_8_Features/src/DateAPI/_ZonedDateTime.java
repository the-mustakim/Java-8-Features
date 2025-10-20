package DateAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class _ZonedDateTime {
    public static void main(String[] args) {
        // 1) Current zoned datetime in system default zone
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Default zone: " + now);

        // 2) Current zoned datetime for Europe/Dublin
        ZonedDateTime dublin = ZonedDateTime.now(ZoneId.of("Europe/Dublin"));
        System.out.println("Dublin time:  " + dublin);

        // 3) Convert an instant/time from one zone to another (keeps same instant)
        ZonedDateTime qatar = ZonedDateTime.now(ZoneId.of("Asia/Qatar"));
        ZonedDateTime qatarToDublin = qatar.withZoneSameInstant(ZoneId.of("Europe/Dublin"));
        System.out.println("Qatar now:         " + qatar);
        System.out.println("Same instant in Dublin: " + qatarToDublin);

        // 4) Create a ZonedDateTime from a LocalDateTime (interpret as local wall time)
        LocalDateTime local = LocalDateTime.of(2025, 10, 26, 1, 30); // ambiguous around DST
        ZonedDateTime zdtDublin = ZonedDateTime.of(local, ZoneId.of("Europe/Dublin"));
        System.out.println("Local interpreted in Dublin: " + zdtDublin);

        // 5) Format for display
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss O z");
        System.out.println("Formatted Dublin: " + fmt.format(zdtDublin));

    }
}
