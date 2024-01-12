import BankAccount.Account;
import BankAccount.Customer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void testDeposit() {
        Customer customer = new Customer("John Doe");
        Account account = new Account(1, 1000.0, customer);

        account.deposit(200.0);
        assertEquals(1200.0, account.getBalance());
    }

    @Test
    void testWithdrawSufficientFunds() {
        Customer customer = new Customer("John Doe");
        Account account = new Account(1, 1000.0, customer);

        account.withdraw(200.0);
        assertEquals(800.0, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Customer customer = new Customer("John Doe");
        Account account = new Account(1, 100.0, customer);

        // Ensure that the balance remains the same when withdrawing more than the balance
        account.withdraw(200.0);
        assertEquals(100.0, account.getBalance());
    }
}