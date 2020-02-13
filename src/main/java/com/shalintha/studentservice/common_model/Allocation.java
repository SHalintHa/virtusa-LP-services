package com.shalintha.studentservice.common_model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Allocation {
	
	int id;
	Integer studentId;
	String start;
	String end;
	String projectCode;
	
	
	public Allocation() {	}

	public Allocation(Integer id, Integer studentId, String start, String end, String projectCode) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.start = start;
		this.end = end;
		this.projectCode = projectCode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

}
