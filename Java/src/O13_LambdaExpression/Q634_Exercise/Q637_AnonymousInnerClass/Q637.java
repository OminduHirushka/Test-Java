package O13_LambdaExpression.Q634_Exercise.Q637_AnonymousInnerClass;

interface Math {
    public int operation(int num1, int num2);
}

public class Q637 {
    public static void main(String[] args) {
        int a = 100, b = 50;
        int result;

        Math add = new Math() {
            public int operation(int num1, int num2) {
                return num1 + num2;
            }
        };

        Math sub = new Math() {
            public int operation(int num1, int num2) {
                return num1 - num2;
            }
        };

        Math div = new Math() {
            public int operation(int num1, int num2) {
                return num1 / num2;
            }
        };

        Math mul = new Math() {
            public int operation(int num1, int num2) {
                return num1 * num2;
            }
        };

        System.out.println(a + " + " + b + " = " + add.operation(a, b));
        System.out.println(a + " - " + b + " = " + sub.operation(a, b));
        System.out.println(a + " / " + b + " = " + div.operation(a, b));
        System.out.println(a + " * " + b + " = " + mul.operation(a, b));
    }
}
