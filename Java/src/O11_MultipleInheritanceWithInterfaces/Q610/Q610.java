package O11_MultipleInheritanceWithInterfaces.Q610;

interface Vehicle {
    public void park();

    /*
    public void start() {
        System.out.println("Vehicle Start");
    }                                               // Illegal ( A 'final' method in a Interface can't include a body )
    */

    default public void start() {
        System.out.println("Vehicle Start");
    }                                               // Legal ( a 'default' method )
}

class Car implements Vehicle {
    public void park() {
        System.out.println("Car Parking");
    }
}

public class Q610 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();
        v1.start();
    }
}
