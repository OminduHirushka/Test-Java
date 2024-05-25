package O7_Method.Class_getClass;

class Customer {
    private int code;
    private String name;

    public Customer(int code, String name) {
        this.code = code;
        this.name = name;
    }
}

class Example {
    public static void main(String[] args) {
        Customer c1 = new Customer(1001, "Customer 1");

        Class templateObject = c1.getClass();                           // return the Template Object for "Customer"
        System.out.println(templateObject.getName());
    }
}

