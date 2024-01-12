import BankAccount.Customer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void testGetName() {
        Customer customer = new Customer("John Doe");
        assertEquals("John Doe", customer.getName());
    }
}