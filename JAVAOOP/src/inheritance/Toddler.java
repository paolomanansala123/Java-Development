package inheritance;


//SUBCLASS (CHILD)
public class Toddler extends Person {

    String favoriteGame;

    //OVERRIDING CONSTRUCTOR
    Toddler(String name, String sex, int age, String favoriteGame) {
        super(name, sex, age); //This one is calling the constructor from the parent class.
        this.favoriteGame = favoriteGame;
    }

    void drink() {
        System.out.println("Drinking Milk!");
    }


    //OVERRIDING METHOD
    void checkStatus() {
        super.checkStatus();
        System.out.println("Favorite Game: " + favoriteGame);
        //We can add another functionalities.
    }
}
