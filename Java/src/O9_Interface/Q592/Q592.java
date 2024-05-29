package O9_Interface.Q592;

interface Vehicle {
    public void park();
}

class Car implements Vehicle {
    public void park() {
        System.out.println("Car Parking");
    }
}

public class Q592 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.park();
    }
}
