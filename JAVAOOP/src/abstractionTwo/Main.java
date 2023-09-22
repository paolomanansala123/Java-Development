package abstractionTwo;


//ABSTRACTION USING INTERFACE
//INTERFACE         -> It is a full Abstract Class that is implemented in other classes.
//                  -> Any method you declare would be an abstract method by default
//                      you can use the default modifier to create a method with body the method would be static.
//                  -> Any variable that you declare would be static and final.
//IMPLEMENTS KEYWORD-> Used after the class name so that we can implement an interface in that certain class.
//                  -> Implemented interface requires the class to override every method inside the interface.
//                  -> We can implement one or more interfaces in each class.
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Doggy");
        Bird b = new Bird("Birdy");
        Frog f = new Frog("Froggy");

        d.makeSound();
        b.makeSound();
        f.makeSound();

        d.walk();
        b.fly();
        f.swim();
        f.walk();
        b.walk();


    }
}
