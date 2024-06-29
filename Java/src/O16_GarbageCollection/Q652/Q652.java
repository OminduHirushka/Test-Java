package O16_GarbageCollection.Q652;

class MyClass {
    long[] ar = new long[100000];
}

public class Q652 {
    public static void main(String args[]) {
        System.out.println("Start Main");

        for (int i = 0; i < 100000; i++) {
            System.out.println("i : " + i);
            new MyClass();
        }

        System.out.println("End Main");
    }
}
