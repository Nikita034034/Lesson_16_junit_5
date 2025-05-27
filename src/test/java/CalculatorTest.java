import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Calculator c = new Calculator();
        assertEquals(1, c.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        Calculator c = new Calculator();
        assertEquals(6, c.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        Calculator c = new Calculator();
        assertEquals(2, c.divide(6, 3));
    }
} 
