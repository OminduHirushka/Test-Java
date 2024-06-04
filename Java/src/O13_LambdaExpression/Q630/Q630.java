package O13_LambdaExpression.Q630;

interface Vehicle {
    void park(int location);
}

public class Q630 {
    public static void main(String[] args) {
        Vehicle v1 = (x) -> {
            System.out.println("Car parking..." + x);
        };
        v1.park(1000);

        Vehicle v2 = (int location) -> {
            System.out.println("Car parking..." + location);
        };
        v2.park(100);
    }
}
