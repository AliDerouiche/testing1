import org.junit.Test;

import java.time.OffsetDateTime;


import static org.junit.Assert.*;

public class MainTest {
    Main main = new Main();

    @Test
    public void dateTimeFormat_WrongDate_Test() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        assertNotEquals("01 marzo 2023", data);
    }

    @Test
    public void dateTimeFormat_RightDate_Test() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formattedData = Main.dateTimeFormat(data);
        assertEquals("01 marzo 2023", formattedData);
    }

}
