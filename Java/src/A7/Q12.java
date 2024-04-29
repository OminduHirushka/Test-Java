package A7;

public class Q12 {
    public static void main(String[] args) {
        int[] array;

        array = new int[5];
        array = new int[10];
        array = new int[-5];                        // Compiled. But a Run-Time Error
        // array = {10, 20, 30, 40, 50};            // Illegal
        array = new int[]{10, 20, 30, 40, 50};
        array = new int[]{};
    }
}
