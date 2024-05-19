package Assignment.O2_OOP.A1.Q31;

class Test {
    int x = 10;
    static int y = 20;

    Test(int i, int j) {
        x = i;
        y = j;
    }

    void printXY() {
        System.out.print(x + " " + y + " ");
    }
}

public class Q31 {
    public static void main(String[] args) {
        Test t1 = new Test(1, 2);
        Test t2 = new Test(10, 20);
        Test t3 = new Test(100, 200);
        t1.printXY();
        t2.printXY();
        t3.printXY();
    }
}
