package O8_Abstraction.Q590;

class Animal {
    public void eat() {
        //
    }
}

abstract class Lion extends Animal {
    abstract public void eat();                     // Legal
}

class Dog extends Animal { }                        // Legal

// class Cat extends Lion { }                       // Illegal

public class Q590 { }
