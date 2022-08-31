package com.mrunal.ATDev_Assignment;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {

	@Autowired
	StudentsService studentsService;

	@GetMapping("/students")
	ArrayList<Students> getStudentsInfo() {
		return studentsService.getStudentsInfo();

	}

	@PostMapping("/students")
	ArrayList<Students> addNewStudentsInfo(@RequestBody Students st) {
		return studentsService.addNewStudentsInfo(st);

	}

	@PutMapping("/students")
	ArrayList<Students> updateStudentsInfo(@RequestBody Students st) {
		return studentsService.updateStudentsInfo(st);

	}

	@DeleteMapping("/students/{id}")
	ArrayList<Students> deleteStudentsInfo(@PathVariable String id) {
		return studentsService.deleteStudentsInfo(id);

	}

}
