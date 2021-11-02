package repository;

import model.Course;

public class CourseRepository extends InMemoryRepository<Course> {

    public CourseRepository() {
        super();
    }

    @Override
    public Course update(Course obj) {
        for (Course course : repoList)
            if (course.getCourseId() == obj.getCourseId()) {
                repoList.remove(course);
                repoList.add(obj);
                return null;
            }
        return obj;
    }
}
