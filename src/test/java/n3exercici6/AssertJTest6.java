package n3exercici6;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJTest6 {
    @Test
    public void indexOutOfBoundsTest(){
        IndexOutOfBounds indexOutOfBounds = new IndexOutOfBounds();

        Assertions.assertThatThrownBy(()-> indexOutOfBounds.getNinthElement()).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
