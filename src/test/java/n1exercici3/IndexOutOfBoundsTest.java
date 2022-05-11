package n1exercici3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndexOutOfBoundsTest {

    @Test
    public void testIndexOutOfBounds() {
        IndexOutOfBounds indexOutOfBounds = new IndexOutOfBounds();

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, indexOutOfBounds::getNinthElement);
    }
}
