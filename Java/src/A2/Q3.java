package A2;

public class Q3 {
    public static void main(String[] args) {
        int size = 5;

        // Outer loop for rows
        for (int i = 1; i <= size; i++) {
            // Inner loop for columns
            for (int j = 1; j <= size; j++) {
                if (j == i || j == size - i + 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*  "); // Print spaces for the pattern
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
