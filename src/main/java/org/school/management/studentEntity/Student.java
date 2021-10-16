package org.school.management.studentEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class Student {

    @Id
    int rollNum;
    String studentName;
    int grade;
    String feesStatus;

    public Student() {
    }

    public Student(int rollNum, String studentName, int grade, String feesStatus) {
        this.rollNum = rollNum;
        this.studentName = studentName;
        this.grade = grade;
        this.feesStatus = feesStatus;
    }


    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public int getRollNum() {
        return rollNum;
    }
    public void setFeesStatus(String feesStatus) {
        this.feesStatus = feesStatus;
    }
    public String getFeesStatus() {
        return feesStatus;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getGrade() {
        return grade;
    }

}
