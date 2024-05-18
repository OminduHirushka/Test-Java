package Assignment.O2_OOP.A1.Q6;

class Box {
    int length;
    int width;
    int height;

    void printVolume() {
        int volume;
        volume = length * width * height;
        System.out.println("Volume : " + volume);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.printVolume();
        System.out.println("length of box : " + b1.length);
        System.out.println("width of box : " + b1.width);
        System.out.println("height of box : " + b1.height);
    }
}
