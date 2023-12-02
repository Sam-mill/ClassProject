import java.util.Arrays;
public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Write a program that outputs an array list that is the reverse of the input list.");

        /** Answer:
         * import java.util.Arrays;
         * public class Problem2 {
         *     public static void main(String[] args) {
        String[] original = new String[5];

        original[0]=("Apples");
        original[1]=("Bananas");
        original[2]=("Raspberry");
        original[3]=("Lime");
        original[4]=("Guava");

        System.out.println(Arrays.toString(original));

        String[] reverse = new String[original.length];
        int i;
        int j;

        for(i = original.length - 1, j = 0; i >=0 && j >= 0 ; --i, j++){
            reverse[j] = original[i];
        }
        System.out.println(Arrays.toString(reverse));
         }}
        */
    }
}