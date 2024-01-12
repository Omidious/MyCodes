import BankAccount.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class MainTest {

    @Test
    void testMain() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(null);

        String actualOutput = outContent.toString();

        assertTrue(actualOutput.contains("Bank: MyBank"));
        assertTrue(actualOutput.contains("Account Number: 1"));
        assertTrue(actualOutput.contains("Owner: John Doe"));
        assertTrue(actualOutput.contains("Balance: $1200.0"));
        assertTrue(actualOutput.contains("Account Number: 2"));
        assertTrue(actualOutput.contains("Owner: Jane Doe"));
        assertTrue(actualOutput.contains("Balance: $400.0"));

        System.setOut(System.out);
    }
}