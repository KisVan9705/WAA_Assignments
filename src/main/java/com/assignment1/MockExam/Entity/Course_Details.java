package com.assignment1.MockExam.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "course_description")
    private String description;

    private int credit;
    private String program;
    @DateTimeFormat(style = "YYYY")
    private Date date;

    @OneToOne
    @JoinColumn(name = "course_id")
    private Course course;

}
