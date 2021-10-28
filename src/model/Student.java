package model;

import java.util.List;

public class Student extends Person {

    private Long studentId;
    private int totalCredits;
    private List<Course> enrolledCourses;

    public Student(String firstName, String lastName, Long studentID, int totalCredits, List<Course> enrolledCourses) {
        super(firstName, lastName);
        this.studentId = studentID;
        this.totalCredits = totalCredits;
        this.enrolledCourses = enrolledCourses;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
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
                ", studentId=" + studentId +
                ", totalCredits=" + totalCredits +
                ", enrolledCourses=" + enrolledCourses +
                '}';
    }

}
