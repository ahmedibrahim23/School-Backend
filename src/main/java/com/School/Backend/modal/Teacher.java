package com.School.Backend.modal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "TeacherTble")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "DateOfBirth")
    private Date dateOfBirth;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Address")
    private String address;

    @Column(name = "Phone")
    private String Phone;

    @Column(name = "Email")
    private String email;

    @Column(name = "Age")
    private int age;

    @Column(name = "Password")
    private String password;

    @Column(name = "Hiredate")
    private Date hireDate;
}
