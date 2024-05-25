package O7_Method.OverridingRules.FinalMehods.Q576;

final class Vehicle {
    public void park() {
        System.out.println("Vehicle Parking");
    }
}

/*
class Car extends Vehicle {                                                // Illegal ( Can't EXTEND 'final' classes )
    public void park() {
        System.out.println("Car Parking");
    }
}
*/

public class Q576 {
    public static void main(String[] args) {}
}
