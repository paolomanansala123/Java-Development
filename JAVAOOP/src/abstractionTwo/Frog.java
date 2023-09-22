package abstractionTwo;

public class Frog implements Animal, WaterAnimal, LandAnimal{
    String name;

    Frog(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println(name + " says Ribbit!");
    }

    public void swim() {
        System.out.println(name + " is now Swimming!");
    }

    public void walk() {
        System.out.println(name + " is now Walking!");
    }
}
