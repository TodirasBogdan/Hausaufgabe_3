package repository;

import model.Course;

public class CourseRepository extends InMemoryRepository<Course>{

    public CourseRepository() {
    }

    @Override
    public Course update(Course obj) {
        return null;
    }
}
