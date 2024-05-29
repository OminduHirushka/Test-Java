package O9_Interface.Q596;

interface Vehicle {
    void park();                            // Legal ( Implicitly public )

    abstract public void start();           // Legal ( Implicitly public )

    // protected void stop();               // Illegal
}

public class Q596 { }
