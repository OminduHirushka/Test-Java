package Assignment.O2_OOP.A1.Q9;

class Box {
    int length;
    int width;
    int height;

    Box(int l, int w, int h) {
        System.out.println("Parameterized constructor");
        length = l;
        width = w;
        height = h;
    }

    void printVolume() {
        int volume;
        volume = length * width * height;
        System.out.println("Volume : " + volume);
    }
}

public class Q9 {
    public static void main(String[] args) {
        Box b1 = new Box(5, 4, 3);
        b1.printVolume();
        Box b2 = new Box(12, 5, 3);
        b2.printVolume();
    }
}
