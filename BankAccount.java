public class BankAccount {
    // Attributes
    String accountNumber;
    String accountHolder;
    double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Creating bank account objects
        BankAccount acc1 = new BankAccount("1234567890", "Tanu Yadav", 15000.0);
        BankAccount acc2 = new BankAccount("9876543210", "Aayati Srivastava", 32000.0);

        // Displaying balances
        acc1.displayBalance();
        acc2.displayBalance();
    }
}
