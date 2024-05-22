package O6_Inheritance.Q554;

class Vehicle {
    public void park() {
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

public class Q554 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.callPark();

        Car c1 = new Car();
        c1.callPark();

        Vehicle vc1 = new Car();
        vc1.callPark();
    }
}
