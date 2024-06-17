class BankAccount {

    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(long accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    String getAccountHolderName() {
        return accountHolderName;
    }

    void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    double getBalance() {
        return balance;
    }

    public void depositMoney(double money){

        if(money > 0)
            balance += money;
        else
            System.out.println("Invalid deposit");
    }

    public double withdrawMoney(double amount){
        if(amount <= 0)
            System.out.println("Invalid withdrawal");
        else if(balance >= amount){
            balance -= amount;
        }else{//make balance 0
            amount = balance;
            balance = 0;
        }
        return balance;
    }

}
