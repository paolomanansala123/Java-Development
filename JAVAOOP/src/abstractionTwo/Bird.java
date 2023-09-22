package abstractionTwo;

public class Bird implements Animal{

    String name;

    Bird(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println(name + " says Chirp!");
    }

    public void fly() {
        System.out.println(name + " is now Flying!");
    }

    public void walk() {
        System.out.println(name + " is now Walking!");
    }
}
