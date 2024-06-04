package O13_LambdaExpression.Q627;

interface Vehicle {
    void park();
}

public class Q627 {
    public static void main(String[] args) {
        Vehicle v1 = () -> System.out.println("Car parking --> Lambda");              // If there is only one statement
        v1.park();
    }
}
