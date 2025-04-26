package lab03;

public class CurrentAccount extends BankAccount {
    public CurrentAccount(double initial) {
        super(initial);
    }

    private final double WITHDRAW_LIMIT = 5000;

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
