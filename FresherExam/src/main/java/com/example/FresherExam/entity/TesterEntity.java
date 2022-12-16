package com.example.FresherExam.entity;

import javax.persistence.*;

@Entity(name = "tester")
@PrimaryKeyJoinColumn(name = "id_employee")
public class TesterEntity extends EmployeeEntity {

    @Column(name = "automated")
    private boolean automated;

    public boolean isAutomated() {
        return automated;
    }

    public void setAutomated(boolean automated) {
        this.automated = automated;
    }
    public TesterEntity() {
    }

    public TesterEntity(String firstname, String lastname, double monthlySalary, boolean automated) {
        super(firstname, lastname, monthlySalary);
        this.automated = automated;
    }
}
