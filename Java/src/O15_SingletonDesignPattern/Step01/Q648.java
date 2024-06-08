package O15_SingletonDesignPattern.Step01;

class A {
    public A() {

    }

    public void myMethod() {
        System.out.println("myMethod() in " + this);
    }
}

public class Q648 {
    public static void main(String args[]) {
        A a1 = new A();
        a1.myMethod();

        A a2 = new A();
        a2.myMethod();
    }
}
