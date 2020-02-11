package com.shalintha.studentservice.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
public class Student {

	@Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer sid;
    String studentName;
    String studentAddress;

    public Student() {    }

    
    public Student(int sid, String studentName, String studentAddress) {
        this.sid = sid;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public static List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "A", "AAAAAAAAAA"));
        students.add(new Student(2, "B", "BBBBBBBBBB"));
        students.add(new Student(3, "C", "CCCCCCCCCC"));
        students.add(new Student(4, "D", "DDDDDDDDDD"));
        students.add(new Student(5, "E", "EEEEEEEEEE"));
        students.add(new Student(6, "F", "FFFFFFFFFF"));
        students.add(new Student(7, "G", "GGGGGGGGGG"));
        students.add(new Student(8, "H", "HHHHHHHHHH"));
        students.add(new Student(9, "I", "IIIIIIIIII"));

        return students;
    }
}
