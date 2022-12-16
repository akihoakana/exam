package com.example.FresherExam.entity;

import javax.persistence.*;

@Entity(name = "developer")
@PrimaryKeyJoinColumn(name = "id_employee")
public class DeveloperEntity extends EmployeeEntity {

    @Column(name = "programming_language")
    private String programming_language;

    public String getProgramming_language() {
        return programming_language;
    }

    public void setProgramming_language(String programming_language) {
        this.programming_language = programming_language;
    }

    public DeveloperEntity(){}
    public DeveloperEntity(String firstname, String lastname, double monthlySalary, String programming_language) {
        super(firstname, lastname, monthlySalary);
        this.programming_language = programming_language;
    }
}
