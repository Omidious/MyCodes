import BankAccount.Account;
import BankAccount.Bank;
import BankAccount.Customer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    @Test
    void testAddAccount() {
        Bank bank = new Bank("MyBank");
        Customer customer = new Customer("John Doe");
        Account account = new Account(1, 1000.0, customer);

        bank.addAccount(account);
        assertTrue(bank.getAccounts().contains(account));
    }
}