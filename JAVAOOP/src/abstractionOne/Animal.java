package abstractionOne;

public abstract class Animal {
    String name;
    abstract void makeSound();
    abstract void walk();


    //But you can still add another function that is not abstract in abstract class.
    void showName(){
        System.out.println("Name: " + name);
    }

    void setName(String name) {
        this.name = name;
    }

}
