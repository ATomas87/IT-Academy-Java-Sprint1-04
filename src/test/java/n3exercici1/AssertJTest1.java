package n3exercici1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJTest1 {

    @Test
    public void integerTest(){
        Integer one = 4;
        Integer two = 4;
        Integer three = 7;

        Assertions.assertThat(one).isEqualTo(two);
        Assertions.assertThat(one).isNotEqualTo(three);
    }
}
