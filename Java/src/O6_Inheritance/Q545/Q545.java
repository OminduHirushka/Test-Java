package O6_Inheritance.Q545;

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

public class Q545 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();
    }
}
