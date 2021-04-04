package com.hql;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manager {
	@Id
	private int manager_id;

	private String manager_name;
	private String manager_address;
	private String manager_salary;
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getManager_address() {
		return manager_address;
	}
	public void setManager_address(String manager_address) {
		this.manager_address = manager_address;
	}
	public String getManager_salary() {
		return manager_salary;
	}
	public void setManager_salary(String manager_salary) {
		this.manager_salary = manager_salary;
	}
	@Override
	public String toString() {
		return "Manager [manager_id=" + manager_id + ", manager_name=" + manager_name + ", manager_address="
				+ manager_address + ", manager_salary=" + manager_salary + "]";
	}
	
}
