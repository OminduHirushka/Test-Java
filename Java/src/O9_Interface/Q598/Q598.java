package O9_Interface.Q598;

interface Vehicle {
    void park();

    void start();

    /*
    public void stop() {                      // Illegal ( An interface doesn't have a body )
        // body
    }
    */
}

/*
class Car implements Vehicle {
                                               // Illegal ( To implement an interface, the subclass needs to override all methods )
}
*/

/*
class Jeep implements Vehicle {                // Illegal ( To implement an interface, the subclass needs to override all methods )
    public void start() {
        // body
    }
}
*/

/*
class Van implements Vehicle {                 // Illegal ( To implement an interface, the subclass needs to override all methods )
    public void park() {
        // body
    }
}
*/

class Bus implements Vehicle {                 // Legal ( All methods are overrode )
    public void start() {
        // body
    }

    public void park() {
        // body
    }
}

abstract class Bike implements Vehicle {        // Legal (Subclass is an 'abstract' class )

}

public class Q598 { }
