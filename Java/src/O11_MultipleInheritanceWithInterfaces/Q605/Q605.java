package O11_MultipleInheritanceWithInterfaces.Q605;

class Animal {

}

interface Lion {

}

class Dog extends Animal implements Lion {

}                                                            // Legal ( Multiple Inheritance )

public class Q605 {
    public static void main(String[] args) {
        System.out.println("Working");
    }
}
