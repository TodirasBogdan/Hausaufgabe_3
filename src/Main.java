import model.Course;
import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Student> students1= new ArrayList<>();
        List<Course> courses1 = new ArrayList<>();
        Teacher teacher1 = new Teacher("Ion","Ionescu",courses1);
        Course course1 = new Course("BD", teacher1,0,students1,0);

        System.out.println(course1.toString());
    }
}
