package O19_Generics.Q678;

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

public class Q678 {
    public static void main(String[] args) {
        List list = new List();
        list.add(100);
        System.out.println(list.get(0));
    }
}
