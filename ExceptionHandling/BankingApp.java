package ExceptionHandling;

// Custom checked exception for insufficient balance
class InsufficientBalanceException extends Exception {
    private double amount;
    private double balance;

    public InsufficientBalanceException(double amount, double balance) {
        super(String.format(
            "Insufficient balance! Attempted: Rs%.2f | Available: Rs%.2f",
            amount, balance));
        this.amount = amount;
        this.balance = balance;
    }

    public double getAmount()  { return amount; }
    public double getBalance() { return balance; }
}

// Custom unchecked exception for invalid operations
class InvalidTransactionException extends RuntimeException {
    public InvalidTransactionException(String msg) {
        super("Invalid Transaction: " + msg);
    }
}

class BankAccount {
    private String owner;
    private double balance;
    private int transactionCount = 0;

    BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount <= 0)
            throw new InvalidTransactionException("Deposit amount must be positive, got: " + amount);
        balance += amount;
        transactionCount++;
        System.out.printf("Deposited: Rs%.2f | New Balance: Rs%.2f%n", amount, balance);
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0)
            throw new InvalidTransactionException("Withdrawal amount must be positive, got: " + amount);
        if (amount > balance)
            throw new InsufficientBalanceException(amount, balance);
        balance -= amount;
        transactionCount++;
        System.out.printf("Withdrawn: Rs%.2f | New Balance: Rs%.2f%n", amount, balance);
    }

    void transfer(BankAccount target, double amount) throws InsufficientBalanceException {
        System.out.println("\nTransfer: " + owner + " -> " + target.owner + " Rs" + amount);
        try {
            this.withdraw(amount);
            target.deposit(amount);
            System.out.println("Transfer successful.");
        } catch (InsufficientBalanceException e) {
            System.out.println("Transfer failed: " + e.getMessage());
            throw e; // re-throw
        } finally {
            System.out.println("[Finally] Transfer operation completed for account: " + owner);
        }
    }

    void printStatement() {
        System.out.printf("Account[%s] Balance: Rs%.2f | Transactions: %d%n",
            owner, balance, transactionCount);
    }
}

public class BankingApp {
    public static void main(String[] args) {
        BankAccount alice = new BankAccount("Alice", 10000.00);
        BankAccount bob   = new BankAccount("Bob", 500.00);

        System.out.println("=== Initial State ===");
        alice.printStatement();
        bob.printStatement();

        // Valid deposit
        System.out.println("\n=== Deposit ===");
        try {
            alice.deposit(2000);
        } catch (InvalidTransactionException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("[Finally] Deposit block executed.");
        }

        // Valid withdrawal
        System.out.println("\n=== Withdrawal ===");
        try {
            alice.withdraw(3000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("[Finally] Withdrawal block executed.");
        }

        // Insufficient balance withdrawal
        System.out.println("\n=== Insufficient Balance ===");
        try {
            bob.withdraw(5000); // Bob only has 500
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught: " + e.getMessage());
            System.out.printf("Shortfall: Rs%.2f%n", e.getAmount() - e.getBalance());
        } finally {
            System.out.println("[Finally] Withdrawal block executed.");
        }

        // Invalid transaction (negative amount)
        System.out.println("\n=== Invalid Transaction ===");
        try {
            alice.deposit(-500);
        } catch (InvalidTransactionException e) {
            System.out.println("Caught: " + e.getMessage());
        } finally {
            System.out.println("[Finally] Invalid deposit block executed.");
        }

        // Successful transfer
        System.out.println("\n=== Transfer (Success) ===");
        try {
            alice.transfer(bob, 1000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transfer Exception: " + e.getMessage());
        }

        // Failed transfer
        System.out.println("\n=== Transfer (Fail - Insufficient) ===");
        try {
            bob.transfer(alice, 99999);
        } catch (InsufficientBalanceException e) {
            System.out.println("Outer catch: " + e.getMessage());
        }

        System.out.println("\n=== Final State ===");
        alice.printStatement();
        bob.printStatement();
    }
}
