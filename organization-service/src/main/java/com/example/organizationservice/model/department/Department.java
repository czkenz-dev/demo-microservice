package com.example.organizationservice.model.department;

import com.example.organizationservice.model.employee.Employee;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Department {
    private String id;
    private String name;
    private String organizationId;
    private List<Employee> employees;
}
