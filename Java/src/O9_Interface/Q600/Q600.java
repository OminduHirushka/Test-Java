package O9_Interface.Q600;

interface Vehicle {
    void park();
}

class Car implements Vehicle {
    public void park() {
        System.out.println("Car parking");
    }
}

public class Q600 {
    public static void main(String[] args) {
        Vehicle v1;                                 // Legal
        v1 = new Car();                             // Legal
    }
}

// Car implements Vehicle
// Car -> Sub Class
// Vehicle -> Super interface
