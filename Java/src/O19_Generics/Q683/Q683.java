package O19_Generics.Q683;

class List<T> {
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

public class Q683 {
    public static void main(String[] args) {
        //----- Wrapper Classes -----//
            // byte -> Byte
            // short -> Short
            // int -> Integer
            // long -> Long
            // float -> Float
            // double -> Double
            // char -> Character
            // boolean -> Boolean

        List<Integer> list = new List<>();
        list.add(100);                          // --> Integer.valueOf(100);
        System.out.println(list.get(0));
    }
}
