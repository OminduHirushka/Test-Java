package O16_GarbageCollection.Q653;

class MyClass {
    long[] ar = new long[100000];
}

public class Q653 {
    public static void main(String args[]) {
        System.out.println("Start Main");

        MyClass[] myClasses = new MyClass[100000];

        for (int i = 0; i < 100000; i++) {
            System.out.println("i : " + i);
            myClasses[i] = new MyClass();
        }

        System.out.println("End Main");
    }
}
