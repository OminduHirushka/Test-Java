package O13_LambdaExpression.Q628;

interface Vehicle {
    void park();
}

public class Q628 {
    public static void main(String[] args) {
        Vehicle v1 = () -> {
            System.out.println("Car parking... Lambda 1");                      // If there are more than one statement
            System.out.println("Car parking... Lambda 2");
        };
        v1.park();
    }
}
