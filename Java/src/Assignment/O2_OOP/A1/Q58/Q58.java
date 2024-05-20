package Assignment.O2_OOP.A1.Q58;

class MyClass {
    MyClass() {
        System.out.println("MyClass()");
    }

    MyClass(int i) {
        this(i, i);
        System.out.println("MyClass(int)");
    }

    MyClass(int i, int j) {
        this();
        System.out.println("MyClass(int,int)");
    }
}

public class Q58 {
    public static void main(String[] args) {
        MyClass c1 = new MyClass(100);
    }
}
