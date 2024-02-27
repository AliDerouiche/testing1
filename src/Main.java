import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String formattedDate = dateTimeFormat(date);
        System.out.println(formattedDate);

    }

    public static String dateTimeFormat(OffsetDateTime date) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY);

        return date.format(formatter);
    }
}