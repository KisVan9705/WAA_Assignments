package com.assignment1.MockExam.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "student_id")
    private Long id;
    private String name;
    private float gpa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;
}
