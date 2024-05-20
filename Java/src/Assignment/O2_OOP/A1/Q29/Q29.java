package Assignment.O2_OOP.A1.Q29;

class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Invalid length. Length should be a floating-point number larger than 0.0 and less than 20.0");
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Invalid width. Width should be a floating-point number larger than 0.0 and less than 20.0");
        }
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public double calculateArea() {
        return length * width;
    }
}

public class Q29 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("Default Length: " + rectangle.getLength());
        System.out.println("Default Width: " + rectangle.getWidth());
        System.out.println("Default Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Default Area: " + rectangle.calculateArea());

        System.out.println("==========================================");

        rectangle.setLength(1.8);
        rectangle.setWidth(0.7);
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
