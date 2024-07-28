package com.School.Backend.modal;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "classTble")
public class StdClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Class_id")
    private Long id;

    @Column(name = "Name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "teacher_id", nullable = false)
    private Teacher teacher;
}
