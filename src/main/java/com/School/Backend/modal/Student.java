package com.School.Backend.modal;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long id;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "Age")
    private int age;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Date_of_birth")
    private Date dateOfBirth;

    @Column(name = "Gender")
    private String gender;


    private String className;

    @Column(name = "Password")
    private String password;

    public Student() {}

    public Student(Long id, String fullName, int age, String phone, Date dateOfBirth, String gender, String className, String password) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.className = className;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
