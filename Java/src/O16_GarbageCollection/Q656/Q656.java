package O16_GarbageCollection.Q656;

class MyClass {
    long[] ar = new long[100000];

    public void finalize() {
        System.out.println("Deleted....");
    }
}

public class Q656 {
    public static void main(String args[]) {
        System.out.println("Start Main");

        new MyClass();
        new MyClass();
        new MyClass();

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }

        System.out.println("End Main");
    }
}
