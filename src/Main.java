import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime string = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String time = string.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN));
        System.out.println(time);
    }
}