package lab03;

public class MainProgram {

    public static void main(String[] args) {

        System.out.println();
        SavingsAccount savingsAccount = new SavingsAccount(500);
        savingsAccount.deposit(2000);
        savingsAccount.withdraw(1500);
        savingsAccount.checkBalance();

        System.out.println();

        CurrentAccount currentAccount = new CurrentAccount(5000);
        currentAccount.deposit(3000);
        currentAccount.withdraw(6000);
        currentAccount.checkBalance();
        currentAccount.withdraw(4000);
        currentAccount.checkBalance();
        currentAccount.withdraw(2000);
        currentAccount.checkBalance();
        currentAccount.withdraw(1000);
        currentAccount.checkBalance();
    }
}
