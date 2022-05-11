package n1exercici1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthsTest {

    @Test
    public void testMonths() {
        Months months = new Months();

        Assertions.assertNotNull(months);
        Assertions.assertEquals(months.getMonths().size(), 12);
        Assertions.assertEquals(months.getMonths().get(7), "agosto");
    }
}
