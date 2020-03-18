package com.shalintha.employeeservice.shared_model;

import lombok.Data;

@Data
public class Allocation {

    private Integer id;
    private String name;
    private String start;
    private String end;

    Allocation[] allocations;
}
