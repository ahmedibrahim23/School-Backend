//package com.School.Backend.controller;
//
//import com.School.Backend.Repository.ExamRepository;
//import com.School.Backend.exception.ResourceNotFoundException;
//import com.School.Backend.modal.Exam;
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
//@RequestMapping("/api/exams")
//public class ExamController {
//
//    @Autowired
//    private ExamRepository examRepository;
//
//    // Get all exams
//    @GetMapping
//    public List<Exam> getAllExams() {
//        return this.examRepository.findAll();
//    }
//
//    // Get exam by ID
//    @GetMapping("/{id}")
//    public ResponseEntity<Exam> getExamById(@PathVariable(value = "id") Long examId)
//            throws ResourceNotFoundException {
//        Exam exam = examRepository.findById(examId)
//                .orElseThrow(() -> new ResourceNotFoundException("Exam not found for this id :: " + examId));
//        return ResponseEntity.ok().body(exam);
//    }
//
//    // Create a new exam
//    @PostMapping("/new")
//    public Exam createExam(@RequestBody Exam exam) {
//        return this.examRepository.save(exam);
//    }
//
//    // Update an existing exam
//    @PutMapping("/edit/{id}")
//    public ResponseEntity<Exam> updateExam(@PathVariable(value = "id") Long examId,
//                                           @Validated @RequestBody Exam examDetails) throws ResourceNotFoundException {
//        Exam exam = examRepository.findById(examId)
//                .orElseThrow(() -> new ResourceNotFoundException("Exam not found for this id :: " + examId));
//
//        // Update exam fields
//        exam.setMarks(examDetails.getMarks());
//
//        return ResponseEntity.ok(this.examRepository.save(exam));
//    }
//
//    // Delete an exam
//    @DeleteMapping("/delete/{id}")
//    public Map<String, Boolean> deleteExam(@PathVariable(value = "id") Long examId) throws ResourceNotFoundException {
//        Exam exam = examRepository.findById(examId)
//                .orElseThrow(() -> new ResourceNotFoundException("Exam not found for this id :: " + examId));
//
//        this.examRepository.delete(exam);
//
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("deleted", Boolean.TRUE);
//
//        return response;
//    }
//}
//
