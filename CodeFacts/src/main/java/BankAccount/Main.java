package BankAccount;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("MyBank");

        Customer customer1 = new Customer("John Doe");
        Customer customer2 = new Customer("Jane Doe");

        Account account1 = new Account(1, 1000.0, customer1);
        Account account2 = new Account(2, 500.0, customer2);

        bank.addAccount(account1);
        bank.addAccount(account2);

        account1.deposit(200.0);
        account2.withdraw(100.0);

        System.out.println("Bank: " + bank.getName());
        for (Account account : bank.getAccounts()) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Owner: " + account.getOwner().getName());
            System.out.println("Balance: $" + account.getBalance());
            System.out.println();
        }
    }
}