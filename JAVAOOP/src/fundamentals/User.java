package fundamentals;


//Encapsulation is used to add extra security on your code. It hides certain data so that the user cannot access those data.
//If you want to access the attribute of a certain class, getter and setters is being created inside the said class.
//Getters and Setters are encapsulated variables.
public class User {
    private int userID;
    private String username;
    private String firstName, lastName;

    User(int userID, String username, String firstName, String lastName) {
        this.userID = userID;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    int getUserID() {
        return userID;
    }

    String getUsername() {
        return username;
    }

    void setFirstName(){
        this.firstName = firstName;
    }

    String getFirstName() {
        return firstName;
    }

    void setLastName(){
        this.lastName = lastName;
    }

    String getLastName() {
        return lastName;
    }

}
