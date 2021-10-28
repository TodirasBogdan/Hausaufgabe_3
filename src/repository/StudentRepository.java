package repository;

import model.Student;

public class StudentRepository extends InMemoryRepository<Student>{

    public StudentRepository() {
    }

    @Override
    public Student update(Student obj) {
        return null;
    }
}
