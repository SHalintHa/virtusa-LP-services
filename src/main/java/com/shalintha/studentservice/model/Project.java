package com.shalintha.studentservice.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer pid;
    String Name;


    @ManyToMany(mappedBy = "projects")
    List<Student> students;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
