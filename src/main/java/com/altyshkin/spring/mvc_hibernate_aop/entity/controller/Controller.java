package com.altyshkin.spring.mvc_hibernate_aop.entity.controller;

import com.altyshkin.spring.mvc_hibernate_aop.entity.dao.EmployeeDao;
import com.altyshkin.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private EmployeeDao employeeDao;
    @RequestMapping("/")
    public String showAllEmployees(Model model){
       List<Employee> allEmployees =employeeDao.getAllEmployee();
       model.addAttribute("allEmps", allEmployees);
return "all-employees";
    }
}
