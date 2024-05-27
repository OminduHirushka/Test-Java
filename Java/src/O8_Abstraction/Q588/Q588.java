package O8_Abstraction.Q588;

abstract class Vehicle {
    int year;

    Vehicle() {
        //
    }

    abstract Vehicle(int year);                     // Illegal

    abstract public void park();
}

public class Q588 { }
