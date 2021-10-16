package org.school.management.service;

import org.school.management.studentEntity.Student;
import org.school.management.schoolrepo.SchoolRepository;
import org.school.management.teacherEntity.Teacher;
import org.school.management.teacherrepo.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Service
public class SchoolService {

    @Autowired
    private SchoolRepository schoolRepo;
    @Autowired
    private TeacherRepository teacherRepo;


    public Student addStudent(Student student){
        return schoolRepo.save(student);
    }

    /*public List<Student> addStudents(List<Student> students){
        return schoolRepo.saveAll(students);
    }*/

    public Student updateStudentInfo(Student student){
       return schoolRepo.save(student);

    }

    public List<Student> getStudentInfoByGrade(int grade){
        List<Student> students = new ArrayList<>();
        schoolRepo.findByGrade(grade).forEach(students::add);
        return students;
    }

    public List<Student>  getStudentInfoByFeesStatus(String feesStatus) {
        List<Student> students = new ArrayList<>();
        schoolRepo.findByFeesStatus(feesStatus).forEach(students::add);
        return students;
    }

    public Teacher addTeacher(Teacher teacher){
        return teacherRepo.save(teacher);
    }

    public long getSalaryByName(String teacherName){
        Teacher T = teacherRepo.findByTeacherName(teacherName);

        if(Objects.nonNull(T)&&(T.getSalary()!=null)){
          return  T.getSalary();
        }
        else {
            return 0;
        }

    }

    public long getSalaryById(int teacherId ){
       Teacher teach = teacherRepo.findByTeacherId(teacherId);
       return teach.getSalary();
    }

    public void deleteTeacherById(int teacherId ){
       Teacher tech =  teacherRepo.findByTeacherId(teacherId);
       teacherRepo.delete(tech);
    }

    public Teacher updateTeacherInfo(Teacher teacher){
       return teacherRepo.save(teacher);

    }


    public List<String> getTeachers(long salary1) {

       List<Teacher> teacher = new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        teacherRepo.findBySalary(salary1).forEach(teacher::add);

        Iterator i1 = teacher.iterator();
        while(i1.hasNext()){
           Teacher t1 =(Teacher) i1.next();
             l1.add(t1.getTeacherName());
        }
return l1;

    }
}
