package O7_Method.OverridingRules.FinalMehods.Q575;

class Vehicle {
    public final void park() {
        System.out.println("Vehicle Parking");
    }
}

class Car extends Vehicle {
    /*
    public void park() {                                                // Illegal ( Can't OVERRIDE 'final' methods )
        System.out.println("Car Parking");
    }
    */
}

public class Q575 {
    public static void main(String[] args) {}
}
