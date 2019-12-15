package com.techtibet.restapi.DummyApi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.techtibet.restapi.DummyApi.domain.Employee;
import com.techtibet.restapi.DummyApi.repo.EmployeeRepo;
import com.techtibet.restapi.DummyApi.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/employee")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;
    @Autowired
    ObjectMapper objectMapper;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public  Map<String,Object> getEmployee(){
        Map<String,Object> returnMap=new HashMap<>();
        try{
            List<Employee>  returnEmployeeList=employeeService.loadAll();
            returnMap.put("status","success");
            returnMap.put("data",returnEmployeeList);
            returnMap.put("messsage","Employee Fetch Successfully");

        }catch (Exception e){
            returnMap.put("status","failed");
            returnMap.put("messsage",e.getMessage());
        }
        return returnMap;
    }
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Map<String,Object> addEmployee(@RequestBody Employee employee){
        Map<String,Object> returnMap=new HashMap<>();
        try{
//            Employee emp = objectMapper.readValue(employee, Employee.class);
            Employee returnEmployee=employeeService.persist(employee);
            returnMap.put("status","success");
            returnMap.put("data",returnEmployee);
            returnMap.put("messsage","Employee Added Successfully");

        }catch (Exception e){
            returnMap.put("status","failed");
            returnMap.put("messsage",e.getMessage());
        }
        return returnMap;
    }
    @RequestMapping(value = "/put/{id}",method = RequestMethod.PUT)
    public Map<String,Object> updateEmployee(@PathVariable Long id,@RequestBody Employee employee){
        Map<String,Object> returnMap=new HashMap<>();
        try {
            Employee emp=employeeService.findById(id);
            emp.setAge(employee.getAge());
            emp.setEmployeeName(employee.getEmployeeName());
            emp.setGender(employee.getGender());
            emp.setImgUrl(employee.getImgUrl());
            emp.setSalary(employee.getSalary());
            Employee returnEmployee=employeeService.persist(emp);
            returnMap.put("status","success");
            returnMap.put("data",returnEmployee);
            returnMap.put("messsage","Employee updated Successfully");
        }catch (Exception e){
            returnMap.put("status","failed");
            returnMap.put("messsage",e.getMessage());
        }

        return returnMap;
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public Map<String,Object> deleteEmployee(@PathVariable Long id){
        Map<String,Object> returnMap=new HashMap<>();
        try {
            Employee emp=employeeService.findById(id);
            employeeService.delete(emp);
            returnMap.put("status","success");
            returnMap.put("messsage","Employee deleted Successfully");
        }catch (Exception e){
            returnMap.put("status","failed");
            returnMap.put("messsage",e.getMessage());
        }

        return returnMap;
    }
}
