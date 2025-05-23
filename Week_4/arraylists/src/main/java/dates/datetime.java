package dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class datetime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nextWeek = now.plusWeeks(1);

        Duration diff = Duration.between(now, nextWeek);
        System.out.println(diff.toDays());

//        System.out.println(now);
//
//        System.out.println(now.getDayOfYear());
//        System.out.println(now.getHour());


//        now = now.plusHours(13);

//        System.out.println(now);



    }
}
