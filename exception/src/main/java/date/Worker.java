package date;

import java.sql.Timestamp;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Worker {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime.toString());

        LocalDateTime localDateTime = zonedDateTime.withZoneSameInstant(ZoneId.of("GMT")).toLocalDateTime();
        System.out.println(localDateTime);

        Timestamp timestamp = Timestamp.valueOf(localDateTime);
        System.out.println(timestamp);

        System.out.println(timestamp.toLocalDateTime());

        zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("GMT+3"));
        System.out.println(zonedDateTime);
        
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSXXX");
        System.out.println(zonedDateTime.format(dateTimeFormatter));
    }
}
