package O18_Enumerations.Q676;

enum Color {
    RED, GREEN, BLACK, BLUE;              // Enum Objects

    Color() {
        System.out.println("Color()");
    }
}

public class Q676 {
    public static void main(String[] args) {
        Color color = Color.valueOf("RED");
        System.out.println(color);
    }
}
