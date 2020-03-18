package com.shalintha.discoveryservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
public class Project {
	private Integer id;
	private String name;

	List<Employee> employees;

}
