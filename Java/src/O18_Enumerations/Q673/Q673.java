package O18_Enumerations.Q673;

enum Color {
    RED, GREEN, BLACK, BLUE;              // Enum Objects
}

public class Q673 {
    public static void main(String[] args) {
        Color[] colors = Color.values();

        for (Color color : colors) {
            System.out.println(color);
        }
    }
}
