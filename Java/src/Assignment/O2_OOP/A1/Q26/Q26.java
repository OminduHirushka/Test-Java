package Assignment.O2_OOP.A1.Q26;

class Customer {
    private String id;
    private String name;

    public Customer() {
    }

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printCustomer() {
        System.out.println(id + " - " + name);
    }

    public void setCustomerDetail(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Q26 {
    public static void main(String[] args) {
        Customer c1;                                                                // Declare a variable c1 of type Customer
        c1 = new Customer("C001", "Danapala");                            // Create a new Customer object with id "C001" and name "Danapala"
        c1.printCustomer();                                                         // Print the details of c1

        Customer c2;                                                                // Declare a variable c2 of type Customer
        c2 = new Customer();                                                        // Create a new Customer object without providing initial values
        c2.setCustomerDetail("C002", "Gunapala");                         // Set the id and name of c2 to "C002" and "Gunapala"
        c2.printCustomer();                                                         // Print the details of c2

        Customer c3;                                                                // Declare a variable c3 of type Customer
        c3 = new Customer();                                                        // Create a new Customer object without providing initial values
        c3.setId("C003");                                                           // Set the id of c3 to "C003"
        c3.setName("Somapala");                                                     // Set the name of c3 to "Somapala"
        c3.printCustomer();                                                         // Print the details of c3
    }
}
