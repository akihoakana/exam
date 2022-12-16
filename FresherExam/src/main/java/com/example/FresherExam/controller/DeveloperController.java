package com.example.FresherExam.controller;

import com.example.FresherExam.entity.DeveloperEntity;
import com.example.FresherExam.service.DeveloperServiceImp;
import com.example.FresherExam.service.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/developer")
public class DeveloperController {
    @Autowired
    DeveloperServiceImp developerServiceImp;
    @GetMapping("/creat")
    public ResponseEntity<?> creatfiveDeveloper(){
        developerServiceImp.creatfiveDeveloper();
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
    @GetMapping("/get")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(developerServiceImp.getDeveloper(), HttpStatus.OK);
    }

}
