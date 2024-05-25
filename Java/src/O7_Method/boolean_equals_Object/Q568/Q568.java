package O7_Method.boolean_equals_Object.Q568;

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

    public boolean equals(Object obj) {
        // return this.hashCode() == obj.hashCode();
        Customer customer = (Customer) obj;
        return this.code == customer.code;
    }
}

public class Q568 {
    public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Customer 1");
        Customer c2 = new Customer(1001, "Customer 1");
        Customer c3 = new Customer(1002, "Customer 2");
        Customer c4 = c1;

        System.out.println("c1 == c2 : " + c1.equals(c2));                  // true
        System.out.println("c1 == c3 : " + c1.equals(c3));                  // false
        System.out.println("c1 == c4 : " + c1.equals(c4));                  // true
    }
}