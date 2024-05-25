package O7_Method.String_toString.Q562;

class Customer {
    private int code;
    private String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }

    /* --How 'toString()' works--

    public String toString() {
        int hashCode = hashCode();
        String hex = Integer.toHexString(hashCode);
        return getClass().getName() + "@" + hex;
    }

    */
}

class Example {
    public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Customer 1");
        System.out.println(c1);                                         // Compiler inserts "toString()"
        System.out.println(c1.toString());
    }
}
