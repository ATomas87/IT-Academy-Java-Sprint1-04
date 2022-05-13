package n3exercici5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class AssertJTest5 {
    @Test
    public void mapTest(){
        Map<String, String> pilotos = new HashMap<String, String>();

        pilotos.put("Fernando", "Alonso");
        pilotos.put("Lewis", "Hamilton");
        pilotos.put("Carlos", "Sainz");

        Assertions.assertThat(pilotos).containsKey("Lewis");
    }
}
