//package com.School.Backend.controller;
//
//import com.School.Backend.Repository.FeeRepository;
//import com.School.Backend.exception.ResourceNotFoundException;
//import com.School.Backend.modal.Fee;
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
//@RequestMapping("/api/fees")
//public class FeeController {
//
//    @Autowired
//    private FeeRepository feeRepository;
//
//    @GetMapping
//    public List<Fee> getAllFees() {
//        return this.feeRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Fee> getFeeById(@PathVariable(value = "id") Long feeId)
//            throws ResourceNotFoundException {
//        Fee fee = feeRepository.findById(feeId)
//                .orElseThrow(() -> new ResourceNotFoundException("Fee not found for this id :: " + feeId));
//        return ResponseEntity.ok().body(fee);
//    }
//
//    @PostMapping("/new")
//    public Fee createFee(@RequestBody Fee fee) {
//        return this.feeRepository.save(fee);
//    }
//
//    @PutMapping("/edit/{id}")
//    public ResponseEntity<Fee> updateFee(@PathVariable(value = "id") Long feeId,
//                                         @Validated @RequestBody Fee feeDetails) throws ResourceNotFoundException {
//        Fee fee = feeRepository.findById(feeId)
//                .orElseThrow(() -> new ResourceNotFoundException("Fee not found for this id :: " + feeId));
//
//        fee.setAmount(feeDetails.getAmount());
//        fee.setDate(feeDetails.getDate());
//        fee.setStatus(feeDetails.getStatus());
//
//
//        return ResponseEntity.ok(this.feeRepository.save(fee));
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public Map<String, Boolean> deleteFee(@PathVariable(value = "id") Long feeId) throws ResourceNotFoundException {
//        Fee fee = feeRepository.findById(feeId)
//                .orElseThrow(() -> new ResourceNotFoundException("Fee not found for this id :: " + feeId));
//
//        this.feeRepository.delete(fee);
//
//        Map<String, Boolean> response = new HashMap<>();
//        response.put("deleted", Boolean.TRUE);
//
//        return response;
//    }
//}
//
