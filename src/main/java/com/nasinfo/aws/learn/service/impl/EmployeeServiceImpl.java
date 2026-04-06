package com.nasinfo.aws.learn.service.impl;

import com.nasinfo.aws.learn.entity.Employee;
import com.nasinfo.aws.learn.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getAllEmployees() {
        return List.of(
                new Employee(1, "Abraham", "HR", "Bangalore", 2000),
                new Employee(2, "Beyonce", "HR", "Bangalore", 5000),
                new Employee(3, "Christopher", "HR", "Mumbai", 2000),
                new Employee(4, "David", "HR", "Mumbai", 5000),
                new Employee(5, "Elijah", "Finance", "Bangalore", 2000),
                new Employee(6, "Fang", "Finance", "Bangalore", 6000),
                new Employee(7, "Greg", "Finance", "Mumbai", 2000),
                new Employee(8, "Hendricks", "Finance", "Mumbai", 8000),
                new Employee(9, "Ivan", "Admin", "Bangalore", 2000),
                new Employee(10, "John", "Admin", "Mumbai", 1000)
        );
    }
}
