package Assignment.O1_FOP.A7;

import java.util.*;

public class Q24 {
    // a
    public static void insert(int[] array, int number) {
        if (number <= 0) {
            System.out.println("Only positive numbers are allowed.");
            return;
        }
        if (array.length == 0) {
            array = new int[1];
            array[0] = number;
        } else {
            int[] newArray = Arrays.copyOf(array, array.length + 1);
            newArray[array.length] = number;
            array = newArray;
        }
    }

    // b
    public static void printList(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("\b\b]");
    }

    // c
    public static void remove(int[] array) {
        if (array.length > 0) {
            array = Arrays.copyOf(array, array.length - 1);
        } else {
            System.out.println("List is empty.");
        }
    }

    // d
    public static void remove(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.");
            return;
        }
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array = Arrays.copyOf(array, array.length - 1);
    }

    // e
    public static void insert(int[] array, int number, int index) {
        if (index < 0 || index > array.length) {
            System.out.println("Invalid index.");
            return;
        }
        if (number <= 0) {
            System.out.println("Only positive numbers are allowed.");
            return;
        }
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = number;
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }
        array = newArray;
    }

    // f
    public static int size(int[] array) {
        return array.length;
    }

    // g
    public static boolean isEmpty(int[] array) {
        return array.length == 0;
    }

    // h
    public static boolean isFull(int[] array) {
        return false;
    }

    // i
    public static void clear(int[] array) {
        Arrays.fill(array, 0);
    }

    // j
    public static void removeDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    remove(array, j);
                    j--;
                }
            }
        }
    }

    // k
    public static int search(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    // l
    public static boolean isExist(int[] array, int number) {
        return search(array, number) != -1;
    }

    public static void main(String[] args) {
        int[] array = new int[0];

        insert(array, 23);
        insert(array, 54);
        insert(array, 46);
        insert(array, 72);
        insert(array, 72);
        insert(array, 12);
        insert(array, 62);
        insert(array, 11);
        printList(array);

        remove(array);
        printList(array);

        remove(array, 3);
        printList(array);

        insert(array, 99, 2);
        printList(array);

        System.out.println("Size: " + size(array));
        System.out.println("Is empty? " + isEmpty(array));
        System.out.println("Is full? " + isFull(array));

        clear(array);
        printList(array);

        insert(array, 23);
        insert(array, 54);
        insert(array, 46);
        insert(array, 72);
        insert(array, 72);
        insert(array, 12);
        insert(array, 62);
        insert(array, 11);
        printList(array);

        removeDuplicates(array);
        printList(array);

        System.out.println("Index of 62: " + search(array, 62));
        System.out.println("Is 72 in the list? " + isExist(array, 72));
    }
}
