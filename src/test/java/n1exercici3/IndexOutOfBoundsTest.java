package n1exercici3;

import org.junit.Assert;
import org.junit.Test;

public class IndexOutOfBoundsTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testIndexOutOfBounds() {
        IndexOutOfBounds indexOutOfBounds = new IndexOutOfBounds();

        indexOutOfBounds.getNinthElement();
    }
}
