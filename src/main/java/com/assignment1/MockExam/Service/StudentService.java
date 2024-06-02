package com.assignment1.MockExam.Service;

import com.assignment1.MockExam.Entity.Course;
import com.assignment1.MockExam.Entity.Student;
import com.assignment1.MockExam.Repository.StudentRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Data
@Service
public class StudentService {
    @Autowired
    private final StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    public void deleteStudentById(Long id){
        studentRepository.deleteById(id);
    }

    public void addStudent(Student student){
        Student mapper = new Student();
        mapper.setId(student.getId());
        mapper.setName(student.getName());
        mapper.setGpa(student.getGpa());
        studentRepository.save(mapper);
    }

    //get courses for specific student
    public List<Course> getCourseByStudentId(Long id){
        return studentRepository.getCoursesByStudentId(id);
    }

    //get students with gpa less than value
    public  List<Student> getStudentByGPALessThanValue(double value){
        return studentRepository.findStudentsByGpaLessThan(value);
    }
}
