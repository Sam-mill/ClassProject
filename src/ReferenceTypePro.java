//Reference Type Conversions – This convert’s a value’s reference type (Int, Double, String, etc...) into a different Reference type. Find a way to convert: Object bill = “Hello bill” into a String reference type. (Nick)


//Answer:
public class ReferenceTypePro {
    public static void main(String[] args) {
        Object bill = "Hello bill";
        String say =(String) bill;
        System.out.println(say);
    }
}
