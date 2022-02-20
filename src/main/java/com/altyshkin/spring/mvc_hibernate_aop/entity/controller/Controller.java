package com.altyshkin.spring.mvc_hibernate_aop.entity.controller;

import com.altyshkin.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.altyshkin.spring.mvc_hibernate_aop.entity.service.EmployeeService;
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return  "employee-info";

    }
@RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee")Employee employee){
    employeeService.saveEmployee(employee);
        return "redirect:/";
    }
    @RequestMapping("/updateInfo")
    public String updateEmployee(@RequestParam("empId") int id, Model model){
Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employee" ,employee);
        return  "employee-info";
    }
    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(@RequestParam("empId") int id){
        employeeService.deleteEmployee(id);
        return "redirect:/";
    }
}
