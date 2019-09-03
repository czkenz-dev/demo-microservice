package com.example.departmentservice.model;

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
