package com.bridgelabz.employeepayrollapp.controller;
import com.bridgelabz.employeepayrollapp.entity.EmployeePayroll;
import com.bridgelabz.employeepayrollapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeePayrollController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/employee")
  public List<EmployeePayroll>  getAllEmployee(){

    return employeeService.getAllEmployee();
  }


  @GetMapping("/employee/{id}")
  public EmployeePayroll getEmployeeById(@PathVariable int id)
  {

    return employeeService.getEmployeeById(id);
  }


  @PostMapping("/employee/add")
  @ResponseStatus(code = HttpStatus.CREATED)
  public void createEmployee(@RequestBody EmployeePayroll employee)
  {
    employeeService.createEmployee(employee);
  }

  @PutMapping("/employee/update/{id}")
  public EmployeePayroll  updateEmployee(@PathVariable int id)
  {
    return employeeService.updateEmployee(id);
  }

  @DeleteMapping("/employee/delete/{id}")
  public void removeEmployee(@PathVariable int id)
  {
    employeeService.removeEmployee(id);
  }


}



