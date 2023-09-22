package arrayOfObjects;

import java.util.Scanner;

//ARRAY OF OBJECTS
//     -> You can declare an array of a certain class and store instances of that class inside that array.
//      INITIALIZING ARRAY OF OBJECTS
//          className identifier[] = new className[size];
//          Employee employee[] = new Employee[5];
public class Main {

    public static void main(String[] args) {
        //Employee e = new Employee("Paolo", "Manansala", "Dev");
        //Employee e1 = new Employee("Erika", "Centeno", "QA");
        //Employee e2 = new Employee("Allyssa", "Camacho", "QA");
        //Employee e3 = new Employee("Pao", "Gile", "Dev");

        //Instead of Creating one by one.
        //Employee employees[] = new Employee[4];
        //employees[0] = new Employee("Paolo", "Manansala", "Dev");
        //employees[1] = new Employee("Erika", "Centeno", "QA");
        //employees[2] = new Employee("Allyssa", "Camacho", "QA");
        //employees[3] = new Employee("Pao", "Gile", "Dev");


        //FOR LOOP
        //for (int i = 0 ; i < employees.length; i++) {
        //    employees[i].introduceSelf();
        //}

        //WHILE LOOP
        //int i = 0;
        //while ( i < employees.length ) {
        //    employees[i].introduceSelf();
        //    i++;
        //}

        //FOR EACH LOOP
        //for(Employee e : employees) {
        //    e.introduceSelf();
        //}

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Students: ");
        int numOfStudents = sc.nextInt();
        sc.nextLine();

        Student student[] = new Student[numOfStudents];

        int i = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("");
            System.out.println("Student No. " + (i+1));
            System.out.print("Enter First Name: ");
            String fName = scan.nextLine();

            System.out.print("Enter Last Name of Student: ");
            String lName = scan.nextLine();

            System.out.print("Enter the Year of Student: ");
            int yr = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter Section (Choices -> 11, 11, 21, 22, 31, 32, 41, 42): ");
            int sec = scan.nextInt();
            scan.nextLine();

            System.out.print("Enter Course of Student: ");
            String cour = scan.nextLine();

            student[i] = new Student(fName, lName, yr, sec, cour);

            student[i].setFirstName(fName);
            student[i].setLastName(lName);
            student[i].setYear(yr);
            student[i].setSection(sec);
            student[i].setCourse(cour);

            i++;
        }
        while (i < student.length);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("");
        System.out.println("Press 'P' to Print List of Student or 'C' to End Task");


        char action = sc2.nextLine().charAt(0);
        if ( action == 'P') {
            System.out.println("================LIST OF REGISTERED STUDENTS================");
            for (Student s : student) {
                s.introduceSelf();
            }
        } else {
            System.out.println("Application Closing!");
        }


    }
}
