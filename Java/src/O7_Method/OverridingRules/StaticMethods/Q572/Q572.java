package O7_Method.OverridingRules.StaticMethods.Q572;

//------------------------------------------------------Dynamic Method Dispatch not effects to the 'static' methods-----------------------------------------------------------------------

class Vehicle {
    public static void park() {
        System.out.println("Vehicle Parking");
    }
}

class Car extends Vehicle {
    public static void park() {
        System.out.println("Car Parking");
    }
}

public class Q572 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();
    }
}
