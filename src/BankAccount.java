public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName, email, phoneNumber;

    public static void main(String[] args) {
        BankAccount sampleAccount = new BankAccount(2005.45, 12345678,"email@web.com", "John Smith", "+44123432463");
        sampleAccount.printAllBankAccountData();

        sampleAccount.depositFunds(200);
        sampleAccount.printAllBankAccountData();

        sampleAccount.withdrawFunds(200);
        sampleAccount.printAllBankAccountData();

        sampleAccount.withdrawFunds(2500);
        sampleAccount.printAllBankAccountData();

        BankAccount timAccount = new BankAccount("tim@web.com", "Tim Zimmermann", "+49878878996");
        timAccount.printAllBankAccountData();
    }

    public BankAccount() {
        this(0, 10000000, "empty E-Mail", "empty customerName", "empty phoneNumber");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String email, String customerName, String phoneNumber) {
        this(0, 10000000, email, customerName, phoneNumber);
    }

    public BankAccount(double balance, int accountNumber, String email, String customerName, String phoneNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.email = email;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }

    public void printAllBankAccountData() {
        System.out.println("Customer: " + this.customerName + " " + this.email + " " + this.phoneNumber);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + (double)Math.round(this.balance*100)/100);
        System.out.println("");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawFunds(double withdrawalAmount) {
        if(withdrawalAmount > this.balance) {
            System.out.println("Insufficient funds. Nothing has changed.");
        } else {
            this.balance -= withdrawalAmount;
        }
    }
}