package com.altyshkin.spring.mvc_hibernate_aop.entity.dao;

import com.altyshkin.spring.mvc_hibernate_aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public class EmployeeDaoImpl implements  EmployeeDao{
    @Autowired
private SessionFactory sessionFactory;
    @Override

    public List<Employee> getAllEmployee() {
    Session session = sessionFactory.getCurrentSession();

List<Employee> allEmployees = session.createQuery("from Employee"
        , Employee.class)
        .getResultList();

return allEmployees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
       session.save(employee);


    }
}
