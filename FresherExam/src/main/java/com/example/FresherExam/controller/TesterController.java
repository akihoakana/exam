package com.example.FresherExam.controller;

import com.example.FresherExam.entity.DeveloperEntity;
import com.example.FresherExam.entity.TesterEntity;
import com.example.FresherExam.repository.TesterRepository;
import com.example.FresherExam.service.DeveloperServiceImp;
import com.example.FresherExam.service.TesterService;
import com.example.FresherExam.service.TesterServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tester")
public class TesterController {
    @Autowired
    TesterServiceImp testerServiceImp;
    @GetMapping("/creat")
    public ResponseEntity<?> creatfiveDeveloper(){
        testerServiceImp.creatfiveTester();
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
    @GetMapping("/get")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(testerServiceImp.getTester(), HttpStatus.OK);
    }
}