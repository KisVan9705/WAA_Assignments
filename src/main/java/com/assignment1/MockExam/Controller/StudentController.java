package com.assignment1.MockExam.Controller;

import com.assignment1.MockExam.Entity.Course;
import com.assignment1.MockExam.Entity.Student;
import com.assignment1.MockExam.Service.StudentService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
@Data
public class StudentController {
    @Autowired
    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
      return  studentService.getAllStudents();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ("id") Long id){
        studentService.deleteStudentById(id);
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    //get student by id
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable ("id") Long id){
       return studentService.getStudentById(id);
    }

    //get courses for specific student
    @GetMapping("/{id}/courses")
    public List<Course> getCourseByStudentId(@PathVariable ("id") Long id){
        return studentService.getCourseByStudentId(id);
    }

    //get students with gpa less than value
    @GetMapping("/gpa/{value}")
    public  List<Student> getStudentByGPALessThanValue(@PathVariable ("value") double value){
        return studentService.getStudentByGPALessThanValue(value);
    }

}
