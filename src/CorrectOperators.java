public class CorrectOperators {
    public static void main(String[] args) {
        System.out.println("Rewrite the code below with the blanks filled in with the correct operator type to " +
                "get the number 15 equal to the variable first.\n" +
                "Each basic operator will be used once (addition, subtraction, multiplication, division, and mod)." +
                "\nDivision and mod are filled in for you.\n");

        System.out.println("int first = 10 \nint second = 20\n" +
                "second = second / first; \n" +
                "first = first __ second; \n" +
                "first = first __ second; \n" +
                "first = first %     10; \n" +
                "first __= 9;\n" +
                "return first;");
        /**
         * Answer:
        int first = 10;
        int second = 20;

        second = second / first; //Get second = 2 /

        first = first - second; //Get first = 8; -

        first = first * second; //Get first = 16; *

        first = first % 10; //Get first = 6; %

        first += 9; //Get first = 15; +

        return first;

        */



    }


}
