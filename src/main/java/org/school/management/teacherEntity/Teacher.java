package org.school.management.teacherEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
public class Teacher {
@Id
    int teacherId;
    String teacherName;
    String qualification;
    Long salary;

    public Teacher() {
    }

    public Teacher(int teacherId, String teacherName, String qualification, Long salary) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.qualification = qualification;
        this.salary = salary;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
