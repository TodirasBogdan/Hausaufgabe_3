package model;

import java.util.List;
import java.util.Objects;


public class Course {

    private String name;
    private Teacher teacher;
    private int maxEnrollment;
    private List<Student> studentsEnrolled;
    private int credits;
    private long courseId;

    public Course(String name, Teacher teacher, int maxEnrollment, List<Student> studentsEnrolled, int credits, long courseId) {
        this.name = name;
        this.teacher = teacher;
        this.maxEnrollment = maxEnrollment;
        this.studentsEnrolled = studentsEnrolled;
        this.credits = credits;
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getMaxEnrollment() {
        return maxEnrollment;
    }

    public void setMaxEnrollment(int maxEnrollment) {
        this.maxEnrollment = maxEnrollment;
    }

    public List<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(List<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }


    /**
     * print course and its details
     */
    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher.getFirstName() + " " + teacher.getLastName() +
                ", maxEnrollment=" + maxEnrollment +
                ", credits=" + credits +
                '}';
    }

    /**
     * check if two courses are equal
     *
     * @param o is a course object
     * @return true if two courses are equal, otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;
        return getMaxEnrollment() == course.getMaxEnrollment() && getCredits() == course.getCredits() && getCourseId() == course.getCourseId() && Objects.equals(getName(), course.getName()) && Objects.equals(getTeacher(), course.getTeacher()) && Objects.equals(getStudentsEnrolled(), course.getStudentsEnrolled());
    }

    /**
     * @return a hashcode of course
     */
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getTeacher(), getMaxEnrollment(), getStudentsEnrolled(), getCredits(), getCourseId());
    }
}
