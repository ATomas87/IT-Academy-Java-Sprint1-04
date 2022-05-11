package n1exercici1;

import org.junit.Assert;
import org.junit.Test;

public class MonthsTest {

    @Test
    public void testMonths() {
        Months months = new Months();

        Assert.assertNotNull(months);
        Assert.assertEquals(months.getMonths().size(), 12);
        Assert.assertEquals(months.getMonths().get(7), "agosto");
    }
}
