package com.multipleclassesOOP.basicOOP;

public class tuna {

    //------------------------------------------------------------------------------------------------
    //#2
//    public void simpleMessage(String name) {
//        System.out.println("Hello " + name);
//    }


    //------------------------------------------------------------------------------------------------
    //#3
//    private String girlName; //when you use a private variable only methods inside the class can use it.
//
//    public void setName(String name) { // void means no returns.
//        girlName = name;
//    }
//
//    public String getName() { // This method is gonna return a string.
//        return girlName;
//    }
//
//    public void saying() {
//        System.out.printf("Your first gf was %s", getName());
//    }

    //------------------------------------------------------------------------------------------------
    //#4
    private String girlName; //when you use a private variable only methods inside the class can use it.
    public tuna(String name) { //Constructor
        girlName = name;
    }
    public void setName(String name) { // void means no returns.
        girlName = name;
    }
    public String getName() { // This method is gonna return a string.
        return girlName;
    }
    public void saying() {
        System.out.println("Your first gf was " + getName());
    }

}
