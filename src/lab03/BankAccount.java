package lab03;

public class BankAccount {

    private double amount = 0;

    public BankAccount(double initial) {
        this.amount = initial;
    }

    protected void deposit(double amount) {
        if (amount > 0) {
            this.amount += amount;
            System.out.println("Deposit successful. Current balance: " + this.amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    protected void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Tumi ki manus? 0 er kom taka hoi? Blocked by MH Toufik");
            return;
        }

        double isAvailableBdt = this.amount - amount;

        if (isAvailableBdt < 0) {
            System.out.println("Tomar bank toh " + amount + " takai nai. Dhur dhur. :)");
            return;
        }

        if (isAvailableBdt >= 0) {
            this.amount -= amount;
            System.out.println("Ai now tomar " + amount + " taka");
            return;
        }

        System.out.println("Oh ho balance nai");
    }

    protected void checkBalance() {
        System.out.println("Tmr bank a matro taka ase: " + this.amount);
    }
}
