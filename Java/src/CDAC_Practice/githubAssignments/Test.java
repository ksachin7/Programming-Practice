package itssachin.githubAssignments;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SavingsAccount sa = new SavingsAccount(0, 0);

//      take initial balance
        System.out.println("Enter Balance: ");
         sa.balance = scan.nextDouble();
         sa.setBalance(sa.balance);

//      take interest rate
        System.out.println("Enter annual interest rate: ");
        sa.annualInterestRate= scan.nextDouble();

//      call the method monthlyProcess
        sa.monthlyProcess();
        System.out.printf("The balance after adding the Monthly Interest= %.2f\n",sa.getBalance());

//      code for withdrawing money
        System.out.println("Please enter the amount you want to withdraw: ");
        double withdrawalAmount = scan.nextDouble();
        sa.withdraw(withdrawalAmount);
        System.out.printf("Balance after withdrawal= %.2f\n" , sa.getBalance());

//      code for depositing money
        System.out.println("Please enter the amount you want to deposit: ");
        double depositAmount = scan.nextDouble();
        sa.deposit(depositAmount);
        System.out.printf("Balance after deposit= %.2f\n" , sa.getBalance());

//      code for further withdrawals and deposits
        int w=1, d=1;
        while(w!= 0) {
            System.out.println("Do you want to make any more withdrawals? If yes please enter 1 and if no please enter 0: ");
            w = scan.nextInt();
            if (w != 0) {
                System.out.println("Please enter the amount you want to withdraw: ");
                withdrawalAmount = scan.nextDouble();
                sa.withdraw(withdrawalAmount);
                System.out.printf("Balance after withdrawal= %.2f\n" , sa.getBalance());
            }
        }
        while(d!= 0) {
            System.out.println("Do you want to make any more deposits? If yes please enter 1 and if no please enter 0: ");
            d = scan.nextInt();
            if (d != 0){
                System.out.println("Please enter the amount you want to deposit: ");
                depositAmount = scan.nextDouble();
                sa.deposit(depositAmount);

                System.out.printf("Balance after deposit= %.2f\n" , sa.getBalance());
            }
        }

//      code for report
        System.out.println("The total number of deposits made = "+sa.noOFDeposits);
        System.out.println("The total number of withdrawals made = "+sa.noOfWithdrawals);
        System.out.printf("The total service charge of the month is %.2g\n",sa.monthlyServiceCharge);
        sa.isActive();
    }
}
