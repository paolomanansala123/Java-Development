package abstractionTwo;

public class Dog implements Animal, LandAnimal{

    String name;

    Dog(String name) {
        this.name = name;
    }


    public void makeSound() {
        System.out.println(name + " says Arf!");
    }

    public void walk() {
        System.out.println(name + " is now walking!");
    }
}
