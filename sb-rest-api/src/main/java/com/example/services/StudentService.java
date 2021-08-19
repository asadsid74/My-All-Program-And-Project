package com.example.services;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {
	
	Student saveStudent(Student student);

	List<Student> getAllStudent();
	
	Student getById(Integer id);
	
	Student findByEmail(String email);

	Student updateStudent(Student student, Integer id);
	
	void deleteStudent(Integer id);
}
