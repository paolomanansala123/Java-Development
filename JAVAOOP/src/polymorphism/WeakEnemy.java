package polymorphism;

public class WeakEnemy extends Enemy{

    //Constructor
    WeakEnemy() {
        name = "Weak Enemy";
        hp = 50;
    }

    void dialog() {
        System.out.println(name + ", I am Weak.");
    }


}
