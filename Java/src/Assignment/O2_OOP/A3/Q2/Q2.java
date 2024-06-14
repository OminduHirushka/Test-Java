package Assignment.O2_OOP.A3.Q2;

class Player {
    String name = "Cristiano";
    int age = 39;
    String country = "Portugal";

    public void bio() {
        System.out.println(name + " is a " + age + " old player form " + country);
    }
}

class Club extends Player {
    String club = "Al Nassr";

    public void card() {
        System.out.println(super.name + " is a " + super.age + " old player form " + super.country + ". He is playing for " + club + ".");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Player player = new Player();
        player.bio();

        Club club = new Club();
        club.card();
    }
}
