package O19_Generics.Q681;

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

public class Q681 {
    public static void main(String[] args) {
        List list = new List();

        list.add(100);                                      // --> Integer.valueOf(100);

        list.add(new Customer());

        list.add(new String("ABC"));

        int num = (int) list.get(0);                        // Explicitly Cast ( get --> int )
        System.out.println(num);

        // Customer cust = (Customer) list.get(2);          // java.lang.ClassCastException
    }
}
