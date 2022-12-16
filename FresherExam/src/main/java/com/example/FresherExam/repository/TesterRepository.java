package com.example.FresherExam.repository;

import com.example.FresherExam.entity.TesterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TesterRepository extends JpaRepository<TesterEntity,Integer> {

}
