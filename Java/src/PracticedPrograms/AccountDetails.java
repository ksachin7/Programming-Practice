package PracticedPrograms;
// Design a class to store account details of a person like account number, name, account type, available balance and minimum balance.
// Define methods to get input, display account details, show balance, deposit and withdraw.
// Apply the condition while withdraw money from account that the minimum balance to be maintained.

class BankAccount {
    private int accountNumber;
    private String name;
    private String accountType;
    private double availableBalance;
    private final double minimumBalance; // Declare minimumBalance as final

    public BankAccount(int accountNumber, String name, String accountType, double availableBalance, double minimumBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountType = accountType;
        this.availableBalance = availableBalance;
        this.minimumBalance = minimumBalance; // Initialize final variable in the constructor
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Account Type: " + accountType);
        System.out.println("Available Balance: " + availableBalance);
        System.out.println("Minimum Balance: " + minimumBalance);
    }

    public void showBalance() {
        System.out.println("Available Balance: " + availableBalance);
    }

    public void deposit(double amount) {
        availableBalance += amount;
        System.out.println("Deposited " + amount + ". Current balance: " + availableBalance);
    }

    public void withdraw(double amount) {
        if (availableBalance - amount >= minimumBalance) {
            availableBalance -= amount;
            System.out.println("Withdrawn " + amount + ". Current balance: " + availableBalance);
        } else {
            System.out.println("Withdrawal amount exceeds the minimum balance limit!");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(12345, "John Doe", "Savings", 1000, 500);
        account1.displayDetails();
        account1.deposit(500);
        account1.showBalance();
        account1.withdraw(200);
    }
}
