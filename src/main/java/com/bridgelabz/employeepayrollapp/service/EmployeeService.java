package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.entity.EmployeePayroll;
import com.bridgelabz.employeepayrollapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService implements  EmployeeServiceImp{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeePayroll createEmployee(EmployeePayroll employeePayroll)
    {
     employeeRepository.save(employeePayroll);
    return  employeePayroll;
    }
    @Override
    public List<EmployeePayroll> getAllEmployee() {

        return employeeRepository.findAll();
    }

    @Override
    public EmployeePayroll getEmployeeById(int id) {
        return  employeeRepository.findById(id).get();
    }

    @Override
    public EmployeePayroll updateEmployee(int id) {
        return  employeeRepository.findById(id).get();
    }

    @Override
    public void removeEmployee(int id) {
    employeeRepository.deleteById(id);

   }
}
