import JLGExample.UnterOrdnerTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;

public class UnterOrdnerTestTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    public void testPrintTest() {
        // Create an instance of UnterOrdnerTest
        UnterOrdnerTest unterOrdnerTest = new UnterOrdnerTest();

        // Call the printTest method
        unterOrdnerTest.printTest();

        // Verify the output
        String expectedOutput = "UnterOrdnerTest!\n";
        assertEquals(expectedOutput, outputStreamCaptor.toString().trim());
    }
}
