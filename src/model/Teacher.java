package model;

import java.util.List;
import java.util.Objects;

public class Teacher extends Person {

    private List<Course> courses;

    public Teacher(String firstName, String lastName, long personId, List<Course> courses) {
        super(firstName, lastName, personId);
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


    /**
     * print teacher and their details
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "firstName=" + super.getFirstName() +
                ", lastName=" + super.getLastName() +
                ", courses=" + courses +
                '}';
    }

    /**
     * check if two teachers are equal
     *
     * @param o is a teacher object
     * @return true if two teachers are equal, otherwise false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher teacher)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getCourses(), teacher.getCourses());
    }

    /**
     * @return a hashcode of teacher
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCourses());
    }
}
