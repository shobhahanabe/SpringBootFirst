package org.school.management.schoolrepo;

import org.school.management.studentEntity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface SchoolRepository extends CrudRepository<Student,Integer> {
   public List<Student> findByGrade(int grade);

    public List<Student> findByFeesStatus(String feesStatus);
}
