package com.csi.service;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepo employeeRepoImpl;

    public void signUp(Employee employee){
        employeeRepoImpl.save(employee);
    }

    public List<Employee> findAll(){
       return employeeRepoImpl.findAll();
    }

    public boolean signIn(String empEmailId,String empPassword){
        boolean flag = false;
        for(Employee employee : findAll()){
            if(employee.getEmpEmailId().equals(empEmailId) && employee.getEmpPassword().equals(empPassword)) {
                flag = true;
            }
        }
        return flag;
    }

    public List<Employee> findByName(String empName){
        return employeeRepoImpl.findByEmpName(empName);
    }

    public Optional<Employee> findById(int empId){
        return employeeRepoImpl.findById(empId);
    }

    public void deleteById(int empId){
        employeeRepoImpl.deleteById(empId);
    }

    public void deleteAll(){
        employeeRepoImpl.deleteAll();
    }
}
