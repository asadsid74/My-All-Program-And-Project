package com.mapping1;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

@Entity
public class Project {
	@Id
	private int pid;
	@Column(name="project_name")
	private String projectName;
	@ManyToMany
	(mappedBy = "projects")
	private List<Employee> employees;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectName=" + projectName + ", employees=" + employees + ", getPid()="
				+ getPid() + ", getProjectName()=" + getProjectName() + ", getEmployees()=" + getEmployees()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	

}
