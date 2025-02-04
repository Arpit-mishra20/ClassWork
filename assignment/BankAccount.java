class BankAccount {
    private static String bankName = "Gramine Bank";
    private static int totalAccounts = 0;

    private final int accountNumber; 
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++; 
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts in Bank: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) { 
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Arpit Mishra", 1001, 5000);
        BankAccount acc2 = new BankAccount("Bob Marley", 1002, 3000);

        acc1.displayAccountDetails();
        System.out.println("-------------------");
        acc2.displayAccountDetails();

        BankAccount.getTotalAccounts();
    }
}