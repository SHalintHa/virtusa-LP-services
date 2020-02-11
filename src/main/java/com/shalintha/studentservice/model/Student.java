package com.shalintha.studentservice.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
public class Student {

	@Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer sid;
    String studentName;
    int age;

    @OneToOne(cascade = CascadeType.ALL)
    Address address;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    List<Telephone> telephones;

    @ManyToMany(cascade = CascadeType.ALL)
            @JoinTable(
                    joinColumns={@JoinColumn(name = "sid", referencedColumnName = "id")},
                    inverseJoinColumns = {@JoinColumn(name = "pid", referencedColumnName = "id")}
            )
    List<Project> projects;

    public Student() {    }

    
    public Student(int sid, String studentName, int age) {
        this.sid = sid;
        this.studentName = studentName;
        this.age = age;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }
}
