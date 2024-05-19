package Assignment.O2_OOP.A1.Q40;

class Box {
    int length;
    int width;
    int height;

    static {
        System.out.println("Box is loaded into memory");
    }
}

public class Q40 {
    public static void main(String[] args) {
        Box b1 = new Box();
    }
}
