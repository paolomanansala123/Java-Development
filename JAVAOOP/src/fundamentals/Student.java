package fundamentals;

public class Student {
    String firstName, lastName, course, section, year;
    float midtermGrade, finalGrade;

    Student(String firstName, String lastName, String course, String section, String year, float midtermGrade, float finalGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.section = section;
        this.year = year;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    void introduceSelf() {
        System.out.println("Name   : " + firstName + " " + lastName);
        System.out.println("Course : " + course);
        System.out.println("Year   : " + year);
        System.out.println("Section: " + section);
    }

    void evaluateGrade() {
        String eval = "";
        float average = (midtermGrade + finalGrade)/2;
        if (average >= 90) {
            eval = "Honor";
        } else if (average < 90 && average >= 75) {
            eval = "Passed";
        } else if (average < 75) {
            eval = "Failed";
        }
        System.out.println("Average    => " + average);
        System.out.println("Evaluation => " + eval);
    }
}
