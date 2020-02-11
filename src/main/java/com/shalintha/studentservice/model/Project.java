package com.shalintha.studentservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer pid;
    String name;


    @ManyToMany(mappedBy = "projects")
    List<Student> students;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
