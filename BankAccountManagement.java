package Day2;


class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    
    BankAccount(String name, String number, double bal) {
        accountHolder = name;
        accountNumber = number;
        balance = bal;
    }

    
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}


public class BankAccountManagement {
    public static void main(String[] args) {

        
        BankAccount b1 = new BankAccount("Diya", "1001", 5000);
        BankAccount b2 = new BankAccount("Meenu", "1002", 8000);

        
        b1.deposit(2000);
        b2.deposit(1000);

        
        b1.withdraw(1500);

        
        System.out.println("\nAccount 1 Details");
        b1.displayDetails();

        System.out.println("\nAccount 2 Details");
        b2.displayDetails();
    }
}

