package com.spring.jdbc.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Management;

public class StudentDaoiml implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	public int insert(Management man) {
		 String query="insert into management values(?,?,?,?)";
		 int n = this.jdbcTemplate.update(query,man.getId(),man.getName(),man.getState(),man.getAddress());
		return n;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

		
	}


