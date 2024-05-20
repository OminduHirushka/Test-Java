package O6_Inheritance.Q544;

class Vehicle {
    public void park() {
        System.out.println("Vehicle Parking");
    }
}

class Car extends Vehicle {
    public void park() {                                                    // Method Overriding
        System.out.println("Car Parking");
    }

    public void park(int location) {                                        // Method Overloading
        System.out.println("Car Parking : " + location);
    }
}

public class Q544 {
    public static void main(String[] args) {
        Car car = new Car();
        car.park();
        car.park(10);
    }
}
