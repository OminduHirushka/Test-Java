package O16_GarbageCollection.Q659;

class MyClass {
    long[] ar = new long[100000];

    public void finalize() {
        System.out.println("Deleted....");
    }

    public void myMethod() {
        System.out.println("myMethod()");
    }
}

public class Q659 {
    public static void main(String args[]) {
        System.out.println("Start Main");

        new MyClass().myMethod();

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }

        System.out.println("End Main");
    }
}
