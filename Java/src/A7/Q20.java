package A7;

public class Q20 {
    public static void printArray(int[] array) {
        //body
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[]{10, 20, 30, 40};
        int[] c = {10, 20, 30, 40};
        int[] d = {};

        printArray(a);
        printArray(b);
        printArray(c);
        printArray(d);
        // printArray(10, 20, 30, 40);
        // printArray({});
        printArray(new int[]{});
        printArray(new int[5]);
        // printArray([10, 20, 30, 40]);
        // printArray({10, 20, 30, 40});
        printArray(new int[]{10, 20, 30, 40});
    }
}
