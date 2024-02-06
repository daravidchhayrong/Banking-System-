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

In our banking system, we demonstrate polymorphism through the usage of inheritance and method overriding:

* **Method Overriding:** We override the **withdraw** method in the **SavingsAccount** class to implement specific behavior for savings accounts, such as applying penalties for over withdrawal accounts.

  ```
  @Override
      public void withdraw(double withdrawAmount) {
          if (withdrawAmount > 0 && withdrawAmount <= this.balance) {
              this.balance -= withdrawAmount;
              System.out.println("Withdrew $" + withdrawAmount + ". New balance: $" + this.balance);
          } else {
              System.out.println("Insufficient funds for withdrawal.");
              this.balance -= 0.7;// Apply penalty
              System.out.println("Penalty charged. New balance: $" + this.balance);
          }
      }
  ```

#### Encapsulation

* **Private Attribute:** accountNumber, accountHolder, interestRate. We use these attributes as private because we don't want other account and also subclass to directly access or modify it.
* **Protected Attribute:** balance. We use this attribute as protected because we need to use this attribute in subclasss '**SavingsAccount**' to calculate calculateInterest() method.

  ```
  public void calculateInterest() {
          double interest = this.interestRate / 100;
          this.balance += interest;
          System.out.println("Interest $" + interest + ". New balance: $" + this.balance);
      }
  ```

We use public **toString** method in **'Account'** class, so that the private attribute inside such as **accountNumber** and **accountHolder** can be access by other class.

```
public String toString() {
        return "Account Number: " + this.accountNumber + "\nAccount Holder: " + this.accountHolder + "\nBalance: $" + this.balance;
    }
```
