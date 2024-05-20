package Assignment.O2_OOP.A1.Q42;

class Box {
    int length;
    int width;
    int height;

    static {
        System.out.println("Box is loaded into memory");
    }

    {
        System.out.println("A box object is created..");
    }
}

public class Q42 {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        Box b3 = new Box();
    }
}
