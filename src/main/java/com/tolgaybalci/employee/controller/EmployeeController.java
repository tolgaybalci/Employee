package com.tolgaybalci.employee.controller;

import com.tolgaybalci.employee.entity.Employee;
import com.tolgaybalci.employee.serviceimplementation.EmployeeServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImplementation employeeServiceImplementation;

    @GetMapping
    public List<Employee> getAllEmployee(){ return employeeServiceImplementation.getAllEmployee(); }

    @PostMapping
    public ResponseEntity<Employee> saveEmployee(@Validated @RequestBody Employee employee){
        employeeServiceImplementation.saveEmployee(employee);
        return new ResponseEntity(null, HttpStatus.CREATED);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("employeeId") Long id){
        Employee employee = employeeServiceImplementation.getEmployeeById(id);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@Validated @RequestBody Employee employee){
        employeeServiceImplementation.updateEmployee(employee);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @DeleteMapping("/employee/{employeeId}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("employeeId") Long id){
        employeeServiceImplementation.deleteEmployee(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
