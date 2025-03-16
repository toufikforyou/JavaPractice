package MidTerm;

import java.util.Scanner;

public class EmployeeSelary {

    public static void main(String[] args) {
        double standardRate = 8.25;
        double overtimeRate = standardRate * 1.5;
        int standardHours = 40;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of hours worked in a week: ");
        double hoursWorked = scanner.nextDouble();

        double salary;
        if (hoursWorked <= standardHours) {
            salary = hoursWorked * standardRate;
        } else {
            double regularPay = standardHours * standardRate;
            double overtimePay = (hoursWorked - standardHours) * overtimeRate;
            salary = regularPay + overtimePay;
        }

        System.out.println("The weekly salary is: $" + salary);

        scanner.close();
    }
}
