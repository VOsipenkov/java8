package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToLocalDate {
    public static void main(String[] args) {
        String date = "2019-12-19";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime localDateTime = LocalDateTime.parse(date, dateTimeFormatter);

        System.out.println(localDateTime.toLocalDate());
    }
}
