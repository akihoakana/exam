package com.example.FresherExam.entity;

import javax.persistence.*;

@Entity(name = "employee")
@Inheritance(strategy = InheritanceType.JOINED)
public  class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "monthly_salary")
    private double monthlySalary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    public EmployeeEntity() {

    }
    public EmployeeEntity(String firstname, String lastname, double monthlySalary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.monthlySalary = monthlySalary;
    }
}
