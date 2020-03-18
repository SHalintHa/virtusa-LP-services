package com.shalintha.discoveryservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
public class Employee {

	private Integer id;
	private String name;

	Address address;

	List<Telephone> telephones;

	List<Project> projects;

}
