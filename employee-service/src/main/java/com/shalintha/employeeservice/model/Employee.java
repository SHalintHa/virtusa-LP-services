package com.shalintha.employeeservice.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;

import java.util.List;

@Entity
@Data
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	Address address;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	List<Telephone> telephones;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinTable(
			joinColumns = {@JoinColumn(name = "eid", referencedColumnName = "id")},
			inverseJoinColumns = {@JoinColumn(name = "pid", referencedColumnName = "id")}
			)
	List<Project> projects;

}
