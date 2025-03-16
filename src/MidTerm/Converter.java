package MidTerm;

public class Converter {
    public static void main(String[] args) {
        // Question number 2;
        int minute = 3456789;
        String m2day = minute2day(minute);

        System.out.println(m2day);
    }

    public static String minute2day(int minute) {
        int day = minute / 60 / 24;
        int year = day / 365;
        int dayMinus = day - (year * 365);

        if (day == 0) {
            return String.valueOf(minute);
        }

        String yearString = "";
        if (year > 0) {
            yearString = year + " years and ";
        }

        return minute + " minutes is approximately " + yearString + dayMinus + " days";
    }
}
