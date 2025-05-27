import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    @Test
    public void testFactorialOfZero() {
        Factorial f = new Factorial();
        assertEquals(1, f.calculate(0));
    }

    @Test
    public void testFactorialOfOne() {
        Factorial f = new Factorial();
        assertEquals(1, f.calculate(1));
    }

    @Test
    public void testFactorialOfFive() {
        Factorial f = new Factorial();
        assertEquals(120, f.calculate(5));
    }
} 
