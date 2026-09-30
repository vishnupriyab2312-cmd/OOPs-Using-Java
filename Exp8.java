import java.util.Scanner;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Withdraw successful");
            System.out.println("Updated Balance: " + balance);
        }
    }
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
public class Exp8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter initial balance: ");
            double balance = sc.nextDouble();

            BankAccount account = new BankAccount(balance);

            System.out.println("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number: ");
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
            sc.close();
        }
    }
}