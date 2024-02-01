// SavingsAccount class represents a savings account, extending Account class
class SavingsAccount extends Account{
    // Private attribute for interest rate
    private double interestRate;
    
    // Constructor to initialize savings account details
    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        // Call superclass constructor to initialize common attributes
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to calculate interest and add it to the balance
    public void calculateInterest() {
        double interest = this.getBalance() * this.interestRate;
        this.deposit(interest);
        System.out.println("Interest $" + interest * this.getBalance() + ". New balance: $" + this.getBalance());
    }   

    // Override withdraw method to include penalty for insufficient funds
    @Override
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount > 0 && withdrawAmount <= this.getBalance()) {
            super.withdraw(withdrawAmount);
            System.out.println("Withdrew $" + withdrawAmount + ". New balance: $" + this.getBalance());
        } else {
            System.out.println("Insufficient funds for withdrawal.");
            super.withdraw(1.5);// Apply penalty
            System.out.println("Penalty charged. New balance: $" + this.getBalance());
        }
    }
}
