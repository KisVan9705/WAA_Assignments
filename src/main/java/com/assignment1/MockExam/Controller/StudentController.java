package com.assignment1.MockExam.Controller;

import com.assignment1.MockExam.Aspect.ExecutionTime;
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

    @ExecutionTime
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

    @PutMapping("/{id}")
    public Student updateStudentInfo(@PathVariable Long id, @RequestBody Student student){
        return studentService.updateStudentInfo(id, student);
    }

    @GetMapping("/search")
    public Student getStudentByNameContaining(@RequestParam(required = true) String name){
        return studentService.findStudentByNameContainingIgnoreCase(name);
    }

    //find students with more than one course

    @GetMapping("/courses/{size}")
    public List<Student> getStudentByCourseSize(@PathVariable Integer size){
        return studentService.findStudentByCourseSize(size);
    }


}
