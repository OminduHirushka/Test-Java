package Assignment.O2_OOP.A1.Q19;

class Item {
    int code;

    Item(int i) {
        code = i;
        // System.out.println(code);
    }

    void printCode(int code) {
        System.out.println("Code : " + code);
    }
}

public class Q19 {
    public static void main(String[] args) {
        Item t1 = new Item(2001);
        t1.printCode(3001);
    }
}
