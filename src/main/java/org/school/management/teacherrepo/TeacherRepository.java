package org.school.management.teacherrepo;

import org.school.management.teacherEntity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {

    Teacher findByTeacherName(String teacherName);

    Teacher findByTeacherId(int teacherId);

    List<Teacher> findBySalary(long salary1);
}
