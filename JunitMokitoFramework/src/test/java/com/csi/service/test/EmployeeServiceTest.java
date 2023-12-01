package com.csi.service.test;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import com.csi.service.EmployeeService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Stream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeServiceTest {

    @Autowired
    EmployeeService employeeServiceImpl;

    @MockBean
    EmployeeRepo employeeRepoImpl;

    @Test
    public void findAllTest(){
        Mockito.when(employeeRepoImpl.findAll()).thenReturn(Stream.of(new Employee(101,"amol","pune",45000,8793932076l,"beamolpatil@gmail.com","amo458"),
                new Employee(102,"rahul","nashik",48000,9654782536l,"ARkhh@gmail.com","jfg4541")).toList());
        Assertions.assertEquals(2,employeeServiceImpl.findAll().size());
    }

    @Test
    public void saveTest(){
        Employee employee = new Employee(101,"amol","nashik",15400,78521456347l,"amol@gmail.com","jao147");
        employeeServiceImpl.signUp(employee);
        Mockito.verify(employeeRepoImpl,Mockito.times(1)).save(employee);
    }

    @Test
    public void deletebyidTest(){
        Employee employee = new Employee(101,"amol","nashik",15400,78521456347l,"amol@gmail.com","jao147");
        employeeServiceImpl.deleteById(employee.getEmpId());
        Mockito.verify(employeeRepoImpl,Mockito.times(1)).deleteById(employee.getEmpId());
    }





}
