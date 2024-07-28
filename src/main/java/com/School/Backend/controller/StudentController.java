//package com.School.Backend.controller;
//
//import com.School.Backend.Repository.ClassRepository;
//import com.School.Backend.Repository.StudentRepository;
//import com.School.Backend.exception.ResourceNotFoundException;
//import com.School.Backend.modal.StdClass;
//import com.School.Backend.modal.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/students")
//public class StudentController {
//    @Autowired
//    private StudentRepository studentRepository;
//    @Autowired
//    private ClassRepository classRepository;
//
//    @GetMapping
//    public List<Student> getAllStudents() {
//        return this.studentRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Student> getStudentById(@PathVariable(value = "id") Long studentId)
//            throws ResourceNotFoundException {
//        Student student = studentRepository.findById(studentId)
//                .orElseThrow(() -> new ResourceNotFoundException("Student not found for this id :: " + studentId));
//        return ResponseEntity.ok().body(student);
//    }
//
//    @PostMapping("/new")
//    public Student createStudent(@RequestBody Student student) {
//        return this.studentRepository.save(student);
//    }
//
//
//    @PutMapping("/edit/{id}")
//    public ResponseEntity<Student> updateStudent(@PathVariable(value = "id") Long studentId,
//                                                 @Validated @RequestBody Student studentDetails) throws ResourceNotFoundException {
//        Student student = studentRepository.findById(studentId)
//                .orElseThrow(() -> new ResourceNotFoundException("Student not found for this id :: " + studentId));
//
//        student.setName(studentDetails.getName());
//        student.setAge(studentDetails.getAge());
//
//
//        return ResponseEntity.ok(this.studentRepository.save(student));
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public Map<String, Boolean> deleteStudent(@PathVariable(value = "id") Long studentId) throws ResourceNotFoundException {
//        Student student = studentRepository.findById(studentId)
//                .orElseThrow(() -> new ResourceNotFoundException("Student not found for this id :: " + studentId));
//
//        this.studentRepository.delete(student);
//
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("deleted", Boolean.TRUE);
//
//        return response;
//    }
//}
