package O18_Enumerations.Q675;

enum Color {
    RED, GREEN, BLACK, BLUE;              // Enum Objects
}

public class Q675 {
    public static void main(String[] args) {
        Color color = Color.valueOf("RED");
        System.out.println(color);
    }
}
