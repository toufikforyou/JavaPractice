package MidTerm;

public class FindLergestNumber {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 120;
        int num3 = 80;

        if (num1 > num2 && num1 > num3) {
            System.out.println("Number 1 is lergest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2 is lergest");
        } else {
            System.out.println("Number 3 is lergest");
        }
    }
}
