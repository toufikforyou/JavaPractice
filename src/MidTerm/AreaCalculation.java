package MidTerm;

public class AreaCalculation {
    public static void main(String[] args) {
        // Cercle area is // Question number 1 part a
        double radius = 2;
        double areaCercle = CercleArea(radius);
        System.out.println("Cercle Area is: " + areaCercle);

        // Rectangle Area is // question number 1 part b
        double width = 5;
        double height = 3;

        double areaRectangle = RectangleArea(width, height);
        System.out.println("Rectangle Area is: " + areaRectangle);
    }

    public static double CercleArea(double radius) {
        // Circle area = PI * radius^2
        return Math.PI * Math.pow(radius, 2);
    }

    public static double RectangleArea(double w, double h) {
        // Rectangle area = width * height
        return w * h;
    }
}