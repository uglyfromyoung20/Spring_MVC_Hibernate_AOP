package com.altyshkin.spring.mvc_hibernate_aop.entity.dao;

import com.altyshkin.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    public List<Employee> getAllEmployee();

  public  void saveEmployee(Employee employee);


  public  Employee getEmployee(int id);

  public  void deleteEmployee(int id);

}
