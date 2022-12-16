package com.example.FresherExam.controller;

import com.example.FresherExam.service.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeServiceImp employeeServiceImp;
    @GetMapping("/getall")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(employeeServiceImp.getAll(), HttpStatus.OK);
    }
    @GetMapping("/getdeveloperandtester")
    public ResponseEntity<?> getDeveloperAndTester(){
        return new ResponseEntity<>(employeeServiceImp.getDeveloperAndTester(), HttpStatus.OK);
    }
    @GetMapping("/raisesalary")
    public ResponseEntity<?> raiseSalaryAll(){
        employeeServiceImp.raiseSalaryAll();
        return new ResponseEntity<>("Đã update salary", HttpStatus.OK);
    }
    @GetMapping("/delete")
    public ResponseEntity<?> deleteTwoLowestSalary(){
        employeeServiceImp.deleteTwoLowestSalary();
        return new ResponseEntity<>("Đã xoá", HttpStatus.OK);
    }
}
