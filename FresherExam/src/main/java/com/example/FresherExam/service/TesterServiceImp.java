package com.example.FresherExam.service;

import com.example.FresherExam.entity.TesterEntity;
import com.example.FresherExam.repository.TesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class TesterServiceImp implements TesterService{
    @Autowired
    TesterRepository testerRepository;
    @Override
    public void creatfiveTester() {
        List<TesterEntity> testerEntities=new LinkedList<>();
        TesterEntity developerEntity1 =
                new TesterEntity("Tester ","aa",11.1,true);

        TesterEntity developerEntity2 =
                new TesterEntity("Tester ","bb",22.2,true);

        TesterEntity developerEntity3 =
                new TesterEntity("Tester ","cc",33,false);

        TesterEntity developerEntity4 =
                new TesterEntity("Tester ","dd",15,false);

        TesterEntity developerEntity5 =
                new TesterEntity("Tester ","ee",21,true);
        testerEntities.add(developerEntity1);
        testerEntities.add(developerEntity2);
        testerEntities.add(developerEntity3);
        testerEntities.add(developerEntity4);
        testerEntities.add(developerEntity5);
        testerRepository.saveAll(testerEntities);
    }

    @Override
    public List<TesterEntity> getTester() {
        return testerRepository.findAll();
    }
}
