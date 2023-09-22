package arrayOfObjects;

public class Student {
    private String firstName, lastName;
    private int year, section;
    private String course;

    Student(String firstName,
            String lastName,
            int year,
            int section,
            String course) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.section = section;
        this.course = course;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public int getSection() {
        return section;
    }

    public String getCourse() {
        return course;
    }

    void introduceSelf() {
        System.out.println("Name    : " + getFirstName() + " " + getLastName());
        System.out.println("Year    : " + getYear());
        System.out.println("Section : " + getSection());
        System.out.println("Course  : " + getCourse());
        System.out.println("===========================================================");
    }
}
