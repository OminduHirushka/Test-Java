package O19_Generics.Q680;

class List {
    private Object[] items = new Object[10];
    private int count = 0;

    public void add(Object item) {
        items[count] = item;
        count++;
    }

    public Object get(int index) {
        return items[index];
    }
}

class Customer {
}

public class Q680 {
    public static void main(String[] args) {
        List list = new List();

        list.add(100);                              // --> Integer.valueOf(100);
        System.out.println(list.get(0));

        list.add(new Customer());
        System.out.println(list.get(1));

        list.add(new String("ABC"));
        System.out.println(list.get(2));
    }
}
