package arrayList;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
//      -> Array List is a resizable array and can be imported using the java.util package.
//      -> It follows the same rules as Arrays when it comes to indexing.
//      -> ArrayList doesn't use Square Brackets [].
//      -> ArrayList uses non primitive data types (String).
//      -> DECLARING:    ArrayList<DataType> identifier = new ArrayList<DataType>();

//RECALL:
//PRIMITIVE DATA TYPES     -> int x, boolean y, float z, char w, byte a;;
//NON-PRIMITIVE DATA TYPES -> String name, Object object;

//We can create an ArrayList for Primitive Data Types using a WRAPPER CLASS.
//WRAPPER CLASS            -> Integer x, Float d, Character f, Double d;
public class Main {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<String>();      //FOR NON PRIMITIVE.
//        ArrayList<Integer> names2 = new ArrayList<Integer>();   //FOR PRIMITIVE.
//        names.add("Paolo");
//        names.add("Erika");
//        names.add("Allyssa");
//
//        System.out.println(names + " Size: " + names.size());
//
//        //*******************************************************//
//
//        //CREATE
//        ArrayList<Student> stud = new ArrayList<Student>();
//        stud.add(new Student("Paolo", "CE"));
//        stud.add(new Student("Erika", "CS"));
//        stud.add(new Student("Allyssa", "IT"));
//
//        Student s = stud.get(0);
//        s.introduce();
//
//        //UPDATE
//        stud.set(0, new Student("Piolo", "CPE"));
//        Student sNew = stud.get(0);
//        sNew.introduce();
//
//        //DELETE
//        stud.remove(1);
//        System.out.println(stud.size());
//
//        stud.clear();
//        System.out.println(stud.size());
//
//
//        //ITERATING ArrayList   Recommended -> For Loop or For Each
//        ArrayList<Student> studNames = new ArrayList<Student>();
//        studNames.add(new Student("Paolo", "CE"));
//        studNames.add(new Student("Erika", "CS"));
//        studNames.add(new Student("Allyssa", "IT"));
//
//        //FOR LOOP
//        for (int i = 0 ; i < studNames.size(); i++) {
//            Student s2 = studNames.get(i);
//            s2.introduce();
//        }
//
//        //FOR-EACH
//        for (Student s2 : studNames) {
//            s2.introduce();
//        }
        int choice;
        ArrayList<String> students = new ArrayList<String>();
        Transaction trans;

        try {
            do {
                trans = new Transaction();
                trans.printTransaction();
                Scanner sc2 = new Scanner(System.in);
                choice = sc2.nextInt();
                System.out.println("    ");
                sc2.nextLine();

                switch (choice) {
                    case 1: //ADD
                        Scanner sc3 = new Scanner(System.in);
                        System.out.println("-------------------------------------------------------");
                        System.out.print("Enter Name: ");
                        String name = sc3.nextLine();
                        students.add(name);
                        break;

                    case 2: //DELETE
                        if (!students.isEmpty()) {
                            Scanner sc4 = new Scanner(System.in);
                            System.out.println("-------------------------------------------------------");
                            System.out.print("Who will I remove? Enter name: ");

                            String nameDel = sc4.nextLine();
                            System.out.println("-------------------------------------------------------");
                            System.out.println("A Student has been removed!");

                            students.remove(nameDel);
                            System.out.println("-------------------------------------------------------");

                        } else {
                            System.out.println("Empty List, Add Names!");
                        }
                        break;

                    case 3: //UPDATE LIST
                        if (!students.isEmpty()) {
                            Scanner sc5 = new Scanner(System.in);
                            System.out.println("-------------------------------------------------------");
                            System.out.print("Who will I update? Enter name: ");
                            String nameUpt = sc5.nextLine();

                            Scanner sc6 = new Scanner(System.in);
                            System.out.print("Enter the new name: ");
                            String nameUpdated = sc6.nextLine();

                            System.out.println("-------------------------------------------------------");
                            System.out.println(nameUpt + " has been changed to " + nameUpdated);

                            int indexOf = students.indexOf(nameUpt);

                            students.set(indexOf, nameUpdated);
                            System.out.println("-------------------------------------------------------");

                        } else {
                            System.out.println("Empty List, Add Names!");
                        }
                        break;


                    case 4: //GET LIST
                        if (!students.isEmpty()) {
                            System.out.println("*******************************************************");
                            System.out.println("List of Students: " + students);
                            System.out.println("There are " + students.size() + " student/s on the list!");
                            System.out.println("*******************************************************");
                            System.out.println("    ");
                        } else {
                            System.out.println("Empty List!");
                            System.out.println("    ");
                        }
                        break;
                }


            } while (choice != 0);
            System.out.println("Exiting the Application!");

        } catch (InputMismatchException e) {
            System.out.println("Invalid Input!");
        }

    }
}
