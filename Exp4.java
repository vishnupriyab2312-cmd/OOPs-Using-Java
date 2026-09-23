package exp4;
class Account {
    String name;
    int accountNumber;

    Account(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    void displayAccountDetails() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
}

class SavingsAccount extends Account {

    SavingsAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }

    void displaySavingsAccount() {
        System.out.println("Account Type: Savings Account");
    }
}

class CurrentAccount extends Account {

    CurrentAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }

    void displayCurrentAccount() {
        System.out.println("Account Type: Current Account");
    }
}

class PremiumSavingsAccount extends SavingsAccount {

    PremiumSavingsAccount(String name, int accountNumber) {
        super(name, accountNumber);
    }

    void displayPremiumAccount() {
        System.out.println("Account Type: Premium Savings");
    }
}

public class Exp4 {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount("Anitha", 101);

        CurrentAccount c = new CurrentAccount("Vinu", 102);

        PremiumSavingsAccount p =
            new PremiumSavingsAccount("Priya", 103);

        System.out.println("----- Savings Account -----");
        s.displayAccountDetails();
        s.displaySavingsAccount();

        System.out.println();

        System.out.println("----- Current Account -----");
        c.displayAccountDetails();
        c.displayCurrentAccount();

        System.out.println();

        System.out.println("----- Premium Savings Account -----");
        p.displayAccountDetails();
        p.displaySavingsAccount();
        p.displayPremiumAccount();
    }
}
