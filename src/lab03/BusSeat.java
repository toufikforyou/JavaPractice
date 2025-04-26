package lab03;

public class BusSeat {
    public static void main(String[] args) {
        int[] seats = new int[] { 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0,
                0 };

        int countAvailable = 0;
        int countBooked = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                countBooked++;
            } else {
                countAvailable++;
            }
        }

        System.out.println("\nSeat Status:");
        System.err.println("Total Seats: " + (countAvailable + countBooked));
        System.out.println("Count of Available Seats: " + countAvailable);
        System.out.println("Count of Booked Seats: " + countBooked);

    }
}
