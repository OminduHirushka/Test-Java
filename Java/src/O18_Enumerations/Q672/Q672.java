package O18_Enumerations.Q672;

enum Color {
    RED, GREEN, BLACK, BLUE;              // Enum Objects
}

public class Q672 {
    public static void main(String[] args) {
        // Color c1 = new Color();          // Error
        Color c1 = Color.RED;               // Legal
    }
}
