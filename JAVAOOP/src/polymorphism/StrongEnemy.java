package polymorphism;

public class StrongEnemy extends Enemy{

    StrongEnemy() {
        name = "Strong Enemy";
        hp = 100;
    }

    void dialog() {
        System.out.println(name + ", I am Strong.");
    }
}
