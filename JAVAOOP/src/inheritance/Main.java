package inheritance;


//INHERITANCE -> Is an OOP technique used to inherit attributes and methods from one class to another.
//       **SUBCLASS   (Child Class)      -> The class who will inherit the attributes and methods from a superclass.
//       **SUPERCLASS (Parent Class)     -> The class where we will inherit attributes and methods.
//       **EXTENDS                       -> Used after the class name and it indicates that the certain class will inherit from another class.
//                                          <modifier class subClassName extends superClassName {Attributes and Methods}>
//       **SUPER      (For Child Class)  -> This keyword can only be used by a subclass and it is used to call their
//                                          superclass so we can access their constructors, attribute and methods.
//OVERRIDING CONSTRUCTORS -> Is an OOP concept wherein you need to create a contructor for the subclass and call the constructor of the superclass using 'SUPER' keyword.
//OVERRIDING METHODS      -> To retain the functionality from the superclass use the 'SUPER' keyword w/ the Method name.

public class Main {
    public static void main(String[] args) {
        Person p = new Person("David", "Male", 18);
        Toddler t = new Toddler("Paolo", "Male", 20, "Peek-a-Boo");
        Kid k = new Kid("Jaymar", "Male", 7, "Mario", 4);

        //We can also instantiate subclass using the super class since subclass inherits all the traits of the superclass.
        //This idea is called 'POLYMORPHISM'.
        //Person p = new Person("David", "Male", 18);
        //Person t = new Toddler("Paolo", "Male", 20, "Peek-a-Boo");
        //Person k = new Kid("Jaymar", "Male", 7, "Mario", 4);
    }
}
