package O13_LambdaExpression.Q626;

interface Vehicle {
    void park();
}

public class Q626 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle() {
            public void park() {
                System.out.println("Car Parking");
            }
        };
        v1.park();

        Vehicle v2 = () -> {
            System.out.println("Car Parking --> Lambda Expression");
        };
        v2.park();
    }
}
