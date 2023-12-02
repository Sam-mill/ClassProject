public class Problem7 {
    public static void main(String[] args) {
        System.out.println("Write a program that calculates the area of a circle using methods to get the radius" +
                "and area then outputs them.");

        /** Answer:
         public class Problem7 {
         public static void main(String[] args) {
         System.out.println("Write a program that calculates the area of a circle using methods to get the radius" +
         "and area then outputs them.");

         Circle r1 = new Circle();
         r1.setRadius(12.1);
         Circle r2 = new Circle(15.6);
         System.out.println(r1.getArea());
         System.out.println(r2.getArea());
         }
         }
         class Circle {
         private double x;

         public Circle() {
         x = 1;

         }

         public Circle(double x){
         this.x = x;
         }
         public double getRadius(){
         return x;
         }

         public void setRadius(Double x) {
         this.x = x;
         }

         public Double getArea(){
         return 2 * Math.PI * x;
         }
         }
*/
    }
}
