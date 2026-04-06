package com.nasinfo.aws.learn.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    protected Integer id;
    protected String name;
    protected String department;
    protected String location;
    protected Integer salary;
}
