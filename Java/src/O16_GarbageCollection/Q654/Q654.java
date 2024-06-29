package O16_GarbageCollection.Q654;

class MyClass {
    long[] ar = new long[100000];

    public void finalize() {
        System.out.println("Deleted....");
    }
}

public class Q654 {
    public static void main(String args[]) {
        System.out.println("Start Main");

        for (int i = 0; i < 100000; i++) {
            System.out.println("i : " + i);
            new MyClass();
        }

        System.out.println("End Main");
    }
}
