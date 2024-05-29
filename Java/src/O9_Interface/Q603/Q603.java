package O9_Interface.Q603;

interface Vehicle {
    abstract public void park();
}

class Car implements Vehicle {
    public void park() {
        System.out.println("Car Parking");
    }
}

class Bus implements Vehicle {
    public void park() {
        System.out.println("Bus Parking");
    }
}

class Van implements Vehicle {
    public void park() {
        System.out.println("Van Parking");
    }
}

public class Q603 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bus(), new Van()};
        for (Vehicle vehicle : vehicles) {
            vehicle.park();
        }
    }
}
