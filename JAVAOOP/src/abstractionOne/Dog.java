package abstractionOne;

public class Dog extends Animal{

    void makeSound() {
        System.out.println("Arf!");
    }

    void walk() {
        System.out.println(name + " is now Walking!");
    }
}
