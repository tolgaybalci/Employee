package com.tolgaybalci.employee.dao;

import com.tolgaybalci.employee.entity.Employee;
import com.tolgaybalci.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDao {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.delete(employeeRepository.getOne(id));
    }
}
