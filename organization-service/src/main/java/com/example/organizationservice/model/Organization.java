package com.example.organizationservice.model;

import com.example.organizationservice.model.department.Department;
import com.example.organizationservice.model.employee.Employee;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Organization {
    @Id
    private String id;
    private String name;
    private String address;
    private List<Department> departments;
    private List<Employee> employees;
}
