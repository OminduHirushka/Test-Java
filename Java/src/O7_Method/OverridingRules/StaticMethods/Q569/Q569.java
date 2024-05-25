package O7_Method.OverridingRules.StaticMethods.Q569;

//------------------------------------------------------Dynamic Method Dispatch effects to the 'instance' methods------------------------------------------------==-----------------------

class Vehicle {
    public void park() {
        System.out.println("Vehicle Parking");
    }
}

class Car extends Vehicle {
    public void park() {
        System.out.println("Car Parking");
    }
}

public class Q569 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();
    }
}

