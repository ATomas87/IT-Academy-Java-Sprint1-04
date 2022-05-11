package n1exercici2;

import org.junit.Assert;
import org.junit.Test;

public class CalculoDniTest {

    @Test
    public void testCalculoDni() {
        CalculoDni calculoDni1 = new CalculoDni(35678945);
        CalculoDni calculoDni2 = new CalculoDni(76598742);
        CalculoDni calculoDni3 = new CalculoDni(00000001);
        CalculoDni calculoDni4 = new CalculoDni(54671233);
        CalculoDni calculoDni5 = new CalculoDni(46832145);
        CalculoDni calculoDni6 = new CalculoDni(88798431);
        CalculoDni calculoDni7 = new CalculoDni(96587462);
        CalculoDni calculoDni8 = new CalculoDni(23547896);
        CalculoDni calculoDni9 = new CalculoDni(35974584);
        CalculoDni calculoDni10 = new CalculoDni(28795416);

        Assert.assertEquals(calculoDni1.calculateLetter(), 'B');
        Assert.assertEquals(calculoDni2.calculateLetter(), 'W');
        Assert.assertEquals(calculoDni3.calculateLetter(), 'R');
        Assert.assertEquals(calculoDni4.calculateLetter(), 'A');
        Assert.assertEquals(calculoDni5.calculateLetter(), 'M');
        Assert.assertEquals(calculoDni6.calculateLetter(), 'P');
        Assert.assertEquals(calculoDni7.calculateLetter(), 'C');
        Assert.assertEquals(calculoDni8.calculateLetter(), 'J');
        Assert.assertEquals(calculoDni9.calculateLetter(), 'P');
        Assert.assertEquals(calculoDni10.calculateLetter(), 'Z');
    }
}
