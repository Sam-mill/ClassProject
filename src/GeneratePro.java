//Creating objects to call instance methods -- Create an object and instance then use that object and call the instance’s method. (Nick)


//Answer:
public class GeneratePro {
    private int number;

    public GeneratePro(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int toStrings() {
        return number;
    }

    public static void main(String[] args) {
        GeneratePro bill = new GeneratePro(4);
        bill.getNumber();
        System.out.println(bill.toStrings());
        bill.setNumber(8);
        System.out.println(bill.toStrings());
    }
}
