package O13_LambdaExpression.Q631;

interface Vehicle {
    boolean park();
}

public class Q631 {
    public static void main(String[] args) {
        Vehicle v1 = () -> true;                      // This has only one statement

        // Vehicle v2 = () -> return true;            // Illegal ( If there is only one statement, it should include only the value )

        Vehicle v2 = () -> {
            //
            //
            //
            return true;
        };
    }
}
