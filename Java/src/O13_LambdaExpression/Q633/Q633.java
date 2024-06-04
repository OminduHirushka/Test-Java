package O13_LambdaExpression.Q633;

interface Vehicle {
    void park();

    default void start() {
        System.out.println("Default implementation");
    }
}

public class Q633 {
    public static void main(String[] args) {
        Vehicle v1 = () -> {
            System.out.println("Car Parking");
        };
        v1.park();
        v1.start();
    }
}
