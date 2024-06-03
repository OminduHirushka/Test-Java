package O12_InterfaceAsAContract.Q621;

interface Vehicle {
    void park();
}

public class Q621 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle() {
            public void park() {
                System.out.println("Car Parking");
            }
        };

        v1.park();
    }
}
