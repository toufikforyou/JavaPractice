package MidTerm;

public class SwapTwoNumber {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;

        System.out.println("Num1: " + num1 + " Num2: " + num2);

        int temp;

        // Swaping
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swaping Num1: " + num1 + " Num2: " + num2);
    }

}
