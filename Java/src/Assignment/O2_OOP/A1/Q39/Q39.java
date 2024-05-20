package Assignment.O2_OOP.A1.Q39;

class Cylinder {
    private double length;
    private double radius;

    public Cylinder() {
        this.length = 1.0;
        this.radius = 1.0;
    }

    public Cylinder(double length, double radius) {
        this.length = length;
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * length;
    }

    public double calculateSurfaceArea() {
        double baseArea = Math.PI * Math.pow(radius, 2);
        double lateralSurfaceArea = 2 * Math.PI * radius * length;
        return 2 * baseArea + lateralSurfaceArea;
    }
}

public class Q39 {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();

        System.out.println("Default Cylinder:");
        System.out.println("Length: " + cylinder1.getLength());
        System.out.println("Radius: " + cylinder1.getRadius());
        System.out.println("Volume: " + cylinder1.calculateVolume());
        System.out.println("Surface Area: " + cylinder1.calculateSurfaceArea());

        System.out.println("=========================================");

        // Parameterized constructor
        Cylinder cylinder2 = new Cylinder(10.0, 5.0);

        System.out.println("Parameterized Cylinder:");
        System.out.println("Length: " + cylinder2.getLength());
        System.out.println("Radius: " + cylinder2.getRadius());
        System.out.println("Volume: " + cylinder2.calculateVolume());
        System.out.println("Surface Area: " + cylinder2.calculateSurfaceArea());

        System.out.println("=========================================");

        // Getters and Setters
        cylinder2.setLength(20.0);
        cylinder2.setRadius(7.0);

        System.out.println("Updated Parameterized Cylinder:");
        System.out.println("Length: " + cylinder2.getLength());
        System.out.println("Radius: " + cylinder2.getRadius());
        System.out.println("Volume: " + cylinder2.calculateVolume());
        System.out.println("Surface Area: " + cylinder2.calculateSurfaceArea());
    }
}
