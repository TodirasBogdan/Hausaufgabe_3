package model;

import java.util.List;

public class Student extends Person {

    private int totalCredits;
    private List<Course> enrolledCourses;

    public Student(String firstName, String lastName, long personId, Long studentId, int totalCredits, List<Course> enrolledCourses) {
        super(firstName, lastName, personId);
        this.totalCredits = totalCredits;
        this.enrolledCourses = enrolledCourses;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(List<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }


    @Override
    public String toString() {
        return "Student{" +
                "firstName=" + super.getFirstName() +
                ", lastName=" + super.getLastName() +
                ", totalCredits=" + totalCredits +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }

}
