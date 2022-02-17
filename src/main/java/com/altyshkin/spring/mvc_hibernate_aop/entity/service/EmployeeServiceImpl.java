package com.altyshkin.spring.mvc_hibernate_aop.entity.service;

import com.altyshkin.spring.mvc_hibernate_aop.entity.Employee;
import com.altyshkin.spring.mvc_hibernate_aop.entity.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    @Transactional
    public List<Employee> getAllEmployee() {
        return employeeDao.getAllEmployee();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);

        }
    }

