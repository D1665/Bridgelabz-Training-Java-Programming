package Object_Oriented_Programming.OOPs_Basic.ThisandStaticandFinalKeywordsProblems;

class BankAccount {

    // 1. Static variable
    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    // 3. Final variable
    final int accountNumber;

    // Instance variables
    String accountHolderName;
    double balance;

    // Constructor using "this"
    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;   // resolving ambiguity
        this.accountNumber = accountNumber;           // final variable initialized
        this.balance = balance;
        totalAccounts++;
    }

    // Static method
    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------------");
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {

        // Creating objects
        BankAccount acc1 = new BankAccount("Dinesh", 1001, 5000);
        BankAccount acc2 = new BankAccount("Rahul", 1002, 10000);

        // 4. instanceof check
        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }

        if (acc2 instanceof BankAccount) {
            acc2.displayDetails();
        }

        // Static method call
        BankAccount.getTotalAccounts();
    }
}
