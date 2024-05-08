package O2_Arrays.Array;

public class Ex6 {
    public static void printArray(int marks[]){
        System.out.print("[");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+ ", ");
        }
        System.out.println("\b\b]");
    }

    public static void main(String[] args) {
        int marks[]= {67,35,67,89,78,69,85,67,80,45,77,80,90,91,34,56};
        printArray(marks);
    }
}
