package O8_Abstraction.Q585;

abstract class Vehicle {
    abstract public void park();
}


public class Q585 {
    public static void main(String[] args) {
        Vehicle v1;                                 // Legal
        // v1 = new Vehicle();                      // Illegal ( park(), the abstract method doesn't have a body )
    }
}
