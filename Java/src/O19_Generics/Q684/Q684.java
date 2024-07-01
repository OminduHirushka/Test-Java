package O19_Generics.Q684;

class List<T extends Number> {
    private T[] items = (T[]) new Number[10];
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

public class Q684 {
    public static void main(String[] args) {
        List<Number> numberList = new List<>();
        List<Integer> integerList = new List<>();
        List<Double> doubleList = new List<>();

        // List<Customer> custList = new List<>();      // Illegal ( type should be 'number' or a subclass of it )
    }
}
