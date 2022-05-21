package io.amit.rest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.amit.rest.StudentRepository;
import io.amit.rest.model.Student;

@RestController
@RequestMapping("/Student")

public class StudentController {

	@Autowired
	StudentRepository repository;

	private static final Logger log = LoggerFactory.getLogger(StudentController.class);

	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return repository.save(student);
	}

	@GetMapping
	public List<Student> getAllStudents() {
		log.info("finding all student");
		return repository.findAll();

	}

	@GetMapping("/{id}")
	public Student getStudentbyId(@PathVariable("id") Integer id) {
		System.out.println("id value ********* :" + id);
		return repository.findById(id).get();

	}

}
