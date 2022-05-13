package n3exercici2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJTest2 {

    Character mortadelo = new Character("Mortadelo");
    Character filemon = new Character("Filemón");
    Character unknown = mortadelo;

    @Test
    public void areObjectsEqualsTest(){
        Assertions.assertThat(mortadelo).isEqualTo(unknown);
        Assertions.assertThat(unknown).isSameAs(mortadelo);

        Assertions.assertThat(unknown).isNotEqualTo(filemon);
        Assertions.assertThat(filemon).isNotSameAs(unknown);
    }
}
