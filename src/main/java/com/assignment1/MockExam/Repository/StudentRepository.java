package com.assignment1.MockExam.Repository;

import com.assignment1.MockExam.Entity.Course;
import com.assignment1.MockExam.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findStudentsByGpaLessThan(double gpa);

    @Query("SELECT s.courses from Student s where s.id = :id")
    List<Course> getCoursesByStudentId(Long id);
}
