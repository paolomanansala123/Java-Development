package polymorphism;

public class Enemy {

    String name;
    int hp;

    void dialog() {
        System.out.println("Please Override Me!");
    }

    void showStats() {
        System.out.println("Name: " + name);
        System.out.println("HP : " + hp);
    }
}
