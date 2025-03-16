package MidTerm;

public class TrafficSignal {

    public static void main(String[] args) {
        String light = "Red";
        boolean pedestrain = false;

        switch (light) {
            case "Green":
                if (pedestrain)
                    System.out.println("Drive");
                else
                    System.out.println("Slow Down");

                break;

            case "Yellow":
                System.out.println("Prepare to Stop");
                break;

            case "Red":
                System.out.println("Stop");
                break;

            default:
                break;
        }

    }

}
