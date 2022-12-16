package com.example.FresherExam.repository;

import com.example.FresherExam.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer> {
    public List<EmployeeEntity> findTop2ByOrderByMonthlySalaryAsc();
}
