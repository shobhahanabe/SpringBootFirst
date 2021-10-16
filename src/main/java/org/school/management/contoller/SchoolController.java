package org.school.management.contoller;

import org.school.management.service.SchoolService;
import org.school.management.studentEntity.Student;
import org.school.management.teacherEntity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SchoolController {
    @Autowired
    private SchoolService schoolService;

    @RequestMapping(method = RequestMethod.POST, value = "/admit")
    public Student studentAdmission( @RequestBody Student st){
        return schoolService.addStudent(st);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateStudentInfo")
    public Student studentUpdate( @RequestBody Student st){
        return schoolService.addStudent(st);
    }

    @RequestMapping(method = RequestMethod.GET, value= "/studentGrade/{grade}")
    public List<Student> studentInfoByGrade(@PathVariable int grade ){
        return   schoolService.getStudentInfoByGrade(grade);
    }

    @RequestMapping(method = RequestMethod.GET, value= "/studentFees/{feesStatus}")
    public List<Student>  studentByFeesStatus(@PathVariable String feesStatus ){
        return schoolService.getStudentInfoByFeesStatus(feesStatus);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/recruit")
    public Teacher studentAdmission(@RequestBody Teacher tech){
        return schoolService.addTeacher(tech);
    }

    @RequestMapping(method = RequestMethod.GET, value= "/teacher/{teacherId}")
    public long teacherSalaryById(@PathVariable int teacherId ){
        return schoolService.getSalaryById(teacherId);
    }

    @RequestMapping(method = RequestMethod.GET, value= "/teacherSalary/{teacherName}")
    public long teacherSalaryByName(@PathVariable String teacherName ){
        return schoolService.getSalaryByName(teacherName);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateTeacherInfo")
    public Teacher teacherUpdate(@RequestBody Teacher teacher){
        return schoolService.updateTeacherInfo(teacher);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteTeacher/{teacherId}")
    public void removeTeacher(@PathVariable int teacherId){
        schoolService.deleteTeacherById(teacherId);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/teacherBySalary/{salary1}")
    public List<String> removeTeacher(@PathVariable long salary1){
       return schoolService.getTeachers(salary1);
    }

}
