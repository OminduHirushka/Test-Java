package O19_Generics.Q679;

class List {
    private int[] items = new int[10];
    private int count = 0;

    public void add(int item) {
        items[count] = item;
        count++;
    }

    public int get(int index) {
        return items[index];
    }
}

class Customer {
}

class CustomerList {
    private Customer[] items = new Customer[10];
    private int count = 0;

    public void add(Customer item) {
        items[count++] = item;
    }

    public Customer get(int index) {
        return items[index];
    }
}

public class Q679 {
    public static void main(String[] args) {
        List list = new List();
        list.add(100);
        System.out.println(list.get(0));

        CustomerList customerList = new CustomerList();
        customerList.add(new Customer());
        System.out.println(customerList.get(0));
    }
}
