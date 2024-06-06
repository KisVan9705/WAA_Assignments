package com.assignment1.MockExam.Service;

import com.assignment1.MockExam.Entity.Course;
import com.assignment1.MockExam.Entity.Student;
import com.assignment1.MockExam.Repository.StudentRepository;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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

    @Transactional
    public Student updateStudentInfo(Long id, Student updatedStudent){
        Optional<Student> optionalStudent = studentRepository.findById(id);
//        Student test = new Student();
//        studentRepository.save(test);

        if(optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            student.setName(updatedStudent.getName());
            student.setId(id);
            student.setGpa(updatedStudent.getGpa());
            student.setAddress(updatedStudent.getAddress());
            student.setCourses(updatedStudent.getCourses());
            return student;
        }else {
            throw new RuntimeException("Person not found with id: " + id);
        }
    }

    public Student findStudentByNameContainingIgnoreCase(String name){
       return studentRepository.findFirstByNameContainingIgnoreCase(name);
    }

    public List<Student> findStudentByCourseSize(Integer size){
        return studentRepository.findStudentByCourseSize(size);
    }
}
