package O2_Arrays.Object_Arrays;

class Student4 {
    int id;
    String name;
    int sub1;
    int sub2;

    Student4(int id, String name, int sub1, int sub2) {
        this.id = id;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void print(){
        System.out.println(id + " " + name + " " + sub1+ " " + sub2);
    }
}

public class Q458 {
    public static void main(String[] args) {
        Student4[] studentAr = new Student4[5];
        studentAr[0] = new Student4(1, "Student-1 : ", 78, 56);
        studentAr[1] = new Student4(2, "Student-2 : ", 56, 98);
        studentAr[2] = new Student4(3, "Student-3 : ", 58, 86);
        studentAr[3] = new Student4(4, "Student-4 : ", 21, 57);
        studentAr[4] = new Student4(5, "Student-5 : ", 98, 78);

        for (Student4 student : studentAr) {
            student.print();
        }
    }
}
