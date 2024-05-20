package Assignment;

public class Player {
    String name;
    int age;

    Player() {
        this.name = "Unknown";
        this.age = 0;
    }

    Player(String name) {
        this.name = name;
    }

    Player(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
