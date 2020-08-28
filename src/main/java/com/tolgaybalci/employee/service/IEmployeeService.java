package com.tolgaybalci.employee.service;

import com.tolgaybalci.employee.entity.Employee;

import java.util.List;

public interface IEmployeeService {

    List<Employee> getAllEmployee();

    Employee getEmployeeById(Long id);

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(Long id);
}
