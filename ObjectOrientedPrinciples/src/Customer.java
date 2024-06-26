import java.sql.SQLOutput;

public class Customer {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(918904,"Ramkrishna Hari");
        bankAccount.depositMoney(5000);
        System.out.println("Money deposited successfully");
        System.out.println("Remaining balance = "+bankAccount.withdrawMoney(1000));
        bankAccount.depositMoney(0);
        bankAccount.withdrawMoney(-20);
        System.out.println("Remaining balance = "+bankAccount.withdrawMoney(6000));
        System.out.println(bankAccount.getBalance());
    }
}
