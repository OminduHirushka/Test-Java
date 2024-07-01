package O19_Generics.Q682;

class List<T> {                                          // Type Parameter for Class
    private T[] items = (T[]) new Object[10];
    private int count = 0;

    public void add(T item) {
        items[count] = item;
        count++;
    }

    public T get(int index) {
        return items[index];
    }
}

class Customer {
}

public class Q682 {
    public static void main(String[] args) {
        List<Integer> list = new List<>();
        list.add(100);
        // list.add(new Customer());
        // list.add(new String("ABC"));
        System.out.println(list.get(0));

        List<Customer> custList = new List<>();
        custList.add(new Customer());
        // custList.add(100);
        System.out.println(custList.get(0));
    }
}
