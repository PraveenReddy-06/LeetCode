package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.klu.model.Student;
import com.klu.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/greet")
	public String getWelcome() {
			return service.getWelcome();
	}
	
	@PostMapping("/students/add")
	public Student createStudent(@RequestBody Student s) {
		return service.createStudent(s);
	}
	
	@GetMapping("/student/getall")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/student/{id}")
	public Student getById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	
	@PutMapping("/student/update/{id}")
	public Student updateStudent(@PathVariable int id,@RequestBody Student s) {
		return service.updateStudent(id,s);
	}
	
	@DeleteMapping("/student/del/{id}")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}
	
	@GetMapping("/student/search")
	public List<Student> serachStudent(@RequestBody String n,@RequestBody String c){
		return service.searchStudent(n, c);
	}
	
	
}
