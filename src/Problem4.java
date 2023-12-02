import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        System.out.println("Create a method that takes a String str as a parameter and returns the last three " +
                "characters of the string.");


        /** Answer:
         * public class Problem4 {
         *     public static void main(String[] args) {
        System.out.println("Enter a string: ");

        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String three = getChars(str);
        System.out.println(three);

    }
    public static String getChars(String str){
        String firstThree = "";
        firstThree += str.substring(str.length()-3);
        return firstThree;
         }}
         */
    }

}