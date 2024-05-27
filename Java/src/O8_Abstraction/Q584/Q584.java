package O8_Abstraction.Q584;

abstract class Vehicle{
    abstract public void park();
    abstract public void start();
    public void stop(){
        // body
    }
}

// class Car extends Vehicle{}                 // Illegal

/*
class Jeep extends Vehicle{                 // Illegal
    public void start(){
        // body
    }
}
*/

/*
class Van extends Vehicle{                  // Illegal
    public void park(){
        // body
    }
}
*/

class Bus extends Vehicle{                  // Legal
    public void start(){
        // body
    }

    public void park(){
        // body
    }
}

abstract class MB extends Vehicle{}         // Legal

public class Q584 {
    public static void main(String[] args) {

    }
}
