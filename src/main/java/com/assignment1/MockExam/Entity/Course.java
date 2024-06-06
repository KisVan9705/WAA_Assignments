package com.assignment1.MockExam.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Course {
    @Id
    @Column(name = "course_id")
    private long id;
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @BatchSize(size = 2)
    @JsonBackReference
    @JoinTable(
            name = "course_student",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;

    @OneToOne(mappedBy = "course", cascade = CascadeType.REMOVE)
    private Course_Details courseDetails;
}
