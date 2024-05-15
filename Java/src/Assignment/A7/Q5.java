package Assignment.A7;

public class Q5 {
    public static void main(String[] args) {
        // a
        int[] ar = {65, 78, 43, 89, 34, 56, 90, 23, 64, 71, 94, 29};

        // b
        System.out.println("Size of the array: " + ar.length);

        // c
        System.out.print("[");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println("\b\b]");

        // d
        System.out.print("[");
        for (int num : ar) {
            System.out.print(num + ", ");
        }
        System.out.println("\b\b]");

        // e
        System.out.print("[");
        for (int num : ar) {
            if (num % 2 != 0) {
                System.out.print(num + ", ");
            }
        }
        System.out.println("\b\b]");

        // f
        System.out.print("[");
        for (int num : ar) {
            if (num % 2 == 0) {
                System.out.print(num + ", ");
            }
        }
        System.out.println("\b\b]");
    }
}
