package DateAPI;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class _Duration {
    public static void main(String[] args) throws Exception{

        //Example 1:

        Instant start = Instant.now();

        // simulate work
        Thread.sleep(37); // 37 ms

        Instant end = Instant.now();
        Duration d = Duration.between(start, end);

        System.out.println(d);                  // e.g. PT0.037S
        System.out.println(d.toMillis() + " ms"); // e.g. 37 ms
        System.out.println(d.toNanos() + " ns");  // e.g. 37000000 ns

        System.out.println("--------------------------------------------------------------------------------");

        //Example 2:

        long start2 = System.nanoTime();

        // simulate work
        for (int i = 0; i < 1_000_000; i++) { Math.sqrt(i); }

        long end2 = System.nanoTime();
        long elapsedNanos = end2 - start2;

        System.out.println(elapsedNanos + " ns");
        System.out.printf("%.3f ms%n", elapsedNanos / 1_000_000.0);

    }
}
