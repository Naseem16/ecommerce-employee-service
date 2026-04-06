package com.nasinfo.aws.learn.service;

import com.nasinfo.aws.learn.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
}
