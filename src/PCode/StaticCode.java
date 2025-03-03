package PCode;

class StaticCode {

    public static void main(String[] args) {
        hey();
        hey();
        hey();

        System.out.println("System out for hello");

        hello();
        hello();
        hello();
    }

    static int num = 10;

    public static void hey() {
        System.out.println(num + 1);
    }

    public static void hello() {
        System.out.println(num++);
    }
}