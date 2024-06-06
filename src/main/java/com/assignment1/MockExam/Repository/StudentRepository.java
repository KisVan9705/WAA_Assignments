package com.assignment1.MockExam.Repository;

import com.assignment1.MockExam.Entity.Course;
import com.assignment1.MockExam.Entity.Student;
import org.hibernate.usertype.CompositeUserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findStudentsByGpaLessThan(double gpa);

    Student findFirstByNameContainingIgnoreCase(String name);


    @Query("SELECT s.courses from Student s where s.id = :id")
    List<Course> getCoursesByStudentId(Long id);

//    @Query("SELECT c from Student s left join Course c where s.id = :id")
//    List<Course> getCoursesByStudentId(Long id);

    //find students with more than one course

    @Query("select s from  Student  s where size(s.courses) > :courseSize")
    List<Student> findStudentByCourseSize(Integer courseSize);
}
