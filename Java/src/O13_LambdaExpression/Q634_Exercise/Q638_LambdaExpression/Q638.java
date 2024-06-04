package O13_LambdaExpression.Q634_Exercise.Q638_LambdaExpression;

interface Math {
    public int operation(int num1, int num2);
}

public class Q638 {
    public static void main(String[] args) {
        int a = 100, b = 50;
        int result;

        Math add = (num1, num2) -> num1 + num2;
        Math sub = (num1, num2) -> num1 - num2;
        Math div = (num1, num2) -> num1 / num2;
        Math mul = (num1, num2) -> num1 * num2;

        System.out.println(a + " + " + b + " = " + add.operation(a, b));
        System.out.println(a + " - " + b + " = " + sub.operation(a, b));
        System.out.println(a + " / " + b + " = " + div.operation(a, b));
        System.out.println(a + " * " + b + " = " + mul.operation(a, b));
    }
}
