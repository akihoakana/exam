package com.example.FresherExam.service;

import com.example.FresherExam.DTO.NameAndSalaryDTO;

import java.util.List;

public interface EmployeeService {
    public List<NameAndSalaryDTO> getAll();
    public void raiseSalaryAll();
    public void deleteTwoLowestSalary();
    public List<NameAndSalaryDTO> getDeveloperAndTester();
}
