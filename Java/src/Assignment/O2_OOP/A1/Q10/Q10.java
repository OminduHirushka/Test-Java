package Assignment.O2_OOP.A1.Q10;

class Box {
    int length;
    private int width;
    int height;
}

public class Q10 {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println("length of box : " + b1.length);
        // System.out.println("width of box : " + b1.width);                        // 'width' is a private variable.
        System.out.println("height of box : " + b1.height);
    }
}
