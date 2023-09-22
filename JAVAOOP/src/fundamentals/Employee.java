package fundamentals;


//Method Overloading or Overloading Contructors
// - Is a OOP technique used to create multiple contructors with different arguments.
// - It is used to cope up with the needs of a certain instance of an object.
public class Employee {
    private String firstName, lastName;
    private String title, address, sex;
    private int age;

    Employee() {

    }

    Employee(String firstName,
             String lastName,
             String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        address = "N/A";
        sex = "N/A";
        age = 0;
    }
    Employee(String firstName,
             String lastName,
             String title,
             String address,
             String sex,
             int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }


}
