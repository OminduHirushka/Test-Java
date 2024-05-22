package O6_Inheritance.Q552;

class Vehicle {
    int year = 2000;

    public void park() {
        System.out.println("Vehicle Parking");
    }
}

class Car extends Vehicle {
    int year = 2005;

    public void park() {
        System.out.println("Car Parking");
    }
}

public class Q552 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();                                              // Compile from vehicle, run from Car      --> 'park()' is a Method - Dynamic Methods (Legal)
        System.out.println("Year : " + v1.year);                // Compile from vehicle, run from Vehicle  --> 'year' is an ATTRIBUTE - Dynamic Attributes (Not existing)
    }
}
