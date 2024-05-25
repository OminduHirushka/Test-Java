package O7_Method.int_hashCode.Q560;

class Customer {
    private int code;
    private String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }
}

public class Q560 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Customer 1");
        System.out.println(c1.hashCode());                              // return the reference address to the object
        System.out.println(Integer.toHexString(c1.hashCode()));         // return the hexadecimal value of the reference address to the object
    }
}
