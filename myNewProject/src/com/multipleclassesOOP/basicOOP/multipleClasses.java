package com.multipleclassesOOP.basicOOP;

public class multipleClasses {

    // https://www.youtube.com/watch?v=7MBgaF8wXls
    //1. Working with multiple classes.
//    public static void main(String[] args) {
//        tuna tunaObject = new tuna(); //Instantiate the tuna class.
//        tunaObject.simpleMessage();   //you can now use tunaObject as your new tuna.
//    }


    //2. Working with multiple classes with parameters.
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in); //Instantiate new scanner.
//        tuna tunaObject = new tuna(); //Instantiate new tuna class.
//
//        System.out.print("Enter your name here: ");
//        String name = input.nextLine();
//
//        tunaObject.simpleMessage(name);
//    }

    //3. Many Methods and Instances. Basics of getters and setters.
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        tuna tunaObject = new tuna();
//
//        System.out.println("Enter name of first gf here: ");
//        String temp = input.nextLine();
//
//        tunaObject.setName(temp);
//        tunaObject.saying();
//
//    }

    //4. Constructors
    public static void main(String[] args) {
        tuna tunaObject = new tuna("Kai");
        tuna tunaObject2 = new tuna("Erika");
        tunaObject.saying();
        tunaObject2.saying();
    }

}
