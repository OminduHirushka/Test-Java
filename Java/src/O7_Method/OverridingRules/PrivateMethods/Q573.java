package O7_Method.OverridingRules.PrivateMethods;

class Vehicle {
    private void park() {
        System.out.println("Vehicle Parking");
    }

    public void callPark() {
        park();
    }
}

class Car extends Vehicle {
    public void park() {
        System.out.println("Car Parking");
    }
}

public class Q573 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.callPark();
    }
}
