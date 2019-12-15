package com.techtibet.restapi.DummyApi.service;

import com.techtibet.restapi.DummyApi.domain.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee persist(Employee employee);
    Employee findById(Long Id);

    void delete(Employee emp);

    List<Employee> loadAll();
}
