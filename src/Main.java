import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AccountBank account = new AccountBank();

        System.out.println("Enter account number:");
        String accountNumber = scanner.nextLine();
        account.setAccountNumber(accountNumber);

        System.out.println("Enter account holder name:");
        String accountHolderName = scanner.nextLine();
        account.setAccountHolderName(accountHolderName);

        System.out.println("Enter initial balance:");
        double initialBalance = scanner.nextDouble();
        account.setBalance(initialBalance);

        System.out.println("Initial Account Information:");
        account.displayAccountInfo();

        while (true) {
            System.out.println("\nChoose transaction:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter deposit amount:");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter withdrawal amount:");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Enter destination account number:");
                    String destinationAccountNumber = scanner.next();
                    System.out.println("Enter transfer amount:");
                    double transferAmount = scanner.nextDouble();
                    AccountBank destinationAccount = new AccountBank();
                    account.transfer(destinationAccount, transferAmount);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println("\nUpdated Account Information:");
            account.displayAccountInfo();
        }
    }
}