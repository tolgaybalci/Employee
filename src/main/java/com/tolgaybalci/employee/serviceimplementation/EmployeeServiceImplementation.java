package com.tolgaybalci.employee.serviceimplementation;

import com.tolgaybalci.employee.dao.EmployeeDao;
import com.tolgaybalci.employee.entity.Employee;
import com.tolgaybalci.employee.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplementation implements IEmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDao.getAllEmployee();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeDao.getEmployeeById(id);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeDao.saveEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeDao.deleteEmployee(id);
    }
}
