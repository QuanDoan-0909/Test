public class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public AccountBank() {
        this.accountNumber = "";
        this.accountHolderName = "";
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited successfully.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void transfer(AccountBank destinationAccount, double amount) {
        if (balance >= amount) {
            balance -= amount;
            destinationAccount.deposit(amount);
            System.out.println("$" + amount + " transferred successfully to account " + destinationAccount.getAccountNumber());
        } else {
            System.out.println("Insufficient funds for transfer.");
        }
    }

}