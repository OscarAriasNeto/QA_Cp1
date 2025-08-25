package example;

import org.example.Apdex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApdexTest {

    @Test
    public void calcApdex() {
        // arrange
        Apdex apdex = new Apdex(1000, 0, 1000);

        // act
        float score = apdex.calcularApdex();

        // assert
        Assertions.assertEquals(1, score, 0.001);
    }

    @Test
    public void calcApdexBom() {
        // arrange
        Apdex apdex = new Apdex(870, 40, 1000);

        // act
        float score = apdex.calcularApdex();

        // assert
        Assertions.assertEquals(0.89, score, 0.001);
    }

    @Test
    public void calcApdexrazoavel() {
        // arrange
        Apdex apdex = new Apdex(770, 60, 1000);

        // act
        float score = apdex.calcularApdex();

        // assert
        Assertions.assertEquals(0.80, score, 0.001);
    }

    @Test
    public void calcApdexRuim() {
        // arrange
        Apdex apdex = new Apdex(590, 60, 1000);

        // act
        float score = apdex.calcularApdex();

        // assert
        Assertions.assertEquals(0.59, score, 0.001);
    }
}