package model;

import java.util.List;
import java.util.Objects;

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


    /**
     * print student and their details
     */
    @Override
    public String toString() {
        return "Student{" +
                "firstName=" + super.getFirstName() +
                ", lastName=" + super.getLastName() +
                ", totalCredits=" + totalCredits +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }

    /**
     * check if two students are equal
     *
     * @param o is a student object
     * @return true if two students are equal, otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        if (!super.equals(o)) return false;
        return getTotalCredits() == student.getTotalCredits() && Objects.equals(getEnrolledCourses(), student.getEnrolledCourses());
    }

    /**
     * @return a hashcode of student
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTotalCredits(), getEnrolledCourses());
    }
}
