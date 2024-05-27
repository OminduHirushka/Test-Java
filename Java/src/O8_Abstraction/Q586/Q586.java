package O8_Abstraction.Q586;

abstract class Vehicle {
    abstract public void park();
}

class Car extends Vehicle {
    public void park() {
        System.out.println("Car Parking");
    }
}

public class Q586 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();
    }
}
