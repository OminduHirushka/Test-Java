package O2_Arrays.Array;

public class Ex4 {
    public static void main(String[] args) {
        int marks[] = {34,33,45,67,55,67,64,33,67,89,34,44,56,78,79};

        System.out.print("[");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+ ", ");
        }
        System.out.println("\b\b]");
    }
}
