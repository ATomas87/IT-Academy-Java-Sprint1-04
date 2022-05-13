package n3exercici7;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class AssertJTest7 {
    @Test
    public void optionalEmptyTest(){
        Optional<String> optionalS = Optional.empty();

        Assertions.assertThat(optionalS).isEmpty();
    }
}
