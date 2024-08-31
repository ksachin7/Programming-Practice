package CDAC_Practice.githubAssignments;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(double balance, double annualInterestRate) {
        super(balance, annualInterestRate);
    }
    double balance= super.getBalance();

//  create a status field to represent an active or inactive account
    boolean status;     // status is false initially i.e. inactive

//  create method isActive to check if account is active for a min account balance of $25
    boolean isActive(){
        status= balance >= 25;
        System.out.println((status)? "The savings account is currently active.": "The savings account is inactive!");
        return status;
    }
//  override parent methods: deposit, withdraw, monthlyProcess
    @Override
    double deposit(double amountOfDeposit){
        super.deposit(amountOfDeposit);

        if (!isActive()) {
            status = true;
        }
        return amountOfDeposit;
    }

    @Override
    double withdraw(double amountOfWithdrawal){
        if (!isActive())
            System.out.println("Withdrawal isn't allowed! Your account is inactive.");
        else
            super.withdraw(amountOfWithdrawal);
        return amountOfWithdrawal;
    }

    @Override
    double monthlyProcess(){
        balance = balance- super.monthlyServiceCharge;
        super.calcInterest();
        if(noOfWithdrawals> 4)
            super.monthlyServiceCharge+= 1;
//        super.monthlyProcess();
//        if (balance < 25)
//            status=false;
        isActive();
        return 0;
    }
}
