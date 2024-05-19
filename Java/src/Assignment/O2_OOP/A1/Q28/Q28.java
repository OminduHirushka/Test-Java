package Assignment.O2_OOP.A1.Q28;

class MyClass {
    int x;
    static int y;
}

public class Q28 {
    public static void main(String[] args) {
        MyClass c1 = new MyClass();
        MyClass c2 = new MyClass();
        MyClass c3 = new MyClass();
        c1.x = 1;
        c1.y = 2;
        c2.x = 10;
        c2.y = 20;
        c3.x = 100;
        c3.y = 200;
        System.out.println(c1.x + " " + c1.y + " " + c2.x + " " + c2.y + " " + c3.x + " " + c3.y);
    }
}
