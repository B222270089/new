package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    void add_twoPositiveNumbers() {
        Calculator c = new Calculator();
        assertEquals(7, c.add(3, 4));
    }

    @Test
    void add_positiveAndNegative() {
        Calculator c = new Calculator();
        assertEquals(-1, c.add(3, -4));
    }
}
