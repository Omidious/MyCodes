import CodeFacts.CountToAThousand;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountToAThousandTest {

    @Test
    public void testCountWithFibbonaci() {
        CountToAThousand counter = new CountToAThousand();

        // Test for n = 100 (a value smaller than 1000)
        counter.countWithFibbonaci(100);
        assertEquals(1, counter.getFirst()); // The last Fibonacci number before reaching 1000
        assertEquals(2, counter.getSecond()); // The Fibonacci number after reaching 1000

        // Test for n = 1200 (a value greater than 1000)
        counter.countWithFibbonaci(1200);
        assertEquals(1, counter.getFirst()); // Should not update since n is already greater than 1000
        assertEquals(2, counter.getSecond()); // Should not update since n is already greater than 1000
    }

    @Test
    public void testGettersAndSetters() {
        CountToAThousand counter = new CountToAThousand();

        // Test getters
        assertEquals(0, counter.getFirst());
        assertEquals(1, counter.getSecond());

        // Test setters
        counter.setFirst(5);
        counter.setSecond(8);

        assertEquals(5, counter.getFirst());
        assertEquals(8, counter.getSecond());
    }
}