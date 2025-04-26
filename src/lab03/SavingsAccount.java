package lab03;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double initial) {
        super(initial);
    }

    private final double WITHDRAW_LIMIT = 1000;

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > WITHDRAW_LIMIT) {
            System.out.println("Oh ho limit nai. please kom taka daw.");
            return;
        }

        super.withdraw(amount);
    }

    @Override
    public void checkBalance() {
        super.checkBalance();
    }
}
