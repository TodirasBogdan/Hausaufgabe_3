package repository;

import model.Student;

import java.util.Objects;

public class StudentRepository extends InMemoryRepository<Student> {

    public StudentRepository() {
        super();
    }

    @Override
    public Student update(Student obj) {
        for (Student student : repoList)
            if (Objects.equals(student.getPersonId(), obj.getPersonId())) {
                repoList.remove(student);
                repoList.add(obj);
                return null;
            }
        return obj;
    }
}
