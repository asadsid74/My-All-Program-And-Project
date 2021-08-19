package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.repository.StudentRepo;
import com.example.services.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentRepo repo;
	

	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	//create api save data
	
	@PostMapping()
	 public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		return new ResponseEntity<Student>(service.saveStudent(student),HttpStatus.CREATED);
		 
	 }
	
	//get all data
	@GetMapping()
	public List<Student> getAllStu(){
		return service.getAllStudent();
		
	}
	
	//get data by id
	@GetMapping("{id}")
	public Student getById(@PathVariable ("id")  Integer id) {
	return service.getById(id); 
	}
	
	//get data by email
	@GetMapping("/findbyemail/{email}")
	public Student getByEmail(@PathVariable ("email") String email) {
		return service.findByEmail(email);
	}
	
	
	//update data by id of the name
	@PutMapping("/update-student/{id}")
	public ResponseEntity <Student> updateStudent(@PathVariable ("id") Integer id,@RequestBody Student student) {
		return new ResponseEntity<Student>(service.updateStudent(student, id),HttpStatus.OK);
		
	}
	
	//delete data
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable ("id") Integer id){
		service.deleteStudent(id);
		return new ResponseEntity<String>("employee deleted successfully..", HttpStatus.OK);
		
	}
	
	
	
}
