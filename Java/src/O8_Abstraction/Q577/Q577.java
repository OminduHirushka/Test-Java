package O8_Abstraction.Q577;

class Vehicle {
        // public void park();                      // Illegal
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

public class Q577 {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car(), new Bus(), new Van()};
        for (Vehicle vehicle : vehicles) {
            // vehicle.park();
        }
    }
}
