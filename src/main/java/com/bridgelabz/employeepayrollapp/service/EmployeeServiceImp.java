package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.entity.EmployeePayroll;

import java.util.List;

public interface EmployeeServiceImp {

    List<EmployeePayroll> getAllEmployee();

    EmployeePayroll getEmployeeById(int id);

    EmployeePayroll  updateEmployee(int id);

    EmployeePayroll createEmployee(EmployeePayroll employeePayroll);

    void removeEmployee(int id);
//    void removeEmployee(int id);
}
