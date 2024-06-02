package O11_MultipleInheritanceWithInterfaces.Q611;

interface Vehicle {
    public void park();

    default public void start() {
        System.out.println("Vehicle Start");
    }

    public static void stop() {
        System.out.println("Vehicle Stop");
    }                                               // Legal ( A 'static' method in a Interface can include a body )
}

class Car implements Vehicle {
    public void park() {
        System.out.println("Car Parking");
    }
}

public class Q611 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();
        v1.start();
        Vehicle.stop();
    }
}
