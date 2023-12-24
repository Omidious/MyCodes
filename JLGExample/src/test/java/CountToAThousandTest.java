
import JLGExample.CountToAThousand;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CountToAThousandTest {

    @Test
    public void testCountWithFibonacci() {
        CountToAThousand counter = new CountToAThousand();
        counter.countWithFibbonaci(1);

        // Validate the changes made by the method
        assertEquals(1, counter.getFirst());
        assertEquals(2, counter.getSecond());

        // Validate the changes in the string field
        assertEquals("test", counter.abc);

        // Validate the changes in the list
        assertTrue(counter.stringListTest.contains("abc"));

        // Validate the changes in the array
        assertEquals(2, counter.intArrayTest[1]);
    }

    @Test
    public void testCountWithFibonacciOutOfRange() {
        CountToAThousand counter = new CountToAThousand();

        // Test for a number greater than 1000
        counter.countWithFibbonaci(1500);

        // Validate that the method prints a message for numbers greater than 1000
        // (Note: This assumes the method prints to System.out, adjust accordingly)
    }
}
