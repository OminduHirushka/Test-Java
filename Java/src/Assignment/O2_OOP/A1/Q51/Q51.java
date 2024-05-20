package Assignment.O2_OOP.A1.Q51;

class Item {
    private int code;

    Item(int code) {
        this.code = code;
    }

    void setCode(Item item) {
        this.code = item.code;
    }

    void printCode() {
        System.out.println("code : " + code);
    }
}

public class Q51 {
    public static void main(String[] args) {
        Item item1 = new Item(1001);
        item1.printCode();
        Item item2 = new Item(2002);
        item2.setCode(item1);
        item2.printCode();
    }
}
