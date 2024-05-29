package O8_Abstraction.Q584;

abstract class Vehicle {
    abstract public void park();

    abstract public void start();

    public void stop() {
        // body
    }
}

/*
class Car extends Vehicle {
                                           // Illegal ( To extend an abstract class, the subclass needs to override all 'abstract' methods )
}
*/

/*
class Jeep extends Vehicle {                // Illegal ( To extend an abstract class, the subclass needs to override all 'abstract' methods )
    public void start() {
        // body
    }
}
*/

/*
class Van extends Vehicle {                 // Illegal ( To extend an abstract class, the subclass needs to override all 'abstract' methods )
    public void park() {
        // body
    }
}
*/

class Bus extends Vehicle {                 // Legal ( All 'abstract' methods are overrode )
    public void start() {
        // body
    }

    public void park() {
        // body
    }
}

abstract class Bike extends Vehicle {        // Legal (Subclass is also an 'abstract' class )

}

public class Q584 {
    public static void main(String[] args) {

    }
}
