package arrayOfObjects;

public class Employee {
    String firstName, lastName;
    String jobTitle;

    Employee(String firstName, String lastName, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
    }

    void introduceSelf() {
        System.out.println("Hello! " + " I am " + firstName + " " + lastName + " working as a " + jobTitle);
        System.out.println(" ");
    }
}
