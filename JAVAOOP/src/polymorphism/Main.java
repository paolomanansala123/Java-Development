package polymorphism;

//POLYMORPHISM
//      -> 'Poly' means MANY and 'Morph' means 'Take Different Forms'.
//      -> It is an OOP technique that utilize inheritance to create 1 class
//          and make several classes inherit from that class so that it can take many forms.

public class Main {
    public static void main(String[] args) {
        //Animal d = new Dog();
        //Animal c = new Cat();
        //d.makeSound();
        //c.makeSound();

        Enemy we = new WeakEnemy();
        Enemy se = new StrongEnemy();

        we.dialog();
        we.showStats();
        se.dialog();
        se.showStats();



    }
}
