package abstractionOne;

//ABSTRACTION -> It is an OOP technique that hides certain details and only shows the important informations.
//  It can be achieved in 2 ways:
//      **Abstract Classes (Uses Abstract Modifier)
//      **Interfaces       (Uses implements keyword)
//=====================================================================================================================
//      **Abstract Class      -> It cannot be instantiated, to access it you need to inherit it from another class.
//      **Abstract Methods    -> Can only be declared inside an abstract class it is a Method without body and it needs
//                               to be overriden in the subclass of the abstract class.

//ABSTRACTION USING CLASS
public class Main {
    public static void main(String[] args) {
        //Animal a = new Animal(); //ABSTRACT IDEA
        Animal d = new Dog();    //CONCRETE IDEA
        Animal c = new Cat();    //CONCRETE IDEA

        d.setName("Doggy");
        c.setName("Catty");

        d.showName();
        c.showName();

        d.walk();
        c.walk();
    }
}
