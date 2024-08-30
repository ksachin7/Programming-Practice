package itssachin.githubAssignments;

// create abstract class BankAccount
public abstract class BankAccount {
// create following variables:
//  • Balance - private
//  • Number of deposits this month
//  • Number of withdrawals
//  • Annual interest rate
    private double balance;
    int noOFDeposits;
    int noOfWithdrawals;
    double annualInterestRate;
    double monthlyServiceCharge;


//  create constructor
    public BankAccount(double balance, double annualInterestRate){
        this.balance= balance;
        this.annualInterestRate= annualInterestRate;
    }

    void setBalance(double balance){
        this.balance= balance;
    }

//  create getBalance method to access balance
    double getBalance(){
        return balance;
    }

//  create methods: deposit, withdraw, calcInterest, monthlyProcess
    double deposit(double amountOfDeposit){
        balance += amountOfDeposit;
        noOFDeposits++;
        return balance;
    }

    double withdraw(double amountOfWithdrawal){
        balance -= amountOfWithdrawal;
        noOfWithdrawals++;
        return balance;
    }

    double calcInterest(){
        double monthlyInterestRate= annualInterestRate/12;
        double monthlyInterest= balance*monthlyInterestRate;
        balance += monthlyInterest;
        return monthlyInterest;
    }

    abstract double monthlyProcess();
//    {
//        balance = balance- monthlyServiceCharge;
//        calcInterest();
//        noOfWithdrawals= 0;
//        noOFDeposits= 0;
//        monthlyServiceCharge= 0;
//        return balance;
//    }
}