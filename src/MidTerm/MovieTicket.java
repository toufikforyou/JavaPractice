package MidTerm;

public class MovieTicket {

    public static void main(String[] args) {
        boolean isWeekend = false;

        int age = 15;
        int ticketPrice;

        if (age < 13) {
            if (isWeekend)
                ticketPrice = 120;
            else
                ticketPrice = 100;
        } else if (age < 64) {
            if (isWeekend)
                ticketPrice = 180;
            else
                ticketPrice = 150;
        } else if (age >= 65) {
            if (isWeekend)
                ticketPrice = 150;
            else
                ticketPrice = 130;
        } else {
            ticketPrice = 0;
        }

        System.out.println(ticketPrice);
    }
}
