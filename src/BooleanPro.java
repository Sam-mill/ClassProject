//Boolean-- Take a true or false input from the user to determine if it's true or not that lava is safe to consume. (Nick)

//Answer
import java.util.Objects;
import java.util.Scanner;
public class BooleanPro {
    public static void main(String[] args) {
        System.out.println("Lava safe to consume, I promise :] -  T/F  " );
        boolean lava = true;
        Scanner bill = new Scanner(System.in);
        String imp = bill.nextLine();

        if (Objects.equals(imp, "T")){
            lava = false;
            System.out.println(lava);
            System.out.println("That's incorrect!");
        }
        else if (Objects.equals(imp, "F")){
            lava = true;
            System.out.println(lava);
            System.out.println("That's Correct! ");
        }
    }
}
