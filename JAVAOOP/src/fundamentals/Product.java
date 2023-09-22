package fundamentals;

public class Product {

    //Global Variables
    //Attribute
    String name;
    float price;

    //Constructor is being called when the object class being instantiated.
    //Variables on the parameters are 'Local Variables', whereas the variables on the top is 'Global Variables';
    Product(String name, float price) {
        //'this' keyword refers to class itself (Global Variables) which enables you to access Global Variables inside the class.
        this.name = name;
        this.price = price;

        System.out.println(name + " Created!");
        System.out.println("with $" + price + " of Price!");
    }
}
