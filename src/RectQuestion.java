public class RectQuestion {
    public static void main(String[] args) {
        System.out.println("Create a class called Rectangle. Use the scanner method to ask " +
                "for the length and diwth of the rectangle. You should also ask for the color. Then return the area," +
                "parameter, and color of the rectangle. ");

        System.out.println("\nBe sure to use a toString method to return the information" +
                "in a string format.");

        /**
         * Answer:
         * import java.util.Scanner;
         *
         * public class Rectangle {
         * public static void main(String[] args){
         * Scanner scan = new Scanner(System.in);
         *
         * System.out.println("Let's make a rectangle. What color should th rectangle be?);
         *
         * String color = scan.nextLine();
         *
         * System.out.println("Please give a length and a" +
         * " width.");
         *
         * double length = scan.nextDouble();
         * double width = scan.nextDouble();
         *
         * double area = Area(length, width);
         *
         * double parameter = Parameter(length, width);
         *
         * System.out.println(toString(area, parameter, color));
         * }
         * private static double Parameter(double l, double w){
         * double parameter = l*2 + w*2;
         *
         * return parameter;
         * }
         * private static double Area(double l, double w){
         *
         * double area = l*w;
         *
         * return area;
         * }
         * private static String toString(double a, double p, String c){
         *
         * return " The " + c + " rectangle has a parameter " +
         *        "of " + p + " and an area of " + a + " .";
         *
         */
    }
}
