/*Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
Comprehensive Version (12th ed.). Pearson Education, Inc.
Modified by Ahriika Jordan 2021*/

import java.util.Scanner;

public class Student extends JordanGradeBookApp2 {

    static Scanner scan = new Scanner(System.in);
    static String firstName = scan.next();
    static String lastName = scan.next();
    static String courses = scan.next();
    static String grades = scan.next();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        Student.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        Student.lastName = lastName;
    }

    public String getCourseName() {
        return courses;
    }

    public void setCourseName(String courses) {
        Student.courses = courses;
    }

    public String getGrade() {
        return grades;
    }

    public void setGrade(String grades) {
        Student.grades = grades;
    }

    public String toString() {
        return ("first name: " + firstName + ",last name: " + lastName + ",course name: " + courses + ",grade: "
                + grades);
    }
}
