//package com.School.Backend.controller;
//
//import com.School.Backend.Repository.SubjectRepository;
//import com.School.Backend.exception.ResourceNotFoundException;
//import com.School.Backend.modal.Subject;
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
//@RequestMapping("/api/subjects")
//public class SubjectController {
//
//    @Autowired
//    private SubjectRepository subjectRepository;
//
//    @GetMapping
//    public List<Subject> getAllSubjects() {
//        return this.subjectRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Subject> getSubjectById(@PathVariable(value = "id") Long subjectId)
//            throws ResourceNotFoundException {
//        Subject subject = subjectRepository.findById(subjectId)
//                .orElseThrow(() -> new ResourceNotFoundException("Subject not found for this id :: " + subjectId));
//        return ResponseEntity.ok().body(subject);
//    }
//
//    @PostMapping("/new")
//    public Subject createSubject(@RequestBody Subject subject) {
//        return this.subjectRepository.save(subject);
//    }
//
//    @PutMapping("/edit/{id}")
//    public ResponseEntity<Subject> updateSubject(@PathVariable(value = "id") Long subjectId,
//                                                 @Validated @RequestBody Subject subjectDetails) throws ResourceNotFoundException {
//        Subject subject = subjectRepository.findById(subjectId)
//                .orElseThrow(() -> new ResourceNotFoundException("Subject not found for this id :: " + subjectId));
//
//        subject.setSubjectName(subjectDetails.getSubjectName());
//
//        return ResponseEntity.ok(this.subjectRepository.save(subject));
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public Map<String, Boolean> deleteSubject(@PathVariable(value = "id") Long subjectId) throws ResourceNotFoundException {
//        Subject subject = subjectRepository.findById(subjectId)
//                .orElseThrow(() -> new ResourceNotFoundException("Subject not found for this id :: " + subjectId));
//
//        this.subjectRepository.delete(subject);
//
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("deleted", Boolean.TRUE);
//
//        return response;
//    }
//}
