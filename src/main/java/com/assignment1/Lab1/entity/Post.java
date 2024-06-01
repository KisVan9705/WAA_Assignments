package com.assignment1.Lab1.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "post_seq")
    @SequenceGenerator(name = "post_seq", sequenceName = "post_seq", allocationSize = 1)
    long id;
    String title;
    String content;
    String author;

    @ManyToOne
    @JsonBackReference
    private User user;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
            @JoinColumn(name = "post_id")
            @JsonManagedReference
    List<Comment> comments;
}
