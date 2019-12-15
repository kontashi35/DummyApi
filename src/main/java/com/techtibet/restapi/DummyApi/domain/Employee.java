package com.techtibet.restapi.DummyApi.domain;

import javax.persistence.*;

@Entity
@Table (name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    Long Id;
    @Column(name = "NAME")
    String employeeName;
    @Column(name = "AGE")
    Integer age;
    @Column(name = "GENDER")
    String gender;
    @Column(name = "SALARY")
    Long salary;
    @Column(name = "URL")
    String imgUrl;

    public Employee() {
    }

    public Employee(Long id, String employeeName, Integer age, String gender, Long salary, String imgUrl) {
        Id = id;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.imgUrl = imgUrl;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
