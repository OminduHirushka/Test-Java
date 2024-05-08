package O2_Arrays.Object_Arrays;

class Student3 {
    int id;
    String name;
    int sub1;
    int sub2;
}

public class Q457 {
    public static void main(String[] args) {
        Student3[] studentAr = new Student3[5];
        studentAr[0] = new Student3();
        studentAr[1] = new Student3();
        studentAr[2] = new Student3();
        studentAr[3] = new Student3();
        studentAr[4] = new Student3();

        System.out.println(studentAr[0]);
        System.out.println(studentAr[1]);
        System.out.println(studentAr[2]);
        System.out.println(studentAr[3]);
        System.out.println(studentAr[4]);
    }
}
