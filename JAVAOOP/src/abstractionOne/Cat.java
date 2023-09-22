package abstractionOne;

public class Cat extends Animal{

    void makeSound() {
        System.out.println("Meow!");
    }

    void walk() {
        System.out.println(name + " is now walking!");
    }
}
