import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        System.out.println("Create an instance method called circle which calculates the circumference" +
                " of a circle given the radius");


        Scanner input = new Scanner(System.in);

        Problem5 ci = new Problem5();
        System.out.println("Enter the radius of the circle: ");
        System.out.println(ci.Circle(input.nextInt()));

    }
    public Double Circle(double x){
        double circumference = 2*Math.PI*x;
        return circumference;
    }
}