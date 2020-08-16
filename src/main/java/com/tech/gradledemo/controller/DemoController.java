package com.tech.gradledemo.controller;

import com.tech.gradledemo.model.Employee;
import com.tech.gradledemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    EmployeeRepository empRepo;

    @GetMapping
    public String getDemoMsg() {
        return "Entering app namaskar";
    }

    @GetMapping("/emp")
    public List<Employee> getAllEmp(){
        return empRepo.findAll();
    }
}
