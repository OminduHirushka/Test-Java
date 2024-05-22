package O6_Inheritance.Q553;

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

    public void mC() {
        int year = 2010;
        System.out.println("Local : " + year);                              // 'year' in mC() of Car.
        System.out.println("Car : " + this.year);                           // 'year' in park() of Car.
        System.out.println("Vehicle : " + super.year);                      // 'year' in park() of Vehicle.
    }
}

public class Q553 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.mC();
    }
}
