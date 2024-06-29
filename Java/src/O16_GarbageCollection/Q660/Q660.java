package O16_GarbageCollection.Q660;

class MyClass {
    long[] ar = new long[100000];

    public void finalize() {
        System.out.println("Deleted....");
    }

    public void myMethod() {
        System.out.println("myMethod()");
    }
}

public class Q660 {
    public static void main(String args[]) {
        System.out.println("Start Main");

        int x = 100;
        if (x > 0) {
            MyClass c1 = new MyClass();
            c1.myMethod();
        }

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {

        }
        
        System.out.println("End Main");
    }
}
