package O7_Method.String_toString.Q564;

class Customer {
    private int code;
    private String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public String toString() {
        return this.code + "-" + this.name;
    }

}

public class Q564 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Customer 1");
        System.out.println(c1.toString());                                  // 1001-Customer 1
    }
}
