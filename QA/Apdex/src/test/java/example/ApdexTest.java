// Oscar Arias Neto Rm556936
package example;

import org.example.Apdex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ApdexTest {

    @Test
    public void calcApdex() {
        // arrange
        Apdex apdex = new Apdex(556936, 0, 556936); // Apdex = (556936 + 0) / (556936 + 0 + 556936) = 1.0

        // act
        float score = apdex.calcularApdex();

        // assert
        Assertions.assertEquals(1.0f, score, 0.000001);
    }

    @Test
    public void calcApdexBom() {
        // arrange
        Apdex apdex = new Apdex(495673, 77458, 556936); // Apdex ≈ 0.89

        // act
        float score = apdex.calcularApdex();

        // assert
        Assertions.assertEquals(0.89f, score, 0.000001);
    }

    @Test
    public void calcApdexrazoavel() {
        // arrange
        Apdex apdex = new Apdex(446964, 77880, 556936); // Apdex ≈ 0.80

        // act
        float score = apdex.calcularApdex();

        // assert
        Assertions.assertEquals(0.80f, score, 0.000001);
    }

    @Test
    public void calcApdexRuim() {
        // arrange
        Apdex apdex = new Apdex(328591, 52367, 556936); // Apdex ≈ 0.59

        // act
        float score = apdex.calcularApdex();

        // assert
        Assertions.assertEquals(0.59f, score, 0.000001);
    }
}