//Constructors, getters, and setters – create a constructer, getter and setter for the variable: private int number; (Nick)


//Answer:
public class InstanceMethodsPro {
    public void toStrings(String a) {
        a = "word";
        System.out.println(a);;
    }


    public static void main(String[] args) {
        InstanceMethodsPro fill = new InstanceMethodsPro();
        fill.toStrings("");
        System.out.println();

    }
}