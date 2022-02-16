package com.altyshkin.spring.mvc_hibernate_aop.entity.controller;

import com.altyshkin.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.altyshkin.spring.mvc_hibernate_aop.entity.service.EmployeeService;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/")
    public String showAllEmployees(Model model){
       List<Employee> allEmployees = employeeService.getAllEmployee();
       model.addAttribute("allEmps", allEmployees);
return "all-employees";
    }
}
