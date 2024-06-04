package O13_LambdaExpression.Q634_Exercise.Q636_LocalInnerClass;

interface Math {
    public int operation(int num1, int num2);
}

public class Q636 {
    public static void main(String[] args) {
        class Addition implements Math {
            public int operation(int num1, int num2) {
                return num1 + num2;
            }
        }

        class Subtraction implements Math {
            public int operation(int num1, int num2) {
                return num1 - num2;
            }
        }

        class Division implements Math {
            public int operation(int num1, int num2) {
                return num1 / num2;
            }
        }

        class Multiplication implements Math {
            public int operation(int num1, int num2) {
                return num1 * num2;
            }
        }

        int a = 100, b = 50;
        int result;

        Addition add = new Addition();
        Subtraction sub = new Subtraction();
        Division div = new Division();
        Multiplication mul = new Multiplication();

        System.out.println(a + " + " + b + " = " + add.operation(a, b));
        System.out.println(a + " - " + b + " = " + sub.operation(a, b));
        System.out.println(a + " / " + b + " = " + div.operation(a, b));
        System.out.println(a + " * " + b + " = " + mul.operation(a, b));
    }
}
