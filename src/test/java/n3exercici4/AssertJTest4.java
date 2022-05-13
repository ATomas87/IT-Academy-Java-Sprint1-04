package n3exercici4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AssertJTest4 {

    @Test
    public void arrayListTest() {
        List<Character> characters = new ArrayList<>();

        Character ironMan = new Character("Iron Man");
        Character spiderMan = new Character("Spider Man");
        Character superMan = new Character("Super Man");
        Character antMan = new Character("Ant Man");
        characters.add(ironMan);
        characters.add(spiderMan);
        characters.add(superMan);
        characters.add(antMan);

        Assertions.assertThat(characters).containsExactly(ironMan, spiderMan, superMan, antMan);
        Assertions.assertThat(characters).containsExactlyInAnyOrder(spiderMan, antMan, superMan, ironMan);
        Assertions.assertThat(characters).containsOnlyOnce(ironMan);

        characters.remove(antMan);

        Assertions.assertThat(characters).doesNotContain(antMan);

    }
}
