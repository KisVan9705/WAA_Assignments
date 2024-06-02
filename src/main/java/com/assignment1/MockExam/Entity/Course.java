package com.assignment1.MockExam.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
    @Id
    @Column(name = "course_id")
    private long id;
    private String name;

    @ManyToMany
    @JsonBackReference
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;

    @OneToOne(mappedBy = "course", cascade = CascadeType.REMOVE)
    private Course_Details courseDetails;
}
