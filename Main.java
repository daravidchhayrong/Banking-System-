import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        int acNumber = 1234;
        System.out.println("Welcome to creating account");
        System.out.println("1. Create Normal Account\n2. Create Create Saving Account");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please select the choice: ");
        // Get user's choice for account type
        int choice = sc.nextInt();   
        sc.nextLine();// Consume newline character

        // Handle user's choice
        if (choice == 1) {
            // Normal Account Section
            System.out.println("\nNormal Account Section");
            System.out.print("Please enter the account holder name: ");
            name = sc.nextLine();
            Account mainAccount = new Account(acNumber + 1, name, 0);
            System.out.println(mainAccount.toString());
            int acChoice;
            do {
                // Perform account actions for normal account
                System.out.println("\n-------------------------------------");
                System.out.println("Please select the choice: \n1. Deposit\n2. Withdraw\n3. View Detail\n4. Exit");
                acChoice = sc.nextInt();
                if (acChoice == 1) {
                    double deposit;
                    System.out.print("Enter the deposit amount: ");
                    deposit = sc.nextDouble();
                    mainAccount.deposit(deposit);
                } else if (acChoice == 2) {
                    double withdraw;
                    System.out.print("Enter the withdrawal amount: ");
                    withdraw = sc.nextDouble();
                    mainAccount.withdraw(withdraw);
                } else if (acChoice == 3) {
                    System.out.println(mainAccount.toString());
                }
            } while (acChoice != 4);
        } else if (choice == 2) {
            // Saving Account Section
            System.out.println("\nSaving Account Section");
            System.out.print("Please enter the account holder name: ");
            name = sc.nextLine();
            System.out.println("Your Saving account interest rate is 5%");
            Account saveAccount = new SavingsAccount(acNumber + 1, name, 0, 0.5);
            System.out.println(saveAccount.toString());
            int acChoice;
            do {
                // Implement similar logic for handling saving account actions
                System.out.println("\n-------------------------------------");
                System.out.println("Please select the choice: \n1. Deposit\n2. Withdraw\n3. Calculate interestRate\n4. View Detail\n5. Exit");
                acChoice = sc.nextInt();
                if (acChoice == 1) {
                    double deposit;
                    System.out.print("Enter the deposit amount: ");
                    deposit = sc.nextDouble();
                    saveAccount.deposit(deposit);
                } else if (acChoice == 2) {
                    double withdraw;
                    System.out.print("Enter the withdrawal amount: ");
                    withdraw = sc.nextDouble();
                    saveAccount.withdraw(withdraw);
                } else if (acChoice == 3) {
                    //Cast SavingsAccount object back to SavingsAccount
                    if (saveAccount instanceof SavingsAccount) {
                        SavingsAccount savingsAccount = (SavingsAccount) saveAccount;
                        savingsAccount.calculateInterest();
                    }
                }else if (acChoice == 4) {
                    System.out.println(saveAccount.toString());
                }
            } while (acChoice >0 && acChoice <5);
        }
        sc.close();

    }
}
