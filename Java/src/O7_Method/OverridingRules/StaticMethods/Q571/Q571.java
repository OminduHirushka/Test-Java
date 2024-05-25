package O7_Method.OverridingRules.StaticMethods.Q571;

class Vehicle {
    public static void park() {
        System.out.println("Vehicle Parking");
    }
}

class Car extends Vehicle {
    /*
    public void park() {                                    // Illegal ( Can't be 'instance'. Must be 'static' method. )
        System.out.println("Car Parking");
    }
    */
}

public class Q571 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();
    }
}
