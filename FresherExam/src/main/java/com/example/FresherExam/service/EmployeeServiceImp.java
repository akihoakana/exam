package com.example.FresherExam.service;

import com.example.FresherExam.DTO.NameAndSalaryDTO;
import com.example.FresherExam.entity.DeveloperEntity;
import com.example.FresherExam.entity.EmployeeEntity;
import com.example.FresherExam.entity.TesterEntity;
import com.example.FresherExam.repository.DeveloperRepository;
import com.example.FresherExam.repository.EmployeeRepository;
import com.example.FresherExam.repository.TesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService{

    @Autowired
    DeveloperRepository developerRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    TesterRepository testerRepository;
    @Override
    public List<NameAndSalaryDTO> getAll() {
        List<NameAndSalaryDTO>  nameAndSalaryDTOS= new LinkedList<>();
        for (EmployeeEntity employeeEntity :employeeRepository.findAll()){
            NameAndSalaryDTO  nameAndSalaryDTO= new NameAndSalaryDTO();
            nameAndSalaryDTO.setFirstName(employeeEntity.getFirstname());
            nameAndSalaryDTO.setId(employeeEntity.getId());
            nameAndSalaryDTO.setLastName(employeeEntity.getLastname());
            nameAndSalaryDTO.setMonthlySalary(employeeEntity.getMonthlySalary());
            nameAndSalaryDTOS.add(nameAndSalaryDTO);
        }
        return nameAndSalaryDTOS;
    }
    @Override
    public List<NameAndSalaryDTO> getDeveloperAndTester() {
        List<NameAndSalaryDTO>  nameAndSalaryDTOS= new LinkedList<>();
        for (DeveloperEntity developerEntity :developerRepository.findAll()){
            NameAndSalaryDTO  nameAndSalaryDTO= new NameAndSalaryDTO();
            nameAndSalaryDTO.setFirstName(developerEntity.getFirstname());
            nameAndSalaryDTO.setId(developerEntity.getId());
            nameAndSalaryDTO.setLastName(developerEntity.getLastname());
            nameAndSalaryDTO.setMonthlySalary(developerEntity.getMonthlySalary());
            nameAndSalaryDTOS.add(nameAndSalaryDTO);
        }
        for (TesterEntity testerEntity :testerRepository.findAll()){
            NameAndSalaryDTO  nameAndSalaryDTO= new NameAndSalaryDTO();
            nameAndSalaryDTO.setFirstName(testerEntity.getFirstname());
            nameAndSalaryDTO.setId(testerEntity.getId());
            nameAndSalaryDTO.setLastName(testerEntity.getLastname());
            nameAndSalaryDTO.setMonthlySalary(testerEntity.getMonthlySalary());
            nameAndSalaryDTOS.add(nameAndSalaryDTO);
        }
        return nameAndSalaryDTOS;
    }
    @Override
    public void raiseSalaryAll() {
        for (EmployeeEntity employeeEntity :employeeRepository.findAll()){
            employeeEntity.setMonthlySalary(employeeEntity.getMonthlySalary()*(1.1));
            employeeRepository.save(employeeEntity);
        }
    }

    @Override
    public void deleteTwoLowestSalary() {
        for (EmployeeEntity employeeEntity :employeeRepository.findTop2ByOrderByMonthlySalaryAsc()){
            System.out.println("employeeEntity.getMonthlySalary() = " + employeeEntity.getMonthlySalary());
            System.out.println("employeeEntity.getId() = " + employeeEntity.getId());
            employeeRepository.deleteById(employeeEntity.getId());
        }
    }
}
