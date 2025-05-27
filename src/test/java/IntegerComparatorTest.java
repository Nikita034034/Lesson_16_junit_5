import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerComparatorTest {
    @Test
    public void testCompareLess() {
        IntegerComparator ic = new IntegerComparator();
        assertEquals(-1, ic.compare(2, 3));
    }

    @Test
    public void testCompareGreater() {
        IntegerComparator ic = new IntegerComparator();
        assertEquals(1, ic.compare(5, 2));
    }

    @Test
    public void testCompareEqual() {
        IntegerComparator ic = new IntegerComparator();
        assertEquals(0, ic.compare(4, 4));
    }
} 
