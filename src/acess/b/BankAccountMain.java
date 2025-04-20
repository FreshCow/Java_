package acess.b;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balanc = " + account.getBalance());
        account.withdraw(13000);
        account.deposit(30000);
        System.out.println("balanc = " + account.getBalance());
        account.withdraw(3000);
        account.withdraw(3000);
        account.withdraw(3000);
        account.withdraw(3000);
        System.out.println("balanc3 = " + account.getBalance());
    }
}
