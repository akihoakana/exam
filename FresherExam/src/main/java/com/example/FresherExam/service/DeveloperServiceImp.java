package com.example.FresherExam.service;

import com.example.FresherExam.entity.DeveloperEntity;
import com.example.FresherExam.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class DeveloperServiceImp implements DeveloperService{
    @Autowired
    DeveloperRepository developerRepository;
    @Override
    public void creatfiveDeveloper() {
        List<DeveloperEntity> developerEntities=new LinkedList<>();

        DeveloperEntity developerEntity1 =
                new DeveloperEntity("Developer ","aa",11.1,"C");

        DeveloperEntity developerEntity2 =
                new DeveloperEntity("Developer ","bb",22.2,"C+");

        DeveloperEntity developerEntity3 =
                new DeveloperEntity("Developer ","cc",33,"C#");

        DeveloperEntity developerEntity4 =
                new DeveloperEntity("Developer ","dd",15,"C++");

        DeveloperEntity developerEntity5 =
                new DeveloperEntity("Developer ","ee",21,"Java");
        developerEntities.add(developerEntity1);
        developerEntities.add(developerEntity2);
        developerEntities.add(developerEntity3);
        developerEntities.add(developerEntity4);
        developerEntities.add(developerEntity5);
        developerRepository.saveAll(developerEntities);
    }

    @Override
    public List<DeveloperEntity> getDeveloper() {
        return developerRepository.findAll();
    }
}
