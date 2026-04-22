package Object_Oriented_Programming.OOPs_Intermediate.EncapsulationAndPolymorphishmAndAbstraction;

// Interface
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract Class
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    BankAccount(String accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    // Encapsulation
    public double getBalance() { return balance; }
    public String getHolderName() { return holderName; }

    // Deposit
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Abstract
    abstract double calculateInterest();
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {

    SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan applied for: " + amount);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}

// Current Account
class CurrentAccount extends BankAccount implements Loanable {

    CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    public void applyForLoan(double amount) {
        System.out.println("Loan applied for: " + amount);
    }

    public boolean calculateLoanEligibility() {
        return getBalance() > 50000;
    }
}

// Main
public class BankingSystem {
    public static void main(String[] args) {

        BankAccount[] accounts = {
            new SavingsAccount("SBI123", "Dinesh", 20000),
            new CurrentAccount("ICICI456", "Rahul", 60000)
        };

        for (BankAccount acc : accounts) {
            System.out.println("Account Holder: " + acc.getHolderName());

            acc.deposit(5000);
            acc.withdraw(2000);

            double interest = acc.calculateInterest();
            System.out.println("Interest: " + interest);

            if (acc instanceof Loanable) {
                Loanable loan = (Loanable) acc;
                System.out.println("Eligible for Loan: " + loan.calculateLoanEligibility());
                loan.applyForLoan(100000);
            }

            System.out.println("----------------------");
        }
    }
}
