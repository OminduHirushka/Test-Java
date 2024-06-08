package O15_SingletonDesignPattern.Step03;

class A {
    private static A a;

    private A() {

    }

    public static A getInstance() {
        if (a == null) {
            a = new A();
        }
        return a;
    }

    public void myMethod() {
        System.out.println("myMethod() in " + this);
    }
}

public class Q650 {
    public static void main(String args[]) {
        A a1 = A.getInstance();
        a1.myMethod();

        A a2 = A.getInstance();
        a2.myMethod();
    }
}
