package O9_Interface.Q601;

interface Vehicle {
    int year = 2000;                // implicitly public, static, final

    void park();
}

public class Q601 {
    public static void main(String[] args) {
        System.out.println(Vehicle.year);                       // Legal
        // Vehicle.year = 2001;                                 // Illegal ( 'final' type )
    }
}
