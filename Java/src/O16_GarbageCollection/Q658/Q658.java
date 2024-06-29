package O16_GarbageCollection.Q658;

class MyClass {
    long[] ar = new long[100000];

    public void finalize() {
        System.out.println("Deleted....");
    }
}

public class Q658 {
    public static void main(String args[]) {
        System.out.println("Start Main");

        MyClass c1 = new MyClass();
        // c1.
        // c1.
        // c1.

        c1 = new MyClass();                      // Re-assigned a new Object.

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }

        System.out.println("End Main");
    }
}
