package n3exercici3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJTest3 {
    int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 6, 6, 6};
    int[] array2 = new int[]{1, 2, 3, 4, 5, 6, 6, 6, 6};

    @Test
    public void areArraysEqualsTest() {
        Assertions.assertThat(array1).containsExactly(array2);
        Assertions.assertThat(array1).isEqualTo(array2);

        //Comprobamos que no hacen referencia a la misma dirección de memoria:
        Assertions.assertThat(array1).isNotSameAs(array2);
    }
}
