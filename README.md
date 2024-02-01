# **Simple Banking System**

### intoduction

The Banking System is a Java-based application designed to manage bank accounts, allowing users to create and interact with both normal and savings accounts. It provides features such as depositing funds, withdrawing funds with penalties for savings accounts, and calculating interest rates for savings accounts.

### Object-Oriented Features

#### Classes & Objects

* **Account:** Represents a basic bank account with attributes like accountNumber, accountHolder, and balance, along with methods for deposit and withdrawal.
* **SavingsAccount:** Subclass of Account, adding an interestRate attribute and overriding the withdraw method to include penalties for exceeding the account balance.
* **Main:** The main class where the banking system is initiated and user interactions are managed.

#### Inheritance

The '**SavingsAccount'** class inherits from the '**Account'** class, sharing a common interface for deposits and withdrawal operations

#### Polymorphism

In our banking system, we demonstrate polymorphism through the usage of inheritance, method overriding and casting:

* **Method Overriding:** We override the **withdraw** method in the **SavingsAccount** class to implement specific behavior for savings accounts, such as applying penalties for over withdrawal accounts.
* **Casting:** We first we create the saveAccount as the **Account** first since before becoming '**SavingsAccount'** it first is the account and after that we will cast them back to '**SavingsAccount'** class and invoke the '**calculateInterest'** method specific to savings account.

```
Account saveAccount = new SavingsAccount(acNumber + 1, name, 0, 5);
if (saveAccount instanceof SavingsAccount) {
                        SavingsAccount savingsAccount = (SavingsAccount) saveAccount;
                        savingsAccount.calculateInterest();
                    }
```

#### Encapsulation

We use public **toString** method in **'Account'** class, so that the private attribute inside such as **accountNumber** and **accountHolder** and **Balance** can be access by other class.

```
public String toString() {
        return "Account Number: " + this.accountNumber + "\nAccount Holder: " + this.accountHolder + "\nBalance: $" + this.balance;
    }
```

Additionally we also use **getBalance()** method in **Account** class

```
public double getBalance(){
	return this.balance;
}
```

so that the **SavingsAccount** class can use the **balance** attribute which is a private attribute to do calculation in some other methods like **calculateInterest():**

```
public void calculateInterest() {
        double interest = this.getBalance() * this.interestRate;
        this.deposit(interest);
        System.out.println("Interest $" + interest + ". New balance: $" + this.getBalance());
    } 
```
