package fundamentals;

public class Person {

    //Attribute of Person
    String firstName;
    String lastName;
    char sex;
    int age;

    Person(String firstName, String lastName, char sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;

        System.out.println(firstName + " " + lastName + " Joined!");
    }
}
