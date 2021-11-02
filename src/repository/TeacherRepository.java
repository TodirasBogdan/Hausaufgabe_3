package repository;

import model.Teacher;

import java.util.Objects;

public class TeacherRepository extends InMemoryRepository<Teacher> {

    public TeacherRepository() {
        super();
    }

    @Override
    public Teacher update(Teacher obj) {
        for (Teacher teacher : repoList)
            if (Objects.equals(teacher.getPersonId(), obj.getPersonId())) {
                repoList.remove(teacher);
                repoList.add(obj);
                return null;
            }
        return obj;
    }
}
