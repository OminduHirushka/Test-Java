package O2_Arrays.Array;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static int[] createAnArray(int length){
        int[] ar = new int[length];
        return ar;
    }

    public static void readMarks(int[] ar){
        Random input = new Random();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = input.nextInt(101);
        }
    }

    public static int findTotal(int[] ar){
        int total = 0;
        for (int i = 0; i < ar.length; i++) {
            total += ar[i];
        }
        return total;
    }

    public static int findMax(int[] ar){
        int max = 0;
        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        return max;
    }

    public static int findMin(int[] ar){
        int min = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (min > ar[i]) {
                min = ar[i];
            }
        }
        return min;
    }

    public static void printMarks(int[] ar){
        System.out.print("[");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+ ", ");
        }
        System.out.println("\b\b]");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of Student: ");
        final int N = scanner.nextInt();

        int[] marks = createAnArray(N);
        readMarks(marks);
        int total = findTotal(marks);
        int max = findMax(marks);
        int min = findMin(marks);
        printMarks(marks);
        System.out.println("Total: "+ total);
        System.out.println("Max: "+ max);
        System.out.println("Min: "+ min );
    }
}
