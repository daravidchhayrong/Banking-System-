// Account class represents a basic bank account
class Account {
    // Private attributes
    private int accountNumber;
    private String accountHolder;
    protected double balance; // Protected so that subclasses can access it

    // Constructor to initialize account details
    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to deposit funds into the account
    public void deposit(double depositAmount) {
        if (depositAmount > 0) {
            this.balance += depositAmount;
            System.out.println("Deposit $" + depositAmount + "\n New amount: " + this.balance);
        } else {
            System.out.println("Deposit must greater than 0");
        }
    }    

    // Method to withdraw funds from the account
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount < 0 || withdrawAmount > this.balance) {
            System.out.println("Insuffeicene amount");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("Withdraw $" + withdrawAmount + "\n New amount: " + this.balance);
        }
    }

    // Method to get a string representation of the account details
    public String toString() {
        return "Account Number: " + this.accountNumber + "\nAccount Holder: " + this.accountHolder + "\nBalance: $" + this.balance;
    }
}
