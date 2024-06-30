package O18_Enumerations.Q671;

/*
class Color {
    public static final String RED = "Red";
    public static final String GREEN = "Green";
    public static final String BLUE = "Blue";
    public static final String BLACK = "Black";
}
*/

enum Color {
    RED, GREEN, BLACK, BLUE;              // Enum Objects
}

public class Q671 {
    public static void main(String[] args) {
        System.out.println(Color.RED);

        Color c1;                           // Create an enum reference type 'Color'
        c1 = Color.RED;
        System.out.println(c1);             // c1.toString() --> RED
    }
}
