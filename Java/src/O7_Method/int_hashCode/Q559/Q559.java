package O7_Method.int_hashCode.Q559;

class Customer {
    private int code;
    private String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }
}

public class Q559 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Customer 1");
        System.out.println(c1.hashCode());                              // return the reference address to the object

        Customer c2 = new Customer(1002, "Customer 2");
        System.out.println(c2.hashCode());                              // return the reference address to the object
    }
}
