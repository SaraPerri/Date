import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String full = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String medium = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String shortDate = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        System.out.println(full);
        System.out.println(medium);
        System.out.println(shortDate);
    }
}