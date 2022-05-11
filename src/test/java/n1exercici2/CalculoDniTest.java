package n1exercici2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculoDniTest {

    @Test
    public void testCalculoDni() {
        CalculoDni calculoDni1 = new CalculoDni(35678945);
        CalculoDni calculoDni2 = new CalculoDni(76598742);
        CalculoDni calculoDni3 = new CalculoDni(1);
        CalculoDni calculoDni4 = new CalculoDni(54671233);
        CalculoDni calculoDni5 = new CalculoDni(46832145);
        CalculoDni calculoDni6 = new CalculoDni(88798431);
        CalculoDni calculoDni7 = new CalculoDni(96587462);
        CalculoDni calculoDni8 = new CalculoDni(23547896);
        CalculoDni calculoDni9 = new CalculoDni(35974584);
        CalculoDni calculoDni10 = new CalculoDni(28795416);

        Assertions.assertEquals(calculoDni1.calculateLetter(), 'B');
        Assertions.assertEquals(calculoDni2.calculateLetter(), 'W');
        Assertions.assertEquals(calculoDni3.calculateLetter(), 'R');
        Assertions.assertEquals(calculoDni4.calculateLetter(), 'A');
        Assertions.assertEquals(calculoDni5.calculateLetter(), 'M');
        Assertions.assertEquals(calculoDni6.calculateLetter(), 'P');
        Assertions.assertEquals(calculoDni7.calculateLetter(), 'C');
        Assertions.assertEquals(calculoDni8.calculateLetter(), 'J');
        Assertions.assertEquals(calculoDni9.calculateLetter(), 'P');
        Assertions.assertEquals(calculoDni10.calculateLetter(), 'Z');
    }
}
