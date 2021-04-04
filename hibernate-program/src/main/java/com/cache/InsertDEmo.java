package com.cache;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class InsertDEmo {
	@Id
	private String id;
	private String F_name;
	private String L_name;
	private String Address;
	private String M_number;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getF_name() {
		return F_name;
	}
	public void setF_name(String f_name) {
		F_name = f_name;
	}
	public String getL_name() {
		return L_name;
	}
	public void setL_name(String l_name) {
		L_name = l_name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getM_number() {
		return M_number;
	}
	public void setM_number(String m_number) {
		M_number = m_number;
	}
	public InsertDEmo(String id, String f_name, String l_name, String address, String m_number) {
		super();
		this.id = id;
		F_name = f_name;
		L_name = l_name;
		Address = address;
		M_number = m_number;
	}
	

}
