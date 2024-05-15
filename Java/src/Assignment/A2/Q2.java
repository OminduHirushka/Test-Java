package Assignment.A2;

public class Q2 {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop to iterate through rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print * in each column
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
