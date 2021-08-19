package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.exception.ResourceNotFound;
import com.example.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {

	
	private StudentRepo repo;
	
	public StudentServiceImpl(StudentRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Student saveStudent(Student student) {
		
		return repo.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return repo.findAll();
	}

	@Override
	public Student getById(Integer id) {
		
	 return repo.findById(id).orElseThrow();
	}

	@Override
	public Student findByEmail(String email) {
		
		return repo.findByEmail(email);
	}

	@Override
	public Student updateStudent(Student student, Integer id) {
		
	Student stu= repo.findById(id).orElseThrow(()-> new ResourceNotFound("Student", "Id", id) );
	
	stu.setName(student.getName());
	return repo.save(stu);
		
	}

	@Override
	public void deleteStudent(Integer id) {
	
		repo.findById(id).orElseThrow(() ->new ResourceNotFound("Student", "Id", id));
		
		repo.deleteById(id);
	}

}
