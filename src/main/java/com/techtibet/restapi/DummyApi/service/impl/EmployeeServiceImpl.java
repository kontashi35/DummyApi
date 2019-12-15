package com.techtibet.restapi.DummyApi.service.impl;

import com.techtibet.restapi.DummyApi.domain.Employee;
import com.techtibet.restapi.DummyApi.repo.EmployeeRepo;
import com.techtibet.restapi.DummyApi.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public Employee persist(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee findById(Long Id) {
        if(employeeRepo.findById(Id).isPresent()){
            return employeeRepo.findById(Id).get();
        }
       return null;
    }

    @Override
    public void delete(Employee emp) {
         employeeRepo.delete(emp);
    }

    @Override
    public List<Employee> loadAll() {
        return employeeRepo.findAll();
    }
}
