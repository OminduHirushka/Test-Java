package O7_Method.OverridingRules.StaticMethods.Q570;

class Vehicle {
    public void park() {
        System.out.println("Vehicle Parking");
    }
}

class Car extends Vehicle {
    /*
    public static void park(){                                    // Illegal ( Can't be 'static'. Must be 'instance' method )
        System.out.println("Car Parking");
    }
    */
}

public class Q570 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();
    }
}
