package DateAPI;

import java.time.LocalTime;

public class _LocalTime {
    public static void main(String[] args) {

        LocalTime now = LocalTime.now();

        LocalTime customTime1 = LocalTime.of(14,30,24);

        LocalTime customTime2 = LocalTime.of(14,32);

        String timeParse = "15:29:10";
        LocalTime parsedTime = LocalTime.parse(timeParse);
        System.out.println(parsedTime);
        LocalTime beforeTime = now.minusHours(1);
        System.out.println("Ek ghante pahle kya time tha?: " + beforeTime);

        if(now.isAfter(beforeTime)){
            System.out.println("Ha bhai badmai ata hai");
        }
    }

}
