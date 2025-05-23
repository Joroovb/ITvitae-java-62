package dates;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {
//        LocalTime time = LocalTime.parse("12");
        LocalTime time2 = LocalTime.of(12,00);
        LocalTime now = LocalTime.now();
        System.out.println(now);


        LocalTime late = LocalTime.of(23, 35);
        late = late.plusHours(1);
        System.out.println(late);
    }
}
