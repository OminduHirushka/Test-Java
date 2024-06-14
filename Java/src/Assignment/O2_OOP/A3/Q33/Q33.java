package Assignment.O2_OOP.A3.Q33;

class Customer {
    String name = "Danapala";
    static String city = "Galle";

    public Customer() {
        printCustomer();
    }

    void printCustomer() {
        System.out.println("Super : " + name + " -> " + city);
    }
}

class RegularCustomer extends Customer {
    String name = "Somapala";
    static String city = "Panadura";

    void printCustomer() {
        System.out.println("Sub : " + name + " -> " + city);
    }
}

public class Q33 {
    public static void main(String[] args) {
        new RegularCustomer();
    }
}
