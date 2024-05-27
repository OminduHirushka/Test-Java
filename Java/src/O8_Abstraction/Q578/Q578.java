package O8_Abstraction.Q578;

abstract class Vehicle {
    abstract public void park();
}

class Car extends Vehicle {
    public void park() {
        System.out.println("Car Parking");
    }
}

class Bus extends Vehicle {
    public void park() {
        System.out.println("Bus Parking");
    }
}

class Van extends Vehicle {
    public void park() {
        System.out.println("Van Parking");
    }
}

public class Q578 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bus(), new Van()};
        for (Vehicle vehicle : vehicles) {
            vehicle.park();
        }
    }
}
