package Assignment.O2_OOP.A1.Q55;

class Box {
    private int length;
    private int width;
    private int height;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void printVolume() {
        System.out.println("Volume: " + getVolume());
    }

    Box() {
        this.length = 0;
        this.width = 0;
        this.height = 0;
    }

    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(Box b) {
        this.length = b.length;
        this.width = b.width;
        this.height = b.height;
    }

    Box(int sideLength) {
        this.length = sideLength;
        this.width = sideLength;
        this.height = sideLength;
    }

    public void setDimension(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void setDimension(Box b) {
        this.length = b.length;
        this.width = b.width;
        this.height = b.height;
    }

    public void setDimension(int sideLength) {
        this.length = sideLength;
        this.width = sideLength;
        this.height = sideLength;
    }

    public int getVolume() {
        return this.length * this.width * this.height;
    }

    public Box getCopy() {
        return new Box(this);
    }
}

public class Q55 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setLength(12);
        b1.setWidth(5);
        b1.setHeight(3);
        b1.printVolume();
        b1.setDimension(120, 50, 30);
        System.out.println("Volume " + b1.getVolume());

        Box b2 = new Box(4, 2, 3);
        b2.printVolume();

        Box b3 = new Box(b2);
        //copy dimensions of b2 into b3
        b3.printVolume();

        Box b4 = new Box(10);   // length for a square cube
        b4.printVolume();

        Box b5 = new Box();
        b5.setDimension(12); // length for a square cube
        b5.printVolume();

        Box b6 = new Box();
        b6.printVolume();
        b6.setDimension(b1);
        //copy dimensions of b1 into b6
        b6.printVolume();

        Box b7 = b3.getCopy();
        b7.printVolume();
    }
}
